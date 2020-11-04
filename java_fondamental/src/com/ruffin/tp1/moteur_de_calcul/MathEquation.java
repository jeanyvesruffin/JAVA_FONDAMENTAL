package com.ruffin.tp1.moteur_de_calcul;

class MathEquation {

	// Declaration des attributs membre de la classes MathEquation
	private double leftVal;
	private double rightVal;
	private double result;
	private char opCode;
	private char test;

	// constructeur sans parametre
	public MathEquation() {
	}
	// constructeur avec parametres
	public MathEquation(double leftVal, double rightVal, char opCode) {
		this(opCode);
		this.leftVal = leftVal;
		this.rightVal = rightVal;
	}

	// constructeur avec parametre
	public MathEquation(char opCode) {
		this();
		this.opCode =opCode;
	}

	{
		this.test ='f';
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
	
	//Getters and Setters
	public double getLeftVal() {
		return leftVal;
	}

	public void setLeftVal(double leftVal) {
		this.leftVal = leftVal;
	}

	public double getRightVal() {
		return rightVal;
	}

	public void setRightVal(double rightVal) {
		this.rightVal = rightVal;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public char getOpCode() {
		return opCode;
	}

	public void setOpCode(char opCode) {
		this.opCode = opCode;
	}
	public char getTest() {
		return test;
	}
	public void setTest(char test) {
		this.test = test;
	}
}
