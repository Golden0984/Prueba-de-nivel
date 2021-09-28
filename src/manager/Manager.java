package manager;

import java.util.Scanner;

import model.Circulos;
import model.Cuadrado;
import model.Rectangulos;
import model.Triangulos;

public class Manager {

	public Manager() {
		Scanner teclado = new Scanner(System.in);
		int opcion = 1;
		while(opcion!=0) {
			System.out.println();
			System.out.println("1- Crear Triangulo");
			System.out.println("2- Crear Cuadrado");
			System.out.println("3- Crear Rectangulo");
			System.out.println("4- Crear Circulo");
			System.out.println("0- Salir");
			opcion = teclado.nextInt();
			switch (opcion) {
			case 1:
				Triangulos T = new Triangulos();
				break;
			case 2:
				Cuadrado C = new Cuadrado();
				break;
			case 3:
				Rectangulos R = new Rectangulos();
				break;
			case 4:
				Circulos cir = new Circulos();
				break;
			case 0:
				System.out.println("Saliendo");
				break;
	
			default:
				System.out.println("Elige una de estas opciones");
				break;
			}
		}
		
	}
}
