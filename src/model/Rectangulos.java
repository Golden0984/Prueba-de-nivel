package model;

import java.util.Random;

public class Rectangulos {

	public Rectangulos() {
		String nombre = "Rectangulo";
		area(nombre);
	}
	
	public void area(String nombre) {
		Random rand = new Random();
		
		int l1,l2,l3,l4 ;
		l1 = rand.nextInt(10);
		l2 = rand.nextInt(10);
		l3 = l1;
		l4 = l2;
		
		int area = l1 * l2;
		System.out.println("la base y altura del "+ nombre +" aleatorio es:");
		System.out.println("Base: "+l1+" altura: "+ l2);
		System.out.println("El area del "+ nombre+" es:" + area);
	}
}
