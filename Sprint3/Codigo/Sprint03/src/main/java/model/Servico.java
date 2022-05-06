package model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Servico {
	private int idServico;
    private String nome;
	private String setor;	
	private float valor;
    private String descricao;
    private Date tempoExecucao;
	
	public Servico() {
		idServico = 0;
		nome = "";
		setor = "";
		valor = 0;
		descricao = "";
	}

    public Servico(int idServico, String nome, String setor, float valor, String descricao, Date tempoExecucao) {
		setIdServico(idServico);
		setNome(nome);
		setSetor(setor);
		setValor(valor);
		setDescricao(descricao);
		setTempoExecucao(tempoExecucao);
	}		
	
	public int getIdServico() {
		return idServico;
	}

	public void setIdServico(int idServico) {
		this.idServico = idServico;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public float getValor() {
		return valor;
	}
	
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public String getDescricao() {
		return descricao;
	}

    public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
    public Date getTempoExecucao() {
		return tempoExecucao;
	}

    public void setTempoExecucao(Date tempoExecucao) {
		this.tempoExecucao = tempoExecucao;
	}

	/**
	 * Método sobreposto da classe Object. É executado quando um objeto precisa
	 * ser exibido na forma de String.
	 */
	@Override
	public String toString() {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		return "Id: " + idServico + "   Nome: " + nome + "   Setor: " + setor + "   Valor: "
				+ valor  + "   Descricao: " + descricao + "   Tempo de Execucao: " + sdf.format(tempoExecucao);
	}
	
	@Override
	public boolean equals(Object obj) {
		return (this.getIdServico() == ((Servico) obj).getIdServico());
	}	
}