package plano.saude;

public class Dependentes extends Titular {
	//private boolean beneficiario;
	private int dependente;
	
	public Dependentes(String empresa, String tipoPlano, int numCarteira, String nome, int idade, int validade) {
		super(empresa, tipoPlano, numCarteira, nome, idade, validade);
	}
	public void beneficiario() {
		
	}
	public int getDependente() {
		return dependente;
	}
	public void setDependente(int dependente) {
		this.dependente = dependente;
		
	}
}
