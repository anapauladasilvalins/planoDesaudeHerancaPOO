package plano.saude;

public class Titular extends Dados {
	private String titular; 
	
	//M�TODO CONSTRUTOR
	public Titular(String empresa, String tipoPlano, int numCarteira, String nome, int idade, int validade) {
		super(empresa, tipoPlano, numCarteira, nome, idade, validade);
	}
	public void BeneficiarioTitular() {
		
	}
	
	//M�TODO ESPECIAL
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
	}
}
