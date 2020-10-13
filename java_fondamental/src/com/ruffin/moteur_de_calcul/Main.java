package com.ruffin.moteur_de_calcul;

public class Main {

	public static void main(String[] args) {
		performCalculations();

	}

	private static void performCalculations() {
		// declaration + initialisation des membre du calcul, le type de calcul et d'un
		// tableau de resultats
		/*double[] leftVals = { 100.0d, 25.0d, 225.0d, 11.0d };
		double[] rightVals = { 50.0d, 92.0d, 17.0d, 3.0d };
		char[] opCodes = { 'd', 'a', 's', 'm' };
		double[] results = new double[opCodes.length];*/

		// Nous allons stocker dans un tableau chaque instanciation de notre classe
		// MathEquation qui sera un tableau de 4 elements (representant les 4 equations)
		MathEquation[] equations = new MathEquation[4];
		// initialisation des elements du tableau d'equation
		equations[0] = create(100.0d, 50.0d, 'd');
		equations[1] = create(25.0d, 92.0d, 'a');
		equations[2] = create(225.0d, 17.0d, 's');
		equations[3] = create(11.0d, 3.0d, 'm');

		for (MathEquation mathEquation : equations) {
			mathEquation.execute();
			System.out.println(mathEquation.result);
		}
		
		// appel methode execute qui permet de calculer chaque elements du tableau avec
		// son type de calcul associe
		// et remplie le tableau de resultats
		// 1er boucle qui se repete 4 fois (long opcode=4)
		// pour chaque resultat on appel la methode execute qui realise le calcul
		/*for (int i = 0; i < opCodes.length; i++) {
			results[i] = execute(leftVals[i], opCodes[i], rightVals[i]);
		}
		// affichage du tableau de result
		// boucle for each
		for (double result : results) {
			System.out.println("result = " + result);
		}*/
	}

	private static MathEquation create(double leftVal, double rightVal, char opCode) {
		MathEquation equation = new MathEquation();
		equation.leftVal = leftVal;
		equation.rightVal = rightVal;
		equation.opCode = opCode;
		return equation;
	}
/*
	private static double execute(double leftVals, char opCode, double rightVals) {
		// initialisation variable de retour
		double result;
		// boucle switch pour la realisation du calcul suivant type de calcul
		switch (opCode) {
		case 'd': {
			// attention on verifie que la valeur n'est pas 0 pour eviter la division par 0
			// condition ternaire
			result = rightVals != 0 ? leftVals / rightVals : 0.0d;
			break;
		}
		case 'a': {
			result = leftVals + rightVals;
			break;
		}
		case 's': {
			result = leftVals - rightVals;
			break;
		}
		case 'm': {
			result = leftVals * rightVals;
			break;
		}
		default:
			// on affiche une erreur par defaut
			System.out.println("Invalide opCode: " + opCode);
			result = 0.0d;
			break;
		}
		return result;
	}
*/
}
