package ejercicio2;

import ejercicio1.Estudiante;

public class TestListaEnlazadaGenerica {
	
	public static void main(String[] args) {
		Estudiante e1 = new Estudiante("mara", "lalala",1,"segui@","segui");
		Estudiante e2 = new Estudiante("bruno", "lalala",1,"segui@","segui");
		Estudiante e3 = new Estudiante("tobias", "lalala",1,"segui@","segui");
		Estudiante e4 = new Estudiante("kevin", "lalala",1,"segui@","segui");

		ListaEnlazadaGenerica<Estudiante> l = new ListaEnlazadaGenerica<Estudiante>();
		
		l.agregarFinal(e1);
		l.agregarFinal(e2);
		l.agregarFinal(e3);
		l.agregarFinal(e4);
		while (!l.fin()) {
			System.out.println(l.proximo().tusDatos());
		}
		
	}
	
}
