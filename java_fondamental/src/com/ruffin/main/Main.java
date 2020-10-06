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
		System.out.println("un nombre :" + unNombre);
		System.out.println("une constante :" + unNombreMax);
		// Utilisation des types primitifs
		// Integer byte
		byte nombreDeLettreFrencais = 26;
		System.out.println("un type byte :" + nombreDeLettreFrencais);
		// Integer short
		short rayonTerre = 6371;
		System.out.println("un type short :" + rayonTerre);
		int distanceMarsSoleil = 228000000;
		System.out.println("un type int :" + distanceMarsSoleil);
		long distanceOrion = 12710000000000000L;
		System.out.println("un type long :" + distanceOrion);
		// Interger float
		float precisionLaser = 12.215478f;
		System.out.println("un type float :" + precisionLaser);
		// Interger double
		double tailleAtomeMetre = 0.00000000001d;
		System.out.println("un type double :" + tailleAtomeMetre);
		// Character
		char defautU = 'U';
		System.out.println("un type char :" + defautU);
		// unicode
		char accentU = '\u00DA';
		System.out.println("un type char unicode :" + accentU);
		// Boolean
		boolean jaimeJava = true;
		System.out.println("un type boolean :" + jaimeJava);

		// Affectation
		int premierNombre = 154;
		System.out.println("affectation :" + premierNombre);
		// return 154
		int secondNombre = premierNombre;
		System.out.println("affectation par copie :" + secondNombre);
		// return 154
		premierNombre = 4;
		System.out.println("affectation 1er nbre :" + premierNombre);
		// return 4
		secondNombre = 655;
		System.out.println("affectation 2eme nbre :" + secondNombre);
		// return 655
		int first = 13;
		int second = 5;
		int resultModulo = 0;
		resultModulo = first % second;
		System.out.println("resultat 13%5 :" + resultModulo);
		int increm = 5;
		System.out.println("5 incremente :" + ++increm);
		System.out.println("valeur de la variable precedenment incremente :" + increm);
		int autreIncrem = 5;
		System.out.println("5 incremente de l'autre cote :" + autreIncrem++);
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
		// return 19
		int result2 = (nbA - nbB) / nbC;
		System.out.println("(nbA - nbB) / nbC :" + result2);
		// return 5
		int result3 = nbA / nbC * nbD + nbB;
		System.out.println(result3);
		// return 13
		int result4 = nbA / (nbC * (nbD + nbB));
		System.out.println("nbA / (nbC * (nbD + nbB)) :" + result4);
		// return 1
		// Transtypage
		int myValue = 50;
		System.out.println("affectation int :" + myValue);
		// return 50
		long longValue = myValue;
		System.out.println("affectation long :" + longValue);
		// return 50
		long longValueDeux = 50;
		System.out.println("affectation long :" + longValueDeux);
		// return 50
		int intValuedeux = (int) longValueDeux;
		System.out.println("cat long en int :" + intValuedeux);
		// return 50
		// Ternaire
		int valeur1 = 7;
		int valeur2 = 5;
		// si int searchValue = valeur1 > valeur2 alors print ok sinon ko
		int searchValue = valeur1 > valeur2 ? valeur1 : valeur2;
		System.out.println("Valeur recherche :" + searchValue);
		int valueA = 10;
		int valueB = 4;
		if (valueA > valueB) {
			System.out.println("Valeur A est plus grande que " + valueB);
		} else if (valueA < valueB) {
			System.out.println("Valeur A est plus petite que " + valueB);
		} else {
			System.out.println("Valeur A egal valeur B");
		}
		// boucle while
		// nbre factoriel
		int sommeValue = 4;
		int factoriel = 1;
		while (sommeValue > 1) {
			factoriel *= sommeValue;
			sommeValue--;
		}
		System.out.println(factoriel);

		int iVal = 5;
		do {
			System.out.print(iVal);
			System.out.print(" * 2 = ");
			iVal *= 2;
			System.out.println(iVal);
		} while (iVal < 25);

		for (int i = 1; i < 100; i *= 2) {
			System.out.println(i);
		}

		float[] tableauValeur = new float[3];
		tableauValeur[0] = 18.22f;
		tableauValeur[1] = 20.5f;
		tableauValeur[2] = 471.545f;
		// equivalent a
		// float[] tableauValeur = {18.22f, 20.5f, 471.545f};

		float sum = 0.0f;
		System.out.println(tableauValeur.length);
		for (int i = 0; i < tableauValeur.length; i++) {
			sum += tableauValeur[i];
		}
		System.out.println(sum);

		double[] valeurDeDroite = { 100.0d, 65.241d, 451.81d, 815.21d };
		double[] valeurDeGauche = { 2.145d, 74.155d, 8.1d, 23489.12d };
		char[] opCode = { 'a', 's', 'm', 'd' };
		double[] resultOp = new double[opCode.length];
		System.out.println("longueur :"+resultOp.length);
		for (int i = 0; i < resultOp.length; i++) {
			System.out.println(opCode[i]);
			switch (opCode[i]) {
			case 'a': {
				resultOp[i] = valeurDeGauche[i] + valeurDeDroite[i];
				break;
			}
			case 's': {
				resultOp[i] = valeurDeGauche[i] - valeurDeDroite[i];
				break;
			}
			case 'm': {
				resultOp[i] = valeurDeGauche[i] * valeurDeDroite[i];
				break;
			}
			case 'd': {
				resultOp[i] = valeurDeDroite[i] != 0 ? valeurDeGauche[i] / valeurDeDroite[i] : 0.0d;
				break;
			}
			default:
				System.out.println(" Code invalide :" + opCode[i]);
				resultOp[i] = 0.0d;
				break;
			}
			System.out.println("result "+ resultOp[i]);
		}
		// for each
		float resultOp2[]= {10.0f, 20.0f, 15.0f}; 
		float sum1 = 0.0f;
		for (float currentVal : resultOp2) {
			sum1 += currentVal;
			System.out.println(sum1);
		}
	}
}
