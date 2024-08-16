package pacote;

public class Main {

	public static void main(String[] args) {
		FilaEstatica<Long> fila = new FilaEstatica<Long>(5);

		fila.add(19L);
		fila.add(18L);
		fila.exibirFila(fila.getData());

		fila.remove();
		fila.exibirFila(fila.getData());

		fila.add(20L);
		fila.exibirFila(fila.getData());

		fila.clear();
		fila.exibirFila(fila.getData());


	}

}
