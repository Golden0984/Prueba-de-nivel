package model;

import java.util.Random;

public class Cuadrado {
	
	public Cuadrado() {
		String nombre = "Cuadrado";
		area(nombre);

	}
	public void area(String nombre) {
		Random rand = new Random();
		int l1,l2 ,l3,l4;
		l1 = rand.nextInt(10);
		l2 = l1;
		l3 = l1;
		l4=l1;
		
		int area = 4*l1;
		System.out.println("los lados del "+ nombre +" aleatorio es: ");
		System.out.println(l1);
		System.out.println("El area del "+ nombre+" es:" + area);
	}
}
