package ejercicio4;

import ejercicio2.ArbolBinario;

public class RedBinariaLlena {

	
	private ArbolBinario<Integer> arbol;
	
	public RedBinariaLlena(ArbolBinario<Integer> arbol) {
		this.arbol = arbol;
	}
	
	public int retardoReenvio() {
		return retardoReenvio(arbol);
	}
	
	private  int retardoReenvio(ArbolBinario<Integer> arbol) {
		
		if (this.arbol.esVacio())
			return -1;
		
		int cant = -1;
		
		if(arbol.esHoja()) {
			
			return arbol.getDato();
		}else {
			if(arbol.tieneHijoIzquierdo())
				cant = Math.max(cant, retardoReenvio(arbol.getHijoIzquierdo()));
			if(arbol.tieneHijoDerecho())
				cant= Math.max(cant, retardoReenvio(arbol.getHijoDerecho()));
		}
		
		
		System.out.println("Mara bombon");
		return cant + arbol.getDato();
	
		
	}
	
}
