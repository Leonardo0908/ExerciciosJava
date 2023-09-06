package oo.encapsulamento;

public class PessoaTeste {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Pedro", "amoedo", -70);
		//p1.idade = -30;  // alterar 
		
		p1.setIdade(230);
		
		System.out.println(p1.getIdade());  // ler
		System.out.println(p1);  // ler
		System.out.println(p1.getNomeCompleto());  // ler
		
	}

}
