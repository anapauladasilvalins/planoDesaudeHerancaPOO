package projeto.biblioteca.implementacao;

public class DadosEmprestimo {

	public static void main(String[] args) {
		
		Usuario[] uso = new Usuario[4];
		Livro[] livro = new Livro[3];
		
		livro[0] = new Livro("A Arte de Educar ", " Jos� Bezerra ", 2009, " Ci�ncias Humanas", true, uso[1]);
		livro[1] = new Livro("Java B�sico "," Gustavo Guanabara ", 2015," Ci�ncias Exatas e da Terra", false, uso[0]);
		livro[2] = new Livro("Anatomia Humana ", "Ana Lins ", 2021," Ci�ncias da Sa�de", true, uso[2]);

		uso[0] = new Usuario("Jubiscreuza Lima"," Rua n�mero sete,n� 34, S�o Paulo-SP ", 987624567);
		uso[1] = new Usuario("Jubileu Carvalho", " Av. Tatu Bola, n� 02, S�o Paulo-SP ", 967834512);
		uso[2] = new Usuario("Creuza Caruzzo ", "Rua da Cocada, n� 00, S�o Paulo-SP ", 956784321);
		uso[3] = new Usuario("Maroca Santos ", "Rua da Direita, n� 01, S�o Paulo-SP ", 901234567);
		
		livro[2].emprestimo();
		livro[2].dados();
		uso[3].dadosUso();
		
		
	}

}
