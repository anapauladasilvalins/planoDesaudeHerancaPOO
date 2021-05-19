package plano.saude;

public class Titular extends Dados {
	private String titular; 
	
	//MÉTODO CONSTRUTOR
	public Titular(String empresa, String tipoPlano, int numCarteira, String nome, int idade, int validade) {
		super(empresa, tipoPlano, numCarteira, nome, idade, validade);
	}
	public void BeneficiarioTitular() {
		
	}
	
	//MÉTODO ESPECIAL
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
	}
}
