package com.ruffin.main;

public class Main {
/**
 * Ceci est un commentaire qui ne sera pas compilé mais generera la doc java
 * @param args
 */
	public static void main(String[] args) {
		// Declaration variable + initilisation
		int unNombre = 150;
		
		System.out.println("Test first line comment"); // Ce commentaire ne sera pas compile
		/*
		 * Ce bloc de commentaire ne sera pas compile
		 */
		System.out.println("Hello world");
		// Utilisation de la variable unNombre
		System.out.println(unNombre);

	}

}
