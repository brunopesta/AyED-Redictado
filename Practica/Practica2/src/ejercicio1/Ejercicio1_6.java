package ejercicio1;

public class Ejercicio1_6 {

	private ListaDeEnterosEnlazada l = new ListaDeEnterosEnlazada();
	
	
	public ListaDeEnterosEnlazada sucesion (int n) {
		if (n != 1) {
			if ((n % 2) == 0) {
				n=(n/2);
			}else 
				n=((3*n)+1);
			
			l.agregarFinal(n);
			this.sucesion(n);
			}
		return l;
	}
	
	
	public static void main(String[] args) {
		
		Ejercicio1_6 ej = new Ejercicio1_6();
		ListaDeEnterosEnlazada l = ej.sucesion(6);
		System.out.println("Sucesion de N" + 6);
		l.comenzar();
		while (!l.fin()) {
			System.out.print(l.proximo() + "-");
		}
		
		
	}
}
