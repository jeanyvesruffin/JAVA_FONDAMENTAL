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
		// Character
		char defautU = 'U';
		System.out.println(defautU);
		// unicode
		char accentU = '\u00DA';
		System.out.println(accentU);
		// Boolean
		boolean jaimeJava = true;
		System.out.println(jaimeJava);

		// Affectation
		int premierNombre = 154;
		System.out.println(premierNombre);
		// return 154
		int secondNombre = premierNombre;
		System.out.println(secondNombre);
		// return 154
		premierNombre = 4;
		System.out.println(premierNombre);
		// return 4
		secondNombre = 655;
		System.out.println(secondNombre);
		// return 655
		int first = 13;
		int second = 5;
		int resultModulo = 0;
		resultModulo = first % second;
		System.out.println(resultModulo);
		int increm = 5;
		System.out.println(++increm);
		System.out.println(increm);
		int autreIncrem = 5;
		System.out.println(autreIncrem++);
		System.out.println(autreIncrem);
		int testAssign = 100;
		testAssign += 50;
		System.out.println(testAssign);
		int testAssignCompose = 100;
		int val1 = 5;
		int val2 = 10;
		testAssignCompose /= val1 * val2;
		System.out.println(testAssignCompose);
		int nbA = 21;
		int nbB = 6;
		int nbC = 3;
		int nbD = 1;
		int result1 = nbA - nbB / nbC;
		System.out.println(result1);
		//return 19
		int result2 = (nbA - nbB) / nbC;
		System.out.println(result2);
		//return 5
		int result3 = nbA / nbC * nbD + nbB;
		System.out.println(result3);
		//return 13
		int result4 = nbA / (nbC * (nbD + nbB));
		System.out.println(result4);
		//return 1
		
	}
}
