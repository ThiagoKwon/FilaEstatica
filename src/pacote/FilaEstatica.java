package pacote;

public class FilaEstatica<T> extends FilaEstaticaGeral<T> implements FilaEstaticaInterface<T> {

	private int top = 0;

	private int base = 0;

	private int size = 0;

	private T[] data;

	public FilaEstatica(int size) {
		setData((T[]) new Long[size]);
		this.setSize(size);
	}

	@Override
	public void add(T data) {
		if (isFull(getData(), getTop())) {
			throw new IllegalAccessError("Fila cheia!");
		}
		getData()[getTop()] = data;
		setTop(getTop() + 1);
	}

	@Override
	public T remove() {
		if (isEmpty(getData(), getTop(), getBase())) {
			throw new IllegalAccessError("Fila já está vazia!");
		}
		T retorno = getData()[getBase()];
		getData()[getBase()] = null;
		setBase(getBase() + 1);
		return retorno;
	}

	@Override
	public void clear() {
		for (int i = 0; i < getData().length; i++) {
			getData()[i] = null;
		}
		setTop(0);
		setBase(0);
	}

//===================================================================
	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public T[] getData() {
		return data;
	}

	public void setData(T[] data) {
		this.data = data;
	}

}
