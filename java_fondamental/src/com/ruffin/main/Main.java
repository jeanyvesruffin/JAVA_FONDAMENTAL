package com.ruffin.main;

public class Main {
	/**
	 * Ceci est un commentaire qui ne sera pas compilé mais generera la doc java
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Declaration variable + initilisation
		int unNombre = 150;
		// Declaration variable final + initilisation
		final int unNombreMax = 1548;

		System.out.println("Test first line comment"); // Ce commentaire ne sera pas compile
		/*
		 * Ce bloc de commentaire ne sera pas compile
		 */
		System.out.println("Hello world");
		// Utilisation de la variable unNombre
		System.out.println(unNombre);
		System.out.println(unNombreMax);
		// Utilisation des types primitifs
		// Integer byte
		byte nombreDeLettreFrencais = 26;
		System.out.println(nombreDeLettreFrencais);
		// Integer short
		short rayonTerre = 6371;
		System.out.println(rayonTerre);
		int distanceMarsSoleil = 228000000;
		System.out.println(distanceMarsSoleil);
		long distanceOrion = 12710000000000000L;
		System.out.println(distanceOrion);
		// Interger float
		float precisionLaser = 12.215478f;
		System.out.println(precisionLaser);
		// Interger double
		double tailleAtomeMetre = 0.00000000001d;
		System.out.println(tailleAtomeMetre);
	}

}
