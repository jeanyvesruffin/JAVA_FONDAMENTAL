# JAVA_FONDAMENTAL


## Creation et execution d'une application java

Le point d'entrée de l'application aura toujours la meme signature.

```java
public class Main {

	public static void main(String[] args){
		// code ici
	}
	
}

```

Ecriture d'un log dans la console

```java
System.out.println('Hello world');
```


## Execution d'une application en ligne de commande

Ouvrez l'inviter de commande a la racine du projet ou se trouve le fichier Main.class

```cmd
java Main.java
```

## Syntaxe d'une instruction

Une instruction se termine par un ;


## Commentaires

Commenter une ligne avec l'aide de //...

Commenter un bloc avec l'aide de /*...*/

Commentaire java doc /**...*/

## Organisation du code et package

Le code est organise en package.

Ces packages ont une convention de nom:

* les noms de package sont toujours en minuscules
* utilisation du nom de domaine inverse afin d'assurer l'unicite global de nos nom de package.

**Exemple**


```java
package com.ruffin
```

## Les variables

Une variable est un simple espace de stockage ou l'on y met une valeur qui sera fortement type.

Elle est structure telquelle: Declaration, Initialisation (ou les deux en un) et utilisation

**Exemple**

```java
// Declaration
int unNombre;

//Initialisation
unNombre = 150;

// Declaration+Initialisation
int unNombre = 150;

//Utilisation
System.out.println(unNombre);
```



## Variables final

Une variable final est utilise, par exemple, pour definir une constante et ainsi eviter sa reaffectation par une autre valeur.

```java
//Constante
final int nombreMAx = 1542 ;
```


## Les donnees de type primitives

* Entier (Nombre/ Integer)

Types: bytes / 8 bits / min value = -128 / max value = 127 / literal form : 0


```java
// Integer byte
byte nombreDeLettreFrencais = 26 ;
```

Types: short / 16 bits / min value = -32768 / max value = 32768 / literal form : 0


```java
// Integer short
short rayonTerre = 6371 ;
```

Types: int / 32 bits / min value = -2147483648 / max value = 2147483648 / literal form : 0


```java
// Integer int
int distanceMarsSoleil = 228000000 ;
```

Types: long / 64 bits / min value = -9223372036864775808 / max value = 9223372036864775808 / literal form : 0L


```java
// Integer long
long distanceOrion = 12710000000000000L ;
```

Types: float / 32 bits / min value = 1.4 * 10puiss-45 / max value = 3.4 * 10puiss38 / literal form : 0.0f


```java
// Interger float
float precisionLaser = 12.215478 ;
```

Types: double / 64 bits / min value = 4.9 * 10puiss-324 / max value = 1.7 * 10puiss308 / literal form : 0.0 ou 0.0d


```java
// Interger double
double tailleAtomeMetre = 0.00000000001d ;
```



* Carateres (Lettre,Caracteres speciaux (unicode...))

Stockage d'un caratere seul

```java
// Character
char defautU = 'U' ;
```

Stockage d'un unicode seul

```java
// unicode
char accentU = '\u00DA' ;
```

* Boolean

```java
// Boolean
boolean jaimeJava = true ;
```


## Le stockage des donnees de type primitives

La donnee de la variable est stocke dans son propre espace memoire. Si l'on attribut cette donnee a une autre variable, cette autre variable sera la copie de la precedente.

Cela dit, il n'y a aucune correlation entre les deux variables nous pourrons toujours leur attribuer des donnees differentes.
Elle auront leur propre espace memoire.


```java
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
```

## Les operateurs arithmetiques

* Basic

+, -, *, / et %.
 
Le modulo % permet de connaitre le reste d'une division. L'exemple ci-dessous nous retourne 3 car 13/5= 2 reste 3 (5*2=10 +3(reste) = 13)


```java
int first = 13 ;
int second = 5 ;
int result = 0 ;
result = first % second;
System.out.println(secondNombre);
```

* Prefix et postfix operateur

++ ,--

++ permet d'incrementer
-- permet de decrementer


```java
int increm = 5 ;
System.out.println(++increm);
// return 6
System.out.println(increm);
// return 6
int autreIncrem = 5 ;
System.out.println(autreIncrem++);
// return 5
System.out.println(autreIncrem);
// return 6
```

* Operateurs d'affectation composes

+=, -=, *=, /=, %=

+= permet d'ajouter une valeur à une variable 
-= permet de soustraire une valeur à une variable 
...etc

```java
int testAssign = 100;
testAssign += 50;
System.out.println(testAssign);
// return 50
```

Dans le second exemple, le calcule est le suivant val1 * val 2 = 50; 100 / 50 = 2. Retourne 2.

```java
int testAssignCompose = 100;
int val1 = 5;
int val2 = 10;
testAssignCompose /= val1 * val2;
System.out.println(testAssignCompose);
// return 50
```

* Priorite des operateurs du plus prioritaire au moins

1. Postfix (X++, X--, ... )
2. Prefix (++X, --X, ... )
3. Multiplication (*, /, % )
4. Addition (+ , - )

Si plusieurs elements ont la meme priorite l'ordre d'execution se fera de gauche vers la droite.
Si l'on souhaite encapsuler des operations nous utilisons des parentheses.

```java
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
```




## La convertion des types de donnees

La convertion se fait a l'aide de transtypage (ou cast).

```java
// Transtypage 
int myValue = 50 ;
System.out.println(myValue);
// return 50
long longValue = myValue;
System.out.println(longValue);
// return 50.0
long longValueDeux = 50;
System.out.println(longValueDeux);
// return 50.0
int intValuedeux = (int) longValueDeux;
System.out.println(intValuedeux);
// return 50

```

* Type implicite 

Les conversions d'elargissement sont effectuees automatiquement pour les equations utilisant des entier (integer), ou des doubles ou des nombres a virgules.

* Type explicite

Attention lors de cast le surplus sera supprimer si la taille n'est pas suffisante.

## Logic conditionnel

<, >, <=, =>, ==, !=

Condition ternaire

result = condition ? true-value : false-value


```java
// Ternaire 
int valeur1 = 7;
int valeur2 = 5;
// si int searchValue = valeur1 > valeur2  alors print ok sinon ko
int searchValue = valeur1 > valeur2 ? valeur1 : valeur2 ; 
System.out.println("Valeur recherche :"+searchValue);
// return 7
```

## If-else


```java
if (valueA > valueB ) {
	System.out.println("Valeur A est plus grande que "+ valueB );
}else if (valueA < valueB ){
	System.out.println("Valeur A est plus petite que "+ valueB );
}else {
	System.out.println("Valeur A egal valeur B");
}
 
```

## Operation logique

* And : &
* Ou : |
* Xor (ou exclusif) : ^ 
* Negation : !


## Condition d'operation logique


* And : &&
* Or : ||

## Etat d'un bloc et etendu des variables

Les variables declarees a l'exterieur des blocs sont visibles a l'interieur de ceux-la, alors que les variable declarees dans un  bloc ne sera visible que dans le bloc.

## Switch

```java
switch (value-to-test) {
	case match-value-1:
		instructions
		break;
	...
	case match-value-N:
		instructions
		break;
	...
	default:
		instructions
}

```

## Boucle while 

Exemple calcule factoriel


```java
int sommeValue = 4;
int factoriel =1;
while (sommeValue>1) {
	factoriel *= sommeValue;
	sommeValue--;
}
System.out.println(factoriel);


```

## Boucle do-while

```java
do {
	System.out.print(iVal);
	System.out.print(" * 2 = ");
	iVal*=2;
	System.out.println(iVal);
}while (iVal < 25);
```


## Boucle For


```java
for (int i = 1; i < 100; i *= 2) {
	System.out.println(i);
	}
```

## Tableau

Declaration

```java
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
```


## Boucle for each


```java
float resultOp2[]= {10.0f, 20.0f, 15.0f}; 
float sum1 = 0.0f;
for (float currentVal : resultOp2) {
	sum1 += currentVal;
	System.out.println(sum1);
}
```

## Methodes


```java
type de retours name (list parametre type){
	instruction(s)
}
```

## Passage parametre a une methode via ligne de commande

```java
if (args.length == 0) {
	for (int i = 0; i < typeOperations.length; i++) {
		resultats[i]=execute(typeOperations[i], membresDeGauche[i], membresDeDroite[i]);
	}
	for (double d : resultats) {
		System.out.println(d);
	}
} else if (args.length == 3) {
	manipulationEnLigneDeCommande(args);
} else
	System.out.println("Veuillez entrez le code de m'operation ainsi que deux chiffres");
	
	private static void manipulationEnLigneDeCommande(String[] args) {
	char c = args[0].charAt(0);
	double d=Double.parseDouble(args[1]);
	double e=Double.parseDouble(args[2]);
	double result =execute(c,d,e);
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
```

A l'aide d'eclipse dans les panneau de configuration ajouter 3 arguments.

Exemple : a 20 10

Lors de l'execution nous aurons le resultat 30 qui s'affichera.

## Chaine de caractere (class String)

* Egalite entre deux String

```java
s1="blabla";
s2="blabla";
if(s1.equals(s2)){
	System.out.println("C'est bon");
}

```

* Conversion d'un entier en String

```java
int nbConvertString = 25462;
String convertToString = String.valueOf(nbConvertString);
System.out.println(convertToString);
```

* Ajout de saisi utilisateur

Commencer par definir nos entré

```java
static char saisiCodeOperation (String op) {
	char opCode = op.charAt(0);
	return opCode;
}

static double saisiValMot (String val) {
	String [] numeros = {"un","deux","trois","quatre","cinq","six","sept","huit","neuf"};
	double value = 0d;
	for (int i = 0; i < numeros.length; i++) {
		if (val.equals(numeros[i])) {
			value = i+1;
			break;
		}
	}
	return value;		
}

```

Rendre l'application interactive en ajoutant des scanner

```java
import java.util.Scanner; 
static void executeInteractively() {
	System.out.println("Veuillez entrer  un type d'operation (a,m,s,d) ainsi que deux chiffres");
	Scanner sc = new Scanner(System.in);
	String userInput = sc.nextLine();
	String [] parts = userInput.split(" ");
	performOperation(parts);
}

private static void performOperation(String[] parts) {
	char c = saisiCodeOperation(parts[0]);
	double d = saisiValMot(parts[2]);
	double e = saisiValMot(parts[2]);
	double result = execute(c, d, e);
	System.out.println(result);
}
```

* String builder

Permet de construire une chaine de caratere piece par piece en ajoutant du texte a la fin avec *append* ou l'insertion de text avec *insert*.

```java
private static void displayResult(char c, double d, double e, double result) {
	char symbol = symbolFromOpCode(c);
	System.out.println(symbol);
	StringBuilder builder = new StringBuilder(20);
	builder.append(d);
	builder.append(" ");
	builder.append(symbol);
	builder.append(" ");
	builder.append(e);
	builder.append(" = ");
	builder.append(result);
	String output = builder.toString();
	System.out.println(output);
}

``` 



## Format des String

Nous voulons afficher Mes noeuveux ont 17, 15, 8 et 6 ans le plus jeune.

```java
// Concatenation d'un String
String s1 = "Mes noeuveux ont " + david + ", " + dawson + ", " + dillon + " et " + gordon
		+ " ans le plus jeune.";
System.out.println(s1);
// Formatage du String
String s2 = String.format("Mes noeuveux ont %d, %d, %d et %d ans le plus jeune.", david, dawson, dillon,
		gordon);
System.out.println(s2);
```

Puis calculer la moyen d'age et le formater

```java
// calcule moyen d'age
double avgDiff = ((david - dawson) + (dawson - dillon) + (dillon - gordon)) / 3.0d;
// Concatenation d'un String
String s3 = "La moyenne d'age entre chaque est " + avgDiff + " ans.";
System.out.println(s3);
// Formatage du String pour mettre une precision au resultat
String s4 = String.format("La moyenne d'age entre chaque est %.1f ans.", avgDiff);
System.out.println(s4);
```


Utilisation formatage

% [flags][width][precision]conversion

conversion: d ,Represente: Decimal ,Type: Integer,Exemple Value: 32 ,Result: 32

conversion: xX ,Represente: Hex ,Type: Integer,Exemple Value: 32 ,Result: 20

conversion: f ,Represente: Decimal ,Type: Floating point,Exemple Value: 123.0 ,Result: 123.000000

conversion: eE ,Represente: Scientific notation ,Type: Floating point,Exemple Value: 123.0 ,Result: 1.230000e+02

conversion: s ,Represente: String ,Type: General,Exemple Value: "Hello" ,Result: Hello

[flag]: # ,Represente: Inclut radix [flag]: 0 ,Represente: pas de marge

[flag]: - ,Represente: colle le texte a gauche

[flag]: , , Represente: separe les groupes par des espaces (suivant le pays en us c'est par des ,)

[flag]: SPACE, Represente : espace de debut quand nombre positif

[flag]: +, Represente : signe toujours visible

[flag]: (, Represente : inclure des valeurs negatives entre parentheses


```java
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
//alignement des deux String a l'aide d'un width de 4
String test3 = String.format("W:%4d X:%4d", w, x);
String test4 = String.format("y:%4d z:%4d", y, z);
System.out.println(test3);
System.out.println(test4);
//alignement des deux String a l'aide d'un width de 4 et rempli de 0
String test5 = String.format("W:%04d X:%04d", w, x);
String test6 = String.format("y:%04d z:%04d", y, z);
System.out.println(test5);
System.out.println(test6);
//alignement des deux String a l'aide d'un width de 4 et aligne a gauche
String test7 = String.format("W:%-4d X:%-4d", w, x);
String test8 = String.format("y:%-4d z:%-4d", y, z);
System.out.println(test7);
System.out.println(test8);
int nbTest = 1234567;
s1=String.format("%d", nbTest);
s2=String.format("%,d", nbTest);
System.out.println(s1);
System.out.println(s2);
double dVal=1234567.0d;
s3=String.format("%,.2f", dVal);
System.out.println(s3);
int flagVal = 123, flagValNeg = -146;
s1 =String.format("%d", flagVal);
s2 =String.format("%d", flagValNeg);
System.out.println(s1);
System.out.println(s2);
s1 =String.format("% d", flagVal);
s2 =String.format("% d", flagValNeg);
System.out.println(s1);
System.out.println(s2);
s1 =String.format("%+d", flagVal);
s2 =String.format("%+d", flagValNeg);
System.out.println(s1);
System.out.println(s2);
s1 =String.format("%(d", flagVal);
s2 =String.format("%(d", flagValNeg);
System.out.println(s1);
System.out.println(s2);
s1 =String.format("% (d", flagVal);
s2 =String.format("%(d", flagValNeg);
System.out.println(s1);
System.out.println(s2);
```

* Indexe en argument

Permet de reorganiser une chaine de caratere suivant leur position (attention 1 est la 1er position).

```java
int valA1=100, valA2=200, valA3=300;
s1=String.format("%d %d %d", valA1, valA2, valA3);
System.out.println(s1);
s1=String.format("%3$d %2$d %1$d", valA1, valA2, valA3);
System.out.println(s1);
s1=String.format("%2$d %<d %1$d", valA1, valA2, valA3);
System.out.println(s1);

output:
100 200 300
300 200 100
200 200 100

```
