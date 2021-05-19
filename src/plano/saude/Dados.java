package plano.saude;

public abstract class Dados {
	
	//ATRIBUTOS
	private String empresa;
	private String tipoPlano;
	private String nome;
	private int idade;
	private int validade;
	private int numCarteita;
	
	//M�TODO INTERNO
	public void carteira() {
		this.numCarteita++;
	}
	
	//M�TODO CONSTRUTOR
	public Dados(String empresa, String tipoPlano, int numCarteira, String nome, int idade, int validade) {
		this.empresa = empresa;
		this.tipoPlano = tipoPlano;
		this.numCarteita = numCarteira;
		this.nome = nome;
		this.idade = idade;
		this.validade = validade;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getTipoPlano() {
		return tipoPlano;
	}

	public void setTipoPlano(String tipoPlano) {
		this.tipoPlano = tipoPlano;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getValidade() {
		return validade;
	}

	public void setValidade(int validade) {
		this.validade = validade;
	}

	public int getNumCarteita() {
		return numCarteita;
	}

	public void setNumCarteita(int numCarteita) { // faser uma condi��o contendo 8 numeros, sen�o numero invalido
		this.numCarteita = numCarteita;
	}

	@Override
	public String toString() {
		return "========================DADOS===========================" 
	+ "\n EMPRESA: " + empresa 
				+ "\n PLANO: " + tipoPlano 
				+ "\n NOME: " + nome 
				+ "\n IDADE: " + idade
				+ "\n VALIDADE: " + validade 
				+ "\n N�MERO: " + numCarteita;
	}
}
