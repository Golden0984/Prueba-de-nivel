package model;

import java.util.Random;

public class Triangulos {
	
	public Triangulos() {
		Random rand = new Random();
		String nombre = "triangulo";
		area(nombre);
	}
	
	public void area(String nombre) {
		Random rand = new Random();
		int b = rand.nextInt(10);
		int h = rand.nextInt(10);
		
		int area = b*h/2;
		System.out.println("la base y altura del "+ nombre +" aleatorio es:");
		System.out.println("Base: "+b+" altura: "+ h);
		System.out.println("El area del "+ nombre+" es:" + area);
	}

}
