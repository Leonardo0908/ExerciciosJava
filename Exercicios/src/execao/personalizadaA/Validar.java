package execao.personalizadaA;

import execao.Aluno;

public class Validar {

	private Validar() {}
	
	public static void Aluno(Aluno aluno) {
		
		if (aluno == null) {
			throw new IllegalArgumentException("O aluno está nulo!");
		}
		
		if (aluno.nome == null || aluno.nome.trim().isEmpty()) {
			throw new StringVaziaException("Nome");
		}
		
		if (aluno.nota < 0 || aluno.nota > 10) {
			throw new NumeroForaIntervaloException("Nota");
		}
	}
}
