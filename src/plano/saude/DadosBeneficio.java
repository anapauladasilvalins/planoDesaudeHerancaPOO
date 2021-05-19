package plano.saude;

public class DadosBeneficio {

	public static void main(String[] args) {
		//PROGRAMA PRINCIPAL
	
		Titular t1 = new Titular("BAC ", " Empresarial ", 28712356, " Jubileu Silva ", 40, 2023);
		Dependentes d1 = new Dependentes("BAC "," Empresarial ", 28792465, " Jubileu Jr ", 12, 2023);
		Dependentes d2= new Dependentes("BAC", "Empresarial", 28345, "Maroca Silva ", 35, 2023);
		
		// ToString()
		System.out.println(t1.toString());
		t1.BeneficiarioTitular();
		
		System.out.println(d1.toString());
		d1.beneficiario();
		
		System.out.println(d2.toString());
		d2.beneficiario();
	}

}
