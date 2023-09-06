package oo.encapsulamento;

public class Pessoa {
	
	private String nome;
	private String sobreNome;
	private int idade;
	
	public Pessoa(String nome, String sobreNome, int idade) {
		setSobreNome(sobreNome);
		setNome(nome);
		setIdade(idade);
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// Getter
	public int getIdade() {
		return idade;
	}
	
	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	
	public String getNomeCompleto() {
		return getNome() + " " + getSobreNome();
	}

	// Setter
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if(novaIdade >= 0 && novaIdade <= 130) {
			this.idade = novaIdade;
		}
	}
	
	@Override
	public String toString() {
		return "Olá eu sou o " +getNome() + " e tenho " + getIdade() + " anos. " ;
	}

}
