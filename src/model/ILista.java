package model;

public interface ILista {

	public boolean isEmpty();
	public int size();
	public void addFirst(int valor);
	public void addLast(int valor) throws Exception;
	public void add(int valor, int pos) throws Exception;
	public void removeFirst() throws Exception;
	public void removeLast() throws Exception;
	public void remove(int pos) throws Exception;
	public int get(int pos) throws Exception;
	
}
