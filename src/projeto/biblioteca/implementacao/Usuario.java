package projeto.biblioteca.implementacao;

public class Usuario {
	//ATRIBUTOS
	private String nome;
	private String endereco;
	private int contato;
	
//M�TODO P�BLICO
public void dadosUso() {
	System.out.println(" ");
	System.out.println("============== �LTIMO USU�RIO=================");
	System.out.println("\nNOME: " + nome);
	System.out.println("\nENDERE�O: " + endereco); 
	System.out.println("\nCONTATO: " + contato); 
}
	
	//M�TODO CONSTRUTOR
	public Usuario(String nome, String endereco, int contato) { // talvez erroc
		this.nome = nome;
		this.endereco = endereco;
		this.contato = contato;
	}
	
	//M�TODOS ESPECIAIS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getContato() {
		return contato;
	}

	public void setContato(int contato) {
		this.contato = contato;
	}
	
	//IMPLEMENTA��O
}
