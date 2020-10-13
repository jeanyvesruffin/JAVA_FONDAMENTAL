package com.ruffin.moteur_de_calcul;

public class Main {

	public static void main(String[] args) {
		performCalculations();

	}

	private static void performCalculations() {
		
		// Nous allons stocker dans un tableau chaque instanciation de notre classe
		// MathEquation qui sera un tableau de 4 elements (representant les 4 equations)
		MathEquation[] equations = new MathEquation[4];
		// initialisation des elements du tableau d'equation
		equations[0] = new MathEquation(100.0d, 50.0d, 'd');
		equations[1] = new MathEquation(25.0d, 92.0d, 'a');
		equations[2] = new MathEquation(225.0d, 17.0d, 's');
		equations[3] = new MathEquation(11.0d, 3.0d, 'm');

		for (MathEquation mathEquation : equations) {
			mathEquation.execute();
			System.out.println(mathEquation.getLeftVal() + String.valueOf(mathEquation.getOpCode()) + mathEquation.getRightVal());
			System.out.println("resultats equation : "  + mathEquation.getResult());
			System.out.println(mathEquation.getTest());
		}
	}
}
