package practica1;

public class Ejercicio1 {

	public static void ej1A(int a, int b) {
		for (int i = a; i <= b; i++) {
			System.out.println(i);
		}
	}
	
	
	public static void ej1B (int a, int b) {
		while (a <= b ) {
			System.out.println(a);
			a++;
		}	
	}
	
	public static Boolean ej1C(int a, int b) {
			Boolean sigue=true;
		if ( sigue) {
			System.out.println(a);
			ej1C(a,b);
		}else {
			sigue= false;
		}
		return false;
	}
}
