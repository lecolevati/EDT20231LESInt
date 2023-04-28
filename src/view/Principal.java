package view;

import model.ILista;
import model.Lista;

public class Principal {

	public static void main(String[] args) {
		ILista lista = new Lista();
		try {
			lista.addFirst(1);
			lista.addLast(2);
			lista.add(10, 1);
			lista.add(50, 3);
			lista.addFirst(500);
			int valor = lista.get(2);
			System.out.println(valor);
			lista.removeFirst();
			lista.removeLast();
			lista.remove(1);
			valor = lista.get(0);
			System.out.println(valor);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
