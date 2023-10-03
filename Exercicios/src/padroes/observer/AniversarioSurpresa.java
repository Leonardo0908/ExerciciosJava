package padroes.observer;

public class AniversarioSurpresa {

	public static void main(String[] args) {
		//Namorada namorada = new Namorada();
		Porteiro porteiro = new Porteiro();
		
		//porteiro.registraObservador(namorada);
		
		porteiro.registraObservador(e -> {
			System.out.println("Surpresa via Lambda!"); 
			System.out.println("Ocorreu em:" + e.getMomento() ); 
		});
		porteiro.monitor();
	}
}
