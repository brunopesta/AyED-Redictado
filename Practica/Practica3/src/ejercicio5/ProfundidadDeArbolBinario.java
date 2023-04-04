package ejercicio5;

import ejercicio2.ArbolBinario;

public class ProfundidadDeArbolBinario {

	private ArbolBinario<Integer> arbol;
	
	public ProfundidadDeArbolBinario(ArbolBinario<Integer> arbol) {
		this.arbol = arbol;
	}
	
	public int sumaElementosProfundidad(int p) {
		int suma = 0;
		ArbolBinario<Integer> arbol2;
		ColaGenerica<ArbolBinario<Integer>> cola = new ColaGenerica<ArbolBinario<Integer>>();
		cola.encolar(arbol);
		cola.encolar(null);
		if (arbol.esVacio())
			return -1;
		boolean ok = false;
		int nivel =0;
		
		while ((!cola.esVacia()) && !ok) {
			arbol2 = cola.desencolar();
			if ((arbol2!=null)) {
				if (nivel == p)
					suma += arbol2.getDato();
				if (arbol.tieneHijoIzquierdo())
					cola.encolar(arbol2.getHijoIzquierdo());
				if (arbol.tieneHijoDerecho())
					cola.encolar(arbol2.getHijoDerecho());
			}else {
				if (!cola.esVacia()) {
					cola.encolar(null);
					nivel++;
				}else
					if (nivel < p)
						suma = -1;
			}
			
			if (nivel > p)
				ok = true;
		}
		return suma;
	}

}
