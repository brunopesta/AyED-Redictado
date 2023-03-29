package ejercicio3;

import ejercicio2.ListaEnlazadaGenerica;
import ejercicio2.ListaGenerica;

public class PilaGenerica<T> {

	
	private ListaGenerica<T> dato = new ListaEnlazadaGenerica<T>();
	
	public void apilar(T elem) {
		dato.agregarInicio(elem);
	}
	
	public T desapilar() {
		T x = this.dato.elemento(1);
		this.dato.eliminarEn(1);
		return x;
	}
	
	public T tope() {
		return this.dato.elemento(1);
	}
	
	public boolean esVacia() {
		return this.dato.tamanio() == 0;
	}
}
