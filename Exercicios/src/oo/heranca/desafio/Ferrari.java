package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo {

	private boolean ligarTurbo = false;
	private boolean ligarAr = false;
	
 	public Ferrari() {
		this(315);
	}
	
	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		setDelta(15);
	}
	
	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}
	
	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
	}
	
	@Override
	public void ligarAr() {
		ligarAr = true;
	}
	
	@Override
	public void deligarAr() {
		ligarAr = false;
	}
	
	@Override
	public int getDelta() {
		if (ligarTurbo && !ligarAr) {
			return 35;
		}else if (ligarTurbo && ligarAr) {
			return 30;
		} else if (!ligarTurbo && !ligarAr) {
			return 20;
		} else {
			return 15;
		}
	}
			
	
//	  @Override 
//	  public void frear() {
//		  if(velocidade >= 5) { velocidade -= 10; 
//		  	} else { velocidade = 0; 
//		  } 
//	  }
	 	
	@Override
	public String toString() {
		return "Velocidade atual Ferrari é " + velocidade + "Km/h.";
	}
}
