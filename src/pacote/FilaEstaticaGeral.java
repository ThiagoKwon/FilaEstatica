package pacote;

public abstract class FilaEstaticaGeral<T> {

	public boolean isFull(T[] data, int top) {
		return data.length == top;
	}

	public boolean isEmpty(T[] data, int top, int base) {
		return top == base;
	}

	public void exibirFila(T[] data) {
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}

}
