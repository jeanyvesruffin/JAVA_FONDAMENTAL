package com.ruffin.moteur_de_calcul;

public class MathEquation {

	// Declaration des attributs membre de la classes MathEquation
	double leftVal;
	double rightVal;
	double result;
	char opCode;

	// constructeur avec parametre
	public MathEquation(double leftVal, double rightVal, char opCodes) {
		super();
		this.leftVal = leftVal;
		this.rightVal = rightVal;
		this.opCode = opCodes;
	}

	// constructeur sans parametre
	public MathEquation() {
		super();
	}

	// methode d'execution du calcul, celle-ci ne retournera rien, elle sera utilise
	// par la suite lors de l'instanciation de la class MathEquation dans la class
	// Main
	void execute() {
		switch (opCode) {
		case 'd': {
			// attention on verifie que la valeur n'est pas 0 pour eviter la division par 0
			// condition ternaire
			result = rightVal != 0 ? leftVal / rightVal : 0.0d;
			break;
		}
		case 'a': {
			result = leftVal + rightVal;
			break;
		}
		case 's': {
			result = leftVal - rightVal;
			break;
		}
		case 'm': {
			result = leftVal * rightVal;
			break;
		}
		default:
			// on affiche une erreur par defaut
			System.out.println("Invalide opCode: " + opCode);
			result = 0.0d;
			break;
		}
	}
}
