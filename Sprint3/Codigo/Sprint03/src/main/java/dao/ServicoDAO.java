package dao;

import model.Servico;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;


public class ServicoDAO extends DAO {	
	public ServicoDAO() {
		super();
		conectar();
	}
	
	
	public void finalize() {
		close();
	}
	
	
	public boolean insert(Servico servico) {
		boolean status = false;
		try {
			String sql = "INSERT INTO servico (descricao, preco, quantidade, datafabricacao, datavalidade) "
		               + "VALUES ('" + servico.getNome() + "', "
		               + servico.getValor() + ", " + servico.getDescricao() + ", "
		               +servico.getTempoExecucao()+", "
		               +servico.getSetor() + ", ?, ?);";
			PreparedStatement st = conexao.prepareStatement(sql);
		    /*st.setTimestamp(1, Timestamp.valueOf(servico.getTempoExecucao()));
			st.setDate(2, Date.valueOf(servico.getDataValidade()));*/
			st.executeUpdate();
			st.close();
			status = true;
		} catch (SQLException u) {  
			throw new RuntimeException(u);
		}
		return status;
	}

	
	public Servico get(int id) {
		Servico servico = null;
		
		try {
			Statement st = conexao.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			String sql = "SELECT * FROM servico WHERE id="+id;
			ResultSet rs = st.executeQuery(sql);	
	        if(rs.next()){            
	        	 servico = new Servico(rs.getInt("id"),rs.getString("nome"),rs.getString("setor"),rs.getFloat("valor"),rs.getString("descricao"),rs.getDate("tempoExecucao"));
	        }
	        st.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return servico;
	}
	
	
	public List<Servico> get() {
		return get("");
	}

	
	public List<Servico> getOrderByID() {
		return get("id");		
	}
	
	
	public List<Servico> getOrderByDescricao() {
		return get("descricao");		
	}
	
	
	public List<Servico> getOrderByValor() {
		return get("preco");		
	}
	
	
	private List<Servico> get(String orderBy) {
		List<Servico> servicos = new ArrayList<Servico>();
		
		try {
			Statement st = conexao.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			String sql = "SELECT * FROM servico" + ((orderBy.trim().length() == 0) ? "" : (" ORDER BY " + orderBy));
			ResultSet rs = st.executeQuery(sql);	           
	        while(rs.next()) {	            	
	        	Servico p = new Servico(rs.getInt("id"),rs.getString("nome"),rs.getString("setor"),rs.getFloat("valor"),rs.getString("descricao"),rs.getDate("tempoExecucao"));
	            servicos.add(p);
	        }
	        st.close();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return servicos;
	}
	
	
	public boolean update(Servico servico) {
		boolean status = false;
		try {  
			String sql = "UPDATE servico SET descricao = '" + servico.getDescricao() + "', "
					   + "preco = " + servico.getValor() + ", " 
					   + "quantidade = " + servico.getSetor() + ","
					   + "datafabricacao = ?, " 
					   + "datavalidade = ? WHERE id = " + servico.getIdServico();
			PreparedStatement st = conexao.prepareStatement(sql);
		    st.setTimestamp(1, Timestamp.valueOf(servico.getTempoExecucao()));
			st.executeUpdate();
			st.close();
			status = true;
		} catch (SQLException u) {  
			throw new RuntimeException(u);
		}
		return status;
	}
	
	
	public boolean delete(int id) {
		boolean status = false;
		try {  
			Statement st = conexao.createStatement();
			st.executeUpdate("DELETE FROM servico WHERE id = " + id);
			st.close();
			status = true;
		} catch (SQLException u) {  
			throw new RuntimeException(u);
		}
		return status;
	}
}