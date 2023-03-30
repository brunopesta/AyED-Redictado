package ejercicio3;

import ejercicio2.ArbolBinario;
import ejercicio1.ListaGenerica;
public class TestContadorArbol {

	public static void main(String[] args) {
		ArbolBinario<Integer> a = new ArbolBinario<Integer>(2); 
		ArbolBinario<Integer> b = new ArbolBinario<Integer>(4); 
		ArbolBinario<Integer> c = new ArbolBinario<Integer>(6); 
		ArbolBinario<Integer> d = new ArbolBinario<Integer>(8); 
		ArbolBinario<Integer> e = new ArbolBinario<Integer>(10);
		
		a.agregarHijoIzquierdo(b);
		a.agregarHijoDerecho(c);
		b.agregarHijoIzquierdo(d);
		b.agregarHijoDerecho(e);
		
		ContadorArbol test = new ContadorArbol(a);
		
		ListaGenerica<Integer> l = test.numerosPares();
		
		System.out.println(l.toString());

	}

}
