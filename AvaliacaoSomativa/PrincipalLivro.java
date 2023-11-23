package AvaliacaoSomativa;

public class PrincipalLivro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Livro livro = new Livro("O cortiço", "Aluisio de Azevedo", 180);
		System.out.println("Nome: "+livro.getNome());
		System.out.println("Autor: " +livro.getAutor());
		System.out.println("Número de páginas:"+livro.getPaginas());
	}

}
