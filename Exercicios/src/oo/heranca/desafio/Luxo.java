package oo.heranca.desafio;

public interface Luxo {
	
	public void ligarAr();
	abstract void deligarAr();

	default int velocidadeDoAr() {
		return 1;
	}
}
