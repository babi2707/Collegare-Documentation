package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.User;

public class UserDAO extends DAO {	
	public UserDAO() {
		super();
		conectar();
	}
	
	public void finalize() {
		close();
	}
	
	public boolean insert(User user) {
		boolean status = false;
		try {
			String sql = "INSERT INTO users (id, userName, email, cpf, cellphone, address, userPass) VALUES (4, '" + user.getUserName() + "', '" + user.getEmail() + "', '" + user.getCPF() + "', '" + user.getCellphone() + "', '" + user.getAddress() + "', '" + user.getUserPass() + "')";	
	
			PreparedStatement st = conexao.prepareStatement(sql);
		    st.executeUpdate();
			st.close();
			status = true;
		} catch (SQLException u) {  
			throw new RuntimeException(u);
		}
		return status;
	}
	
}
	
	
