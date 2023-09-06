package oo.heranca.desafio;

public class Civic extends Carro {

	public Civic() {
		this(200);
	}
	
	public Civic(int velocidadeMaxima) {
		super(velocidadeMaxima);
	}
	
	@Override
	public String toString() {
		return "Velocidade atual Civic é " + velocidade + "Km/h.";
	}
}
