package ejercicio1;

import java.util.Scanner;

public class TestListaDeEnterosEnlazada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaDeEnterosEnlazada obj = new ListaDeEnterosEnlazada();
		
		Scanner consola = new Scanner(System.in);
		System.out.println("2");
		int num = 0;
		Integer Numero;
		while (num != 3) {
			Numero = consola.nextInt();
			num++;
			obj.agregarFinal(Numero);
		}
		obj.comenzar();
		while (obj.fin()) {
			System.out.println(obj.proximo());
		}
		

	}

}
