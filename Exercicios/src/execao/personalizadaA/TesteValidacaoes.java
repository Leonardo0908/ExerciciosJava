package execao.personalizadaA;

import execao.Aluno;

public class TesteValidacaoes {

	public static void main(String[] args) {
		
		
			try {
				Aluno aluno = new Aluno("Ana", 7);
				Validar.Aluno(aluno);
				
				Validar.Aluno(null);
			} catch (StringVaziaException e) {
				System.out.println(e.getMessage() );
			} catch(NumeroForaIntervaloException | IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		
		
		System.out.println("Fim :");
	}
}
