package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioLivros {
	
	public static void main(String[] args) {
		
		Livro l1 = new Livro("Biblia ",     300.0, 0, 10);
		Livro l2 = new Livro("Anatomia ",    150.0, 1, 9);
		Livro l3 = new Livro("Biologia ",    200.0, 2, 4);
		Livro l4 = new Livro("C ",            90.0, 3, 8);
		Livro l5 = new Livro("Java ",        120.0, 4, 3);
		Livro l6 = new Livro("Fisica ",       30.0, 5, 5);
		Livro l7 = new Livro("Historia ",     80.0, 6, 1);
		Livro l8 = new Livro("João e Maria ", 20.0, 7, 2);
		
		List<Livro> livros = Arrays.asList(l1, l2, l3, l4, l5, l7, l8);
		
		Predicate<Livro> quanti = l -> l.quantidade >= 5;
		Predicate<Livro> valor = l -> l.preco > 100;
		Function<Livro, String> formato = 
				l -> l.nome + " tem valor de R$" + l.preco 
				+ " tem codigo " + l.codigo 
				+ " tem essa quantidade " + l.quantidade;
		Function<Livro, String> codigo = 
				l -> l.nome + " tem codigo " + l.codigo;
		Function<Livro, String> Vquanti = 
				l -> l.nome + " tem essa quantidade " + l.quantidade;
		
		
		livros.stream()
		.filter(valor)
		.map(formato)
		.forEach(System.out::println);

		livros.stream()
		.filter(quanti)
		.filter(valor)
		.map(Vquanti)
		.forEach(System.out::println);

		livros.stream()
		.filter(quanti)
		.filter(valor)
		.map(codigo)
		.forEach(System.out::println);
		
	}
}
