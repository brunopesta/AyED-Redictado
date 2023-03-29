package ejercicio1;

import java.util.Scanner;

public class TestListaDeEnterosConArreglos {

	public static void main(String[] args) {
		int num =0;
		Scanner consola = new Scanner(System.in);
		System.out.println("Entre!!!");
		ListaDeEnterosConArreglos obj = new ListaDeEnterosConArreglos ();
		Integer numero;
		while (num < 3) {
			System.out.println("Entre!!!");
			numero= consola.nextInt();
			num++;
			obj.agregarFinal(numero);
		}
		
		obj.comenzar();
		while (!obj.fin()) {
			System.out.println(obj.proximo());
		}
	}

}
