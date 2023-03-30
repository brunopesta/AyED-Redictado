package ejercicio2;

import ejercicio1.ListaEnlazadaGenerica;

public class ColaGenerica<T> {

	private ListaEnlazadaGenerica<T> dato = new ListaEnlazadaGenerica<T>();
	
	
	public void encolar (T elem) {
		dato.agregarFinal(elem);
	}
	
	public T desencolar() {
		T x = this.dato.elemento(1);
		this.dato.eliminarEn(1);
		return x;
	}
	
	public T tope() {
		return this.dato.elemento(1);
		
	}
	
	public boolean esVacia() {
		return dato.tamanio() == 0;
	}
}


