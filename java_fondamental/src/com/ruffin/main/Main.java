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
		System.out.println("un nombre :"+unNombre);
		System.out.println("une constante :"+unNombreMax);
		// Utilisation des types primitifs
		// Integer byte
		byte nombreDeLettreFrencais = 26;
		System.out.println("un type byte :"+nombreDeLettreFrencais);
		// Integer short
		short rayonTerre = 6371;
		System.out.println("un type short :"+rayonTerre);
		int distanceMarsSoleil = 228000000;
		System.out.println("un type int :"+distanceMarsSoleil);
		long distanceOrion = 12710000000000000L;
		System.out.println("un type long :"+distanceOrion);
		// Interger float
		float precisionLaser = 12.215478f;
		System.out.println("un type float :"+precisionLaser);
		// Interger double
		double tailleAtomeMetre = 0.00000000001d;
		System.out.println("un type double :"+tailleAtomeMetre);
		// Character
		char defautU = 'U';
		System.out.println("un type char :"+defautU);
		// unicode
		char accentU = '\u00DA';
		System.out.println("un type char unicode :"+accentU);
		// Boolean
		boolean jaimeJava = true;
		System.out.println("un type boolean :"+jaimeJava);

		// Affectation
		int premierNombre = 154;
		System.out.println("affectation :"+premierNombre);
		// return 154
		int secondNombre = premierNombre;
		System.out.println("affectation par copie :"+secondNombre);
		// return 154
		premierNombre = 4;
		System.out.println("affectation 1er nbre :"+premierNombre);
		// return 4
		secondNombre = 655;
		System.out.println("affectation 2eme nbre :"+secondNombre);
		// return 655
		int first = 13;
		int second = 5;
		int resultModulo = 0;
		resultModulo = first % second;
		System.out.println("resultat 13%5 :"+resultModulo);
		int increm = 5;
		System.out.println("5 incremente :"+ ++increm);
		System.out.println("valeur de la variable precedenment incremente :" + increm);
		int autreIncrem = 5;
		System.out.println("5 incremente de l'autre cote :"+ autreIncrem++);
		System.out.println("valeur de la variable precedenment incremente :" + autreIncrem);
		int testAssign = 100;
		testAssign += 50;
		System.out.println("+=" + testAssign);
		int testAssignCompose = 100;
		int val1 = 5;
		int val2 = 10;
		testAssignCompose /= val1 * val2;
		System.out.println("/= val1 * val2 :" + testAssignCompose);
		int nbA = 21;
		int nbB = 6;
		int nbC = 3;
		int nbD = 1;
		int result1 = nbA - nbB / nbC;
		System.out.println("Calcule nbA - nbB / nbC :" + result1);
		//return 19
		int result2 = (nbA - nbB) / nbC;
		System.out.println("(nbA - nbB) / nbC :" + result2);
		//return 5
		int result3 = nbA / nbC * nbD + nbB;
		System.out.println(result3);
		//return 13
		int result4 = nbA / (nbC * (nbD + nbB));
		System.out.println("nbA / (nbC * (nbD + nbB)) :" + result4);
		//return 1
		// Transtypage 
		int myValue = 50 ;
		System.out.println("affectation int :" + myValue);
		// return 50
		long longValue = myValue;
		System.out.println("affectation long :" +longValue);
		// return 50
		long longValueDeux = 50;
		System.out.println("affectation long :" +longValueDeux);
		// return 50
		int intValuedeux = (int) longValueDeux;
		System.out.println("cat long en int :" +intValuedeux);
		// return 50
		// Ternaire 
		int valeur1 = 7;
		int valeur2 = 5;
		// si int searchValue = valeur1 > valeur2  alors print ok sinon ko
		int searchValue = valeur1 > valeur2 ? valeur1 : valeur2 ; 
		System.out.println("Valeur recherche :"+searchValue);
		int valueA = 10;
		int valueB = 4;
		if (valueA > valueB ) {
			System.out.println("Valeur A est plus grande que "+ valueB );
		}else if (valueA < valueB ){
			System.out.println("Valeur A est plus petite que "+ valueB );
		}else {
			System.out.println("Valeur A egal valeur B");
		}
		
		
		
		
	}
}
