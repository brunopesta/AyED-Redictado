package ejercicio3;

import ejercicio1.ListaEnlazadaGenerica;
import ejercicio2.ArbolBinario;

public class ContadorArbol {

	private ArbolBinario<Integer> arbol;
	
	public ContadorArbol(ArbolBinario<Integer> a) {
		this.arbol = a;
	}
	
	
	public ListaEnlazadaGenerica<Integer> numerosPares(){
		ListaEnlazadaGenerica<Integer> lista = null;
		
		recorridoInOrden(lista,arbol);
		//recorridoPosOrden(lista,arbol);
		return lista;
		
	}
	
	private void recorridoInOrden(ListaEnlazadaGenerica<Integer> lista,ArbolBinario<Integer> arbol) {
		if (this.arbol.tieneHijoIzquierdo())
			recorridoInOrden(lista,this.arbol.getHijoIzquierdo());
		if (this.arbol.getDato() % 2 == 0)
			lista.agregarFinal(this.arbol.getDato());
		if (this.arbol.tieneHijoDerecho())
			recorridoInOrden(lista,this.arbol.getHijoDerecho());
	}
	
	
	private void recorridoPosOrden(ListaEnlazadaGenerica<Integer> lista,ArbolBinario<Integer> arbol) {
		if (this.arbol.tieneHijoIzquierdo())
			recorridoPosOrden(lista,this.arbol.getHijoIzquierdo());
		if (this.arbol.tieneHijoDerecho())
			recorridoPosOrden(lista,this.arbol.getHijoDerecho());
		if (this.arbol.getDato() % 2 == 0)
			lista.agregarFinal(this.arbol.getDato());
	}
}
