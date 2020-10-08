package com.ruffin.init;

import java.util.Scanner;

import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Init {
	/**
	 * Ceci est un commentaire qui ne sera pas compilé mais generera la doc java
	 * 
	 * @param args
	 */
/*
	public static void main(String[] args) {
		////////////////////
		/// Instant Class //
		////////////////////
		// checkRelationship(null);
		
		LocalDate today = LocalDate.now();
		System.out.println(today);
		DateTimeFormatter usDateFormat = DateTimeFormatter.ofPattern("MM-dd-yyyy");
		System.out.println("Format us "+today.format(usDateFormat));
		String usDateString ="07-04-2022";
		// LocalDate failedDate = LocalDate.parse(usDateString); // ERROR
		usDateFormat = DateTimeFormatter.ofPattern("MM-dd-yyyy");
		LocalDate theDate = LocalDate.parse(usDateString, usDateFormat);
		System.out.println("La date "+theDate);
		/////////////////
		// calculatrice//
		/////////////////
		executeInteractively();
		// Declaration + Initialisation
		double[] membresDeGauche = { 100.0d, 25.0d, 225.0d, 11.0d };
		double[] membresDeDroite = { 50.0d, 92.0d, 17.0d, 3.0d };
		char[] typeOperations = { 'a', 's', 'm', 'd' };
		double[] resultats = new double[typeOperations.length];

		// Utilisation
		if (args.length == 0) {
			for (int i = 0; i < typeOperations.length; i++) {
				resultats[i] = execute(typeOperations[i], membresDeGauche[i], membresDeDroite[i]);
			}
			for (double d : resultats) {
				System.out.println(d);
			}
		} else if (args.length == 3) {
			manipulationEnLigneDeCommande(args);
		} else
			System.out.println("Veuillez entrez le code de m'operation ainsi que deux chiffres");

		// Declaration variable + initilisation
		int unNombre = 150;
		// Declaration variable final + initilisation
		final int unNombreMax = 1548;
		System.out.println("Test first line comment"); // Ce commentaire ne sera pas compile
		/*
		 * Ce bloc de commentaire ne sera pas compile
		 
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
		System.out.println("longueur :" + resultOp.length);
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
			System.out.println("result " + resultOp[i]);
		}
		// for each
		float resultOp2[] = { 10.0f, 20.0f, 15.0f };
		float sum1 = 0.0f;
		for (float currentVal : resultOp2) {
			sum1 += currentVal;
			System.out.println(sum1);
		}
		faitQuelqueChose();
		int david = 17, dawson = 15, dillon = 8, gordon = 6;
		// nous voulons afficher Mes noeuveux ont 17, 15, 8 et 6 ans le plus jeune.
		// Concatenation d'un String
		String s1 = "Mes noeuveux ont " + david + ", " + dawson + ", " + dillon + " et " + gordon
				+ " ans le plus jeune.";
		System.out.println(s1);
		// Formatage du String
		String s2 = String.format("Mes noeuveux ont %d, %d, %d et %d ans le plus jeune.", david, dawson, dillon,
				gordon);
		System.out.println(s2);
		// calcule moyen d'age
		double avgDiff = ((david - dawson) + (dawson - dillon) + (dillon - gordon)) / 3.0d;
		// Concatenation d'un String
		String s3 = "La moyenne d'age entre chaque est " + avgDiff + " ans.";
		System.out.println(s3);
		// Formatage du String pour mettre une precision au resultat
		String s4 = String.format("La moyenne d'age entre chaque est %.1f ans.", avgDiff);
		System.out.println(s4);
		// Utilisation formatage

		// Exemple flag, Represente :
		int iValRadix = 32;
		String radix = String.format("%d Decimal", iValRadix);
		System.out.println(radix);
		String radix2 = String.format("%x Hexadecimal", iValRadix);
		System.out.println(radix2);
		String radix4 = String.format("%#x Hexadecimal+flag", iValRadix);
		System.out.println(radix4);
		String radix3 = String.format("%#x Hexadecimal mAJ+flag", iValRadix);
		System.out.println(radix3);
		int w = 5, x = 235, y = 481, z = 12;
		String test = String.format("W:%d X:%d", w, x);
		String test2 = String.format("Y:%d Z:%d", y, z);
		System.out.println(test);
		System.out.println(test2);
		// alignement des deux String a l'aide d'un width de 4
		String test3 = String.format("W:%4d X:%4d", w, x);
		String test4 = String.format("y:%4d z:%4d", y, z);
		System.out.println(test3);
		System.out.println(test4);
		// alignement des deux String a l'aide d'un width de 4 et rempli de 0
		String test5 = String.format("W:%04d X:%04d", w, x);
		String test6 = String.format("y:%04d z:%04d", y, z);
		System.out.println(test5);
		System.out.println(test6);
		// alignement des deux String a l'aide d'un width de 4 et aligne a gauche
		String test7 = String.format("W:%-4d X:%-4d", w, x);
		String test8 = String.format("y:%-4d z:%-4d", y, z);
		System.out.println(test7);
		System.out.println(test8);
		int nbTest = 1234567;
		s1 = String.format("%d", nbTest);
		s2 = String.format("%,d", nbTest);
		System.out.println(s1);
		System.out.println(s2);
		double dVal = 1234567.0d;
		s3 = String.format("%,.2f", dVal);
		System.out.println(s3);
		int flagVal = 123, flagValNeg = -146;
		s1 = String.format("%d", flagVal);
		s2 = String.format("%d", flagValNeg);
		System.out.println(s1);
		System.out.println(s2);
		s1 = String.format("% d", flagVal);
		s2 = String.format("% d", flagValNeg);
		System.out.println(s1);
		System.out.println(s2);
		s1 = String.format("%+d", flagVal);
		s2 = String.format("%+d", flagValNeg);
		System.out.println(s1);
		System.out.println(s2);
		s1 = String.format("%(d", flagVal);
		s2 = String.format("%(d", flagValNeg);
		System.out.println(s1);
		System.out.println(s2);
		s1 = String.format("% (d", flagVal);
		s2 = String.format("%(d", flagValNeg);
		System.out.println(s1);
		System.out.println(s2);
		s1 = "blabla";
		s2 = "blabla";
		if (s1.equals(s2)) {
			System.out.println("C'est bon");
		}
		int nbConvertString = 25462;
		String convertToString = String.valueOf(nbConvertString);
		System.out.println(convertToString);
		int valA1 = 100, valA2 = 200, valA3 = 300;
		s1 = String.format("%d %d %d", valA1, valA2, valA3);
		System.out.println(s1);
		s1 = String.format("%3$d %2$d %1$d", valA1, valA2, valA3);
		System.out.println(s1);
		s1 = String.format("%2$d %<d %1$d", valA1, valA2, valA3);
		System.out.println(s1);
	}
*/
	private static void manipulationEnLigneDeCommande(String[] args) {
		char c = args[0].charAt(0);
		double d = Double.parseDouble(args[1]);
		double e = Double.parseDouble(args[2]);
		double result = execute(c, d, e);
		System.out.println(result);

	}

	private static double execute(char c, double d, double e) {
		double result;
		switch (c) {
		case 'a': {
			result = d + e;
			break;
		}
		case 's': {
			result = d - e;
			break;
		}
		case 'm': {
			result = d * e;
			break;
		}
		case 'd': {
			result = e != 0 ? d / e : 0.0d;
			break;
		}
		default:
			System.out.println(" Code invalide :" + c);
			result = 0.0d;
			break;
		}
		return result;
	}

	// methode
	static void faitQuelqueChose() {
		System.out.println("a l'interieur de la methode");
		System.out.println("Reste a l'interieur de la methode");

	}

	static char saisiCodeOperation(String op) {
		System.out.println("operation en cours :" + op);
		char opCode = op.charAt(0);
		return opCode;
	}

	static double saisiValMot(String val) {
		String[] numeros = { "un", "deux", "trois", "quatre", "cinq", "six", "sept", "huit", "neuf" };
		double value = -1d;
		for (int i = 0; i < numeros.length; i++) {
			if (val.equals(numeros[i])) {
				value = i + 1;
				break;
			}
		}
		if (value ==-1d) {
			value=Double.parseDouble(val);
		}
		System.out.println("valeur entrer : " + value);
		return value;
	}

	static void executeInteractively() {
		System.out.println(
				"Veuillez entrer  un type d'operation (a,m,s,d) ainsi que deux chiffres en lettre compris entre 0 et 9");
		Scanner sc = new Scanner(System.in);
		String userInput = sc.nextLine();
		String[] parts = userInput.split(" ");
		performOperation(parts);
	}

	private static void performOperation(String[] parts) {
		char c = saisiCodeOperation(parts[0]);
		if (c == 'w') {
			manipQuandW(parts);
		} else {
			double d = saisiValMot(parts[1]);
			double e = saisiValMot(parts[2]);
			double result = execute(c, d, e);
			displayResult(c, d, e, result);
		}
	}

	private static void manipQuandW(String[] parts) {
		LocalDate startDate = LocalDate.parse(parts[1]);
		// obtenir le nombre de jours que l'utilisateur souhaite ajouter
		long daysToAdd = (long) saisiValMot(parts[2]);
		startDate.plusDays(daysToAdd);
		LocalDate newDate = startDate.plusDays(daysToAdd);
		String output = String.format("%s plus %d days is %s", startDate, daysToAdd, newDate);
		System.out.println(output);
	}

	private static void displayResult(char c, double d, double e, double result) {
		char symbol = symbolFromOpCode(c);
		System.out.println(symbol);
//		StringBuilder builder = new StringBuilder(20);
//		builder.append(d);
//		builder.append(" ");
//		builder.append(symbol);
//		builder.append(" ");
//		builder.append(e);
//		builder.append(" = ");
//		builder.append(result);
//		String output = builder.toString();
		String output = String.format("%.3f %c %.3f = %.3f", d, symbol, e, result);
		System.out.println(output);
	}

	private static char symbolFromOpCode(char opCode) {
		char[] opCodes = { 'a', 's', 'm', 'd' };
		char[] symbols = { '+', '-', '*', '/' };
		char symbol = ' ';
		for (int index = 0; index < opCodes.length; index++) {
			if (opCode == opCodes[index]) {
				symbol = symbols[index];
				break;
			}
		}
		return symbol;

	}

	private static void checkRelationship(Instant otherInstant) {
		Instant nowInstant = Instant.now();
		if (otherInstant.compareTo(nowInstant) > 0) {
			System.out.println("Nosu sommes dans le future");
		} else if (otherInstant.compareTo(nowInstant) < 0) {
			System.out.println("Nous sommes dans le passe");
		} else {
			System.out.println("Maintenant");
		}
	}
}

