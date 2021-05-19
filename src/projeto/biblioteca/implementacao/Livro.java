package projeto.biblioteca.implementacao;

public class Livro implements Dados {
	//ATRIBUTOS
	private String titulo;
	private String autor;
	private int anoPublicacao;
	private String categoria; 
	private boolean emprestado; 
	private Usuario leitor; 

	//M�TODO P�BLICO
	public void dados() {
			System.out.println(" ");
			System.out.println("==================LIVRO======================");
			System.out.println("\nT�TULO: " + titulo);
			System.out.println("\nAUTOR: " + autor); 
			System.out.println("\nANO DE PUBLICA��O: " + anoPublicacao); 
			System.out.println("\nCATEGORIA:" + categoria);
			System.out.println("\nDEVOLU��O: " + getEmprestado());  
			}
	
	//M�TODO CONSTRUTOR
	public Livro(String titulo, String autor, int anoPublicacao, String categoria,boolean emprestado, Usuario leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		this.categoria = categoria;
		this.emprestado = emprestado; 
		this.leitor = leitor;
	}

	//M�TODO ESPECIAL
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Usuario getLeitor() {
		return leitor;
	}

	public void setLeitor(Usuario leitor) { 
		this.leitor = leitor; 
		}
	
	public boolean getEmprestado() {     // is/get 
		return emprestado;
	}

	public void setEmprestado(boolean emprestado) { 
		
		this.emprestado = emprestado; // 
	}
	
	// IMPLEMENTA��O 
	
	@Override
	public void tipoLivro() {
		this.categoria = categoria; // talvez erro
	}

	@Override
	public void emprestimo() {
		System.out.println(" ");
		
		if(this.getEmprestado() == false) { 
			System.out.println("LIVRO INDIPON�VEL NO MOMENTO ");
			
		} else {
			this.emprestado = true;
			System.out.println("LIVRO DISPON�VEL NA BIBLIOTECA");
		}
		
		}

	@Override
	public void usar() {
		// TODO Auto-generated method stub
		
	}

}
	
	
