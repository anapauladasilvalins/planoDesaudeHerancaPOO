package projeto.biblioteca.implementacao;

public class DadosEmprestimo {

	public static void main(String[] args) {
		
		Usuario[] uso = new Usuario[4];
		Livro[] livro = new Livro[3];
		
		livro[0] = new Livro("A Arte de Educar ", " José Bezerra ", 2009, " Ciências Humanas", true, uso[1]);
		livro[1] = new Livro("Java Básico "," Gustavo Guanabara ", 2015," Ciências Exatas e da Terra", false, uso[0]);
		livro[2] = new Livro("Anatomia Humana ", "Ana Lins ", 2021," Ciências da Saúde", true, uso[2]);

		uso[0] = new Usuario("Jubiscreuza Lima"," Rua número sete,nº 34, São Paulo-SP ", 987624567);
		uso[1] = new Usuario("Jubileu Carvalho", " Av. Tatu Bola, nº 02, São Paulo-SP ", 967834512);
		uso[2] = new Usuario("Creuza Caruzzo ", "Rua da Cocada, nº 00, São Paulo-SP ", 956784321);
		uso[3] = new Usuario("Maroca Santos ", "Rua da Direita, nº 01, São Paulo-SP ", 901234567);
		
		livro[2].emprestimo();
		livro[2].dados();
		uso[3].dadosUso();
		
		
	}

}
