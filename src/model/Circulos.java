package model;

import java.util.Random;

public class Circulos {

	public Circulos() {
		String nombre = "Circulo";
		area(nombre);
	}
	public void area(String nombre) {
		Random rand = new Random();
		
		int r = rand.nextInt(10);
		
		double area = Math.PI * r;
		System.out.println("El radio del "+ nombre +" aleatorio es:");
		System.out.println("radio"+r);
		System.out.println("El area del "+ nombre+" es:" + area);
	}
}
