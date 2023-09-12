package generics;

import java.util.Objects;

public class Par<C, V> {

	private C chave;
	private V Valor;
	
	public Par(C chave, V valor) {
		super();
		this.chave = chave;
		Valor = valor;
	}

	public C getChave() {
		return chave;
	}
	public void setChave(C chave) {
		this.chave = chave;
	}
	public V getValor() {
		return Valor;
	}
	public void setValor(V valor) {
		Valor = valor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(chave);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Par<?, ?> other = (Par<?, ?>) obj;
		return Objects.equals(chave, other.chave);
	}
	
	
}
