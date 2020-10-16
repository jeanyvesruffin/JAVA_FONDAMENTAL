# JAVA

## JAVA_LES_BASES

### Creation et execution d'une application java

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


### Execution d'une application en ligne de commande

Ouvrez l'inviter de commande a la racine du projet ou se trouve le fichier Main.class

```cmd
java Main.java
```

### Syntaxe d'une instruction

Une instruction se termine par un ;


### Commentaires

Commenter une ligne avec l'aide de //...

Commenter un bloc avec l'aide de /*...*/

Commentaire java doc /**...*/

### Organisation du code et package

Le code est organise en package.

Ces packages ont une convention de nom:

* les noms de package sont toujours en minuscules
* utilisation du nom de domaine inverse afin d'assurer l'unicite global de nos nom de package.

**Exemple**


```java
package com.ruffin
```

### Les variables

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



### Variables final

Une variable final est utilise, par exemple, pour definir une constante et ainsi eviter sa reaffectation par une autre valeur.

```java
//Constante
final int nombreMAx = 1542 ;
```


### Les donnees de type primitives

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


### Le stockage des donnees de type primitives

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

### Les operateurs arithmetiques

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

+= permet d'ajouter une valeur a une variable 
-= permet de soustraire une valeur a une variable 
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




### La convertion des types de donnees

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

### Logic conditionnel

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

### If-else


```java
if (valueA > valueB ) {
	System.out.println("Valeur A est plus grande que "+ valueB );
}else if (valueA < valueB ){
	System.out.println("Valeur A est plus petite que "+ valueB );
}else {
	System.out.println("Valeur A egal valeur B");
}
 
```

### Operation logique

* And : &
* Ou : |
* Xor (ou exclusif) : ^ 
* Negation : !


### Condition d'operation logique


* And : &&
* Or : ||

### Etat d'un bloc et etendu des variables

Les variables declarees a l'exterieur des blocs sont visibles a l'interieur de ceux-la, alors que les variable declarees dans un  bloc ne sera visible que dans le bloc.

### Switch

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

### Boucle while 

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

### Boucle do-while

```java
do {
	System.out.print(iVal);
	System.out.print(" * 2 = ");
	iVal*=2;
	System.out.println(iVal);
}while (iVal < 25);
```


### Boucle For


```java
for (int i = 1; i < 100; i *= 2) {
	System.out.println(i);
	}
```

### Tableau

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


### Boucle for each


```java
float resultOp2[]= {10.0f, 20.0f, 15.0f}; 
float sum1 = 0.0f;
for (float currentVal : resultOp2) {
	sum1 += currentVal;
	System.out.println(sum1);
}
```

### Methodes


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

### Chaine de caractere (class String)

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



### Format des String

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

### Class Instant LocalDate et DateTimeFormatter

Pour travailler avec les heures pour le suivi d'un evenement nous utilisons la class java *Instant*.

La class Instant est optimisee pour l'horodatage d'evenement. Fonctionne bien pour la comparaison de temps relatif. Peut etre converti en types de date / heure plus complexes.

```java
private static void checkRelationship(Instant otherInstant) {
	Instant nowInstant = Instant.now();
	if(otherInstant.compareTo(nowInstant) > 0) {
		System.out.println("Nosu sommes dans le future");
	}
	else if (otherInstant.compareTo(nowInstant)<0) {
		System.out.println("Nous sommes dans le passe");
	}else {
		System.out.println("Maintenant");
	}
}
```

Concernant l'heure et date locals nous avons pas besoin de time zone. La class Date/ LocalDate, permet de trouver des difference, augmenter/ diminuer la valeur, manipuler le contenu, convertie en chaine de caratere.

Pour representer date et heure global nous avons lameme chose a la difference que nous ne connaissons pas les times zones et permet son support et convertie les date suivant time zone.

```java
private static void manipQuandW(String[] parts) {
	LocalDate startDate = LocalDate.parse(parts[1]);
	// obtenir le nombre de jours que l'utilisateur souhaite ajouter
	long daysToAdd = (long) saisiValMot(parts[2]);
	startDate.plusDays(daysToAdd);
	LocalDate newDate = startDate.plusDays(daysToAdd);
	String output = String.format("%s plus %d days is %s", startDate, daysToAdd, newDate);
	System.out.println(output);
}
```

Changer le format de la date avec la class dateTimeFormatter.

```java
LocalDate today = LocalDate.now();
System.out.println(today);
DateTimeFormatter usDateFormatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
System.out.println("Format us "+today.format(usDateFormatter));
```

Et inversement

```java
LocalDate today = LocalDate.now();
System.out.println(today);
DateTimeFormatter usDateFormat = DateTimeFormatter.ofPattern("MM-dd-yyyy");
System.out.println("Format us "+today.format(usDateFormat));
String usDateString ="07-04-2022";
// LocalDate failedDate = LocalDate.parse(usDateString); // ERROR
usDateFormat = DateTimeFormatter.ofPattern("MM-dd-yyyy");
LocalDate theDate = LocalDate.parse(usDateString, usDateFormat);
System.out.println("La date "+theDate);
```

### Class Wrapper

Les types primitifs sont incapables de fournir des méthodes pour exploiter ces datas.

La class Wrapper permet de representer ces datas et:
* peut contenir une valeur de données primitive
* fournit des methodes
* permet la compatibilite avec des aspects plus riches du systeme de type Java

Chaque type primitifs a une class Wrapper est sont nommees comme leur type primitif mais commencent par une Majuscule (car sont des class).

* Byte, Short, Integer, Long
* Float, Double
* Character
* Boolean

Les methodes de class wrapper gerent les operations courantes:
* Conversion vers un autre type
* Extraction de valeurs a partir de chaînes
* recherche des valeurs min / max
* Beaucoup d'autres

```java
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
```

## JAVA_POO les classes

### Les classes ont la syntaxe suivante:

```java
Flight.java

class Flight(){
	//Declaration variable
	//Initialisation variables et constructeur
	//Declaration des methodes
}

```

Un constructeur n'a pas de type de retour.

*Refactorisation de la precedente application de calcul.*
Nous creons une classe Main ou nous reprenons notre projet de calculatrice.
Nous creons une nouvelle classe que l'on nomme MathEquation, cette classe sera par la suite instancie dans la classe main, afin de refactoriser le code.

```java
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
```

### Instanciation et utilisation d'une classe

```java
Flight toursToParis;
toursToParis = new Flight();
Flight parisToTours = new Flight();
```

*new*
L'utilisation du mot cle new permet d'instancier une nouvelle classes (objet).
Une instance est un emplacement memoire ou se trouve la definition des attributs membres a cette classe et execute le constructeur pour initiliser les variables.
Si l'on affiche la valeur de l'ojet celle-ci nous retournera l'adresse memoire ou elle est stocke.
Utilisation de la classe MathEquation.

*.*
Pour utiliser une methode de classe il suffit d'utiliser le ".".


```java
// Declaration variable (toursToParis) de type Flight
Flight toursToParis; // vol toursToParis: 0 passagers et 150 sieges
// Instanciation Flight et initialisation toursToParis
toursToParis = new Flight();

// Declaration, Instanciation et initialisation parisToTours
Flight parisToTours = new Flight(); // vol parisToTours 0 passagers et 150 sieges

// utilisation de la methode addPassager() pour ajouter 1 sur le vol parisToTours
result = parisToTours.addPassager();
System.out.println("nombre de passage sur le vol parisToTours" + result); //1

// si l'on affecte parisToTours à toursToParis
toursToParis = parisToTours
// les deux instance pointent alors vers le meme espace memoire et les valeurs des variables membre a la classe Flight de chaque l'instanciation seront alors
// vol parisToTours 0 passagers et 150 sieges
// vol toursToParis: 0 passagers et 150 sieges

// si l'on ajoute 2 au vol parisToTours et que l'on interroge toursToParis nous pourrons constater que les deux instance sont identique car elles pointent vers le meme espace memoire.

parisToTours.addPassager();
parisToTours.addPassager();
System.out.println("nombre de passage sur le vol parisToTours" + result); // 2
System.out.println("nombre de passage sur le vol toursToParis" + result); // 2
```

Utilisation de notre class MathEquation dans la class Main

Nous allons stocker dans un tableau chaque instanciation de notre classe.
MathEquation qui sera un tableau de 4 elements (representant les 4 equations)

```java

MathEquation[] equations = new MathEquation[4];

// initialisation des elements du tableau d'equation
equations[0] = create(100.0d, 50.0d, 'd');
equations[1] = create(25.0d, 92.0d, 'a');
equations[2] = create(225.0d, 17.0d, 's');
equations[3] = create(11.0d, 3.0d, 'm');

// Methode de creation de l'equation
private static MathEquation create(double leftVal, double rightVal, char opCode) {
MathEquation equation = new MathEquation();
equation.leftVal = leftVal;
equation.rightVal = rightVal;
equation.opCode = opCode;
return equation;
	}
```

Nous pouvons desormer effacer les attributs declare dans la classe Main ainsi que les methodes de calcul.

Puis utiliser la methode execute de la classe MathEquation, a l'aide d'une boucle for each, qui pour chaque element du tableau d'equation executera la methode execute de la classe MathEquation afin de retourner le resultat dans la console.


```java
for (MathEquation mathEquation : equations) {
	mathEquation.execute();
	System.out.println(mathEquation.result);
}

```

### Encapsulation


1 Modificateur: pas de modificateur (package)
* Visibilite: uniquement dans son propre package
* Utilisation de la classe:	Oui
* Utilisation des attributs: Oui

2 Modificateur: public
* Visibilite: Partout
* Utilisation de la classe:	Oui
* Utilisation des attributs: Oui

3 Modificateur: private
* Visibilite: seulement dans la classe declare
* Utilisation de la classe:	Non (comme prive s'applique aux classes de haut niveau; private est disponible pour les classes imbriquees)
* Utilisation des attributs: Oui


### References special

* This: Est la reference implicite de l'objet courant.
* Nul: Fait reference a un objet non cree

###  Getters (Accessors) et Setters (Mutators)

Exemples:

```java
public double getResult() {
	return result;
}

public void setResult(double result) {
	this.result = result;
}
```

### Enchainement de constructeur

Exemple:

```java
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
	this.opCode =opCode;
}
```

### Initialisation de blocs

Nous pouvons initialiser un bloc comme ci-dessous afin d'initialiser un attribut du constructeur. Dans ce cas il esst necessaire de faire appel à this(); dans chaque constructeur afin qu'il herite du constructeur par defaut.

```java
{
	this.test ='f';
}
```

### Static

*Membres statiques*
* partage a l'echelle de la classe
* declare a l'aide du mot-cle **static**

*champ statique*
* valeurs non associees à une instance
* toutes les instances accedent a la meme valeur

*methode statique*
* effectuer une action non liee a une instance
* ne peut acceder qu'aux membres statiques

*instruction d'importation statique*
* permet d'utiliser des methodes statiques sans etre qualifiees de classe

*blocs d'initialisation statiques*
* effectuer une initialisation de type unique
* executer avant la premiere utilisation du type

### Methodes

*Les objets sont passes par reference*
* La reference est copiee dans la methode

*Modifications de la methode de la reference*
* Non visible en dehors de la methode

*Modifications de la methode a l'objet reference*
* Rester visible en dehors de la methode

*Surcharge* **@Override**
* Plusieurs versions d'une methode ou d'un constructeur au sein d'une classe
* Chacun doit avoir une signature unique

*Parties de la signature*
* Nom de la methode
* Nombre de parametres
* Type de chaque parametre

*Listes de parametres de longueur variable*
* Placer l'ellipse apres le type de parametre
* Doit etre le dernier parametre
* La methode reçoit sous forme de tableau

*Les modificateurs de méthodes sont :*
* public, la methode est accessible aux methodes des autres classes.
* private, l'usage de la methode est reserve aux autres methodes de la même classe
* protected, la methode ne peut être invoquee que par des methodes de la classe ou de ses sous-classes
* final, la methode ne peut être modifiee (redefinition lors de l'heritage interdite)
* static, la methode appartient simultanement a tous les objets de la classe (comme une constante declaree a l'interieur de la classe). Il est inutile d'instancier la classe pour appeler la methode mais la methode ne peut pas manipuler de variable d'instance. Elle ne peut utiliser que des variables de classes.
* synchronized, la methode fait partie d'un thread. Lorsqu'elle est appelee, elle barre l'accès a son instance. L'instance est a nouveau liberee a la fin de son execution.
* native, le code source de la methode est ecrit dans un autre langage.



### Heritage de classe (extends)

*L'heritage d'une classe d'une autre classe*
* La classe derive a les caracteristiques de la classe de base
* La classe derive peut ajouter une specialisation

*Heritage et type de reference*
* Peut affecter une instance de classe derivee a une reference de classe de base
* Fonctionnalites disponibles limitees par reference

*La classe derivee peut surcharger les methodes*
* Doit avoir la meme signature
* Methode de classe derivee utilisee alors meme qu'une reference de classe de base est utilisee

*Class Object*
* Est a la racine de la hierarchie des classes Java
* Chaque classe a des caracteristiques d'objet
* Fournit des methodes que les classes surcharge generalement

*Verification de l'egalite*
* L'operateur d'egalite verifie les references
* Remplacer la methode equals pour fournir des comparaisons d'egalite specifiques a une classe

### Reference super, abstract et final

*super fait reference a l'objet actuel.*
* Traite comme une instance de la classe de base.

*Empecher l'heritage*
* Marquer la classe comme **Final**

*Empecher le remplacement de methode*
* Marquer la methode comme **Final**

*Exiger l'heritage*
* Marquer la classe comme **Abstract**

*Exiger le remplacement de methode*
* Marquer la methode comme **Abstract**

Le mot cle abstract s'applique aux methodes et aux classes.

Abstract indique que la classe ne pourra être instanciee telle quelle. De plus, toutes les methodes de cette classe abstract ne sont pas implementees et devront être redefinies par des methodes complètes dans ses sous-classes.

Abstract permet de creer une classe qui sera une sorte de moule. Toutes les classes derivees pourront profiter des methodes heritees et n'auront a implementer que les methodes declarees abstract.

Une methode abstraite est une methode declaree avec le modificateur abstract et sans corps. Elle correspond a une methode dont on veut forcer l'implementation dans une sous-classe. L'abstraction permet une validation du codage : une sous-classe sans le modificateur abstract et sans definition explicite d'une ou des methodes abstraites genère une erreur de compilation.

Une classe est automatiquement abstraite dès qu'une de ses methodes est declaree abstraite. Il est possible de definir une classe abstraite sans methodes abstraites.

```java
abstract class ClasseAbstraite {
  ClasseAbstraite() { ... //code du constructeur }
  void methode() { ... // code partagé par tous les descendants }
  abstract void methodeAbstraite();
}

class ClasseComplete extends ClasseAbstraite {
  ClasseComplete() { super(); ... }
  void methodeAbstraite() { ... // code de la méthode }
  // void methode est héritée
}

```
*Les constructeurs ne sont pas herites*
* Chaque classe a ses propres constructeurs

*Construire une instance de classe derivee*
* Un constructeur de classe de base toujours appele
* Par defaut, appelle la version sans argument
* Peut explicitement appeler un constructeur specifique

### Enum

*Types d'enumeration*
* Definie une liste finie de valeurs valides

*Prise en charge de la logique conditionnelle.*
* Peut effectuer des tests d'egalite
* Fonctionne bien avec les instructions switch

*Les valeurs d'enumeration sont ordonnees*
* La premiere valeur est la plus basse
* La derniere valeur est la plus elevee
* Peut effectuer des comparaisons basees sur les commandes avec **compareTo**

*Les types enum sont des classes*
* Heriter de la classe Enum de java
* Peut definir des membres

*Enum valeurs*
* Sont des instances de type enum
* La declaration d'une valeur cree l'instance
* Peut tirer parti des constructeurs


### Creer des relations abstraites avec des interfaces

*Une interface definit un contrat*
* Fournit une liste d'operations
* Pas de focus sur les details de l'implementation
* Les classes implementent des interfaces
* Conformie au contrat
* Fournie les methodes necessaires

*Interfaces generiques*
* Permet un typage plus forte
* Permet de specialiser l'interface sur un type

*Une classe peut implementer plusieurs interfaces*
* Separez avec un coma
* Peut en implementer autant que necessaire

```java
public interface ServiceSpecial extends Service, Implemnt2 ... {
  
  default void afficherNom() {
    System.out.println("Nom du service special : inconnu");
  }
}
```


*Declaration des interfaces*
* Utiliser le mot-cle de **interface**
* Membres implicitement publics

*Les attributs*
* Valeurs constantes

*Methodes*
* Nom, paramètres et type de retour
* N'ont normalement pas de corps

```java
interface AfficheType {
    void afficherType();
}

class Personne implements AfficheType {
    
    public void afficherType() {
        System.out.println(" Je suis une personne ");
    }
}

class Voiture implements AfficheType {

    public void afficherType() {
        
        System.out.println(" Je suis une voiture ");
    }
}

```

*Methode par defaut (a partir de java 8)*
* Avoir un corps
* Permet d'ajouter des methodes a l'interface sans casser les classes existantes
* Il est possible d'utiliser les methodes par defaut (default method) dans une interface. Elles permettent de definir le comportement d'une methode dans l'interface dans laquelle elle est definie. Si aucune implementation de la methode n'est fournie dans une classe qui implemente l'interface alors c'est le comportement defini dans l'interface qui sera utilise.


```java
public interface MonInterface {
  default void maMethode() {
    System.out.println("Implementation par defaut");
  }

```


### Types imbriqués et classes anonymes

*Types imbriques*
* Membres de type englobant
* Peut acceder aux membres prives de type englobant

*Types d'imbrication pour nommer la portee (scope)*
* Nom des portees dans le type englobant
* Aucune relation entre les instances de type imbrique et de type englobant

*Classe interne*
* Relation etroite avec la classe englobante
* Une instance de classe imbriquee associee a une instance de classe englobant

Ce sont des classes qui sont définies dans une autre classe. Les difficultés dans leur utilisation concernent leur visibilité et leur accès aux membres de la classe dans laquelle elles sont définies.

```java
public class ClassePrincipale1 {
  class ClasseInterne {
  }
}
```
Les classes internes sont particulierement utiles pour :
* permettre de definir une classe a l'endroit ou une seule autre en a besoin
* definir des methodes de type callback d'une façon generale

```java
public class ClassePrincipale8 {
  public class ClasseInterne {
  }

  public static void main(String[] args) {
    ClassePrincipale8 cp = new ClassePrincipale8();
    ClassePrincipale8.ClasseInterne ci = cp. new ClasseInterne() ;
    System.out.println(ci.getClass().getName());
  }
}
// java ClassePrincipale8
// ClassePrincipale8$ClasseInterne
```

*Classes interne static*
Les classes internes non statiques (member inner-classes) sont definies dans une classe dite « principale » (top-level class) en tant que membres de cette classe. Leur avantage est de pouvoir acceder aux autres membres de la classe principale même ceux declares avec le modificateur private.

```java
public class ClassePrincipale20 {
  private int valeur = 1;
  
  class ClasseInterne {
    public void afficherValeur() {
      System.out.println("valeur = "+valeur);  
    }
  }

  public static void main(String[] args) {
    ClassePrincipale20 cp = new ClassePrincipale20();
    ClasseInterne ci = cp. new ClasseInterne();
    ci.afficherValeur();
  }  
}
// valeur = 1
```

*Classe interne ayant les meme nom d'attribut*

Il faut utiliser la version qualifiee du mot cle this pour acceder au membre de la classe principale. La qualification se fait avec le nom de la classe principale ou plus generalement avec le nom qualifie d'une des classes englobantes.


```java

public class ClassePrincipale18 {
  int var = 5;
  
  class ClasseInterne {
    int var = 3;

    public void affiche() {
      System.out.println("var                          = "+var);
      System.out.println("this.var                     = "+this.var);
      System.out.println("ClassePrincipale18.this.var  = "
        +ClassePrincipale18.this.var);
    }
  }

  ClasseInterne ci = this. new ClasseInterne();

  public static void main(String[] args) {
    ClassePrincipale18 cp = new ClassePrincipale18();
    ClasseInterne ci = cp. new ClasseInterne();  
    ci.affiche();
  }
}
// var                          = 3
// this.var                     = 3
// ClassePrincipale18.this.var  = 5
```


*Classes anonymes*
* Declare dans le cadre de leur creation
* Peut implementer des methodes
* Peut surcharger les methodes

*Les classes anonymes sont des classes interne*
Associe a l'instance de classe contenant


## Retour sur les Interfaces et Abstracts

### Etude d'un code sans ces concepts (attention ce code n'est pas correct et sera refactorise)

Le programme permet de connaitre le revenu d'un engagement client sur un projet.

Cela est calcule a l'aide de la classe ClientEngagement, avec ces attributs :
* nom du client (String client)
* de son nombre d'heures de travail (int hoursWorked)
* d'un montant de revenu anticipe (double anticipatedRevenue).

Ces attributs sont des constantes et doivent etre finaux.

On initialise les attributs membres de la classe à l'aide de son constructeur et nous creons les getters, setters et redefinissons la methode toString() (Override).

```java
ClientEngagement.java
package com.ruffin.interfaceAndAbstract;

public class ClientEngagement {

	private final String client;
	private final int hoursWorked;
	private final double anticipatedRevenue;

	public ClientEngagement(String client, int hoursWorked, double anticipatedRevenue) {
		super();
		this.client = client;
		this.hoursWorked = hoursWorked;
		this.anticipatedRevenue = anticipatedRevenue;
	}

	public String getClient() {
		return client;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public double getAnticipatedRevenue() {
		return anticipatedRevenue;
	}	

	@Override
	public 		String toString() {
		return "Contenu de la classe com.ruffin.interfaceAndAbstract.ClientEngagement :" +
				"Client : '"+client+ '\'' +
				", hoursWorked : " + hoursWorked +
				", anticipatedRevenu : " + anticipatedRevenue;
	}
}
```

Exemple, du client ruffin ou nous estimerons le temps de travail pour son projet de 100 heures et cela coutera 15000$ au client ruffin.

```java
RevenueCalculatorRunner.java
public class RevenueCalculatorRunner {

	public static void main(String[] args) {
		
		final ClientEngagement clientEngagement = new ClientEngagement("ruffin", 100, 15000);

	}
}
```

Nous allons evaluer trois modeles de calcule different de revenu:
* Revenu par heure (hourly)
* Revenu avec une tartification forfaitaire (FixedFee)
* Revenu avec un pourcentage de royalty (royalyPercentage)

Pour le calcul du revenu par heure, nous allons faire appel à la methode price de la classe RevenueCalculator, qui prendra en parametre le type de calcule (ici Hourly) ainsi qu'un ClientEngagement, pour faire le calcule nombre d'heure travaille par taux horaire).

 ```java
RevenueCalculatorRunner.java
// Prix horaire
final double hourlyPrice = RevenueCalculator.price("Hourly", clientEngagement);
System.out.println("Prix horaire : " + hourlyPrice);
 ```

Calcul:

 ```java
RevenueCalculator.java
package com.ruffin.interfaceAndAbstract;

public class RevenueCalculator {

	private static final double HOURLY_RATE = 50;
	private static final double FIXED_FREE = 500;
	private static final double ROYALTY_PERCENTAGE = 0.15;

	public static double price(final String methodeCalcul, final ClientEngagement clientEngagement) {
		switch (methodeCalcul) {
		case "Hourly":
			return HOURLY_RATE * clientEngagement.getHoursWorked();

		default:
			break;
		}
		return 0;
	}
}
 ```

Executons le code, retourne : Prix horaire : 5000.0

Ajoutons les deux autres methodes de calcul FixedFee et RoyaltyPercentage.
Le probleme de ce code est qu'il est tres lents, pas optimise ni maintenable.  

**Mauvaises pratiques**
*Codez tout en un seul endroit*
* Ne s'adapte pas, difficile à localiser

*Difficile a extends*
* Besoin de modifier le code de calculateur pour changer quoi que ce soit

*Difficile a configurer*
* Variable de methode fortement type sans moyen de modifier les taux

**Bonnes pratiques**
Utiliser les classes abstraites et les interfaces.




## Trucs et astuces

*Comparer des Objets*
* En effet '==' permet uniquement de comparer les references des objets (adresse memoire)
* Pour comparer l'egalite des variables de deux instances, il faut munir la classe d'une methode a cet effet : la methode equals() heritee de Object.

Pour s'assurer que deux objets sont de la même classe, il faut utiliser la methode getClass() de la classe Object dont toutes les classes heritent.



```java
Rectangle r1 = new Rectangle(100,50);
Rectangle r2 = new Rectangle(100,50);
Boolean s1,s2;
s1 = r1 == r1;
s2 = r1 == r2;
System.out.println("Test comparaison reference de 2 objets de type Rectangles avec r1 == r1 : " + s1); // true
System.out.println("Test comparaison reference de 2 objets de type Rectangles avec r1 == r2 : " + s2); // false
System.out.println("Test comparaison 2 objets de type Rectangles avec r1.getClass().equals(r2.getClass()) : " + r1.getClass().equals(r2.getClass())); // true
```

*InstanceOf*

L'opérateur instanceof permet de déterminer la classe de l'objet qui lui est passé en paramètre.

```java
Double testDouble = 0.25d;
if (testDouble instanceof Double) {
	System.out.println("testDouble est de la classe Double");
}
```

*Conseils sur l'heritage*

Lors de la creation d'une classe « mere » il faut tenir compte des points suivants :

* la definition des acces aux variables d'instances, très souvent privees, doit etre reflechie entre protected et private

* pour empecher la redefinition d'une methode ou sa surcharge, il faut la declarer avec le modificateur final

*Lors de la creation d'une classe fille, pour chaque methode heritee qui n'est pas final, il faut envisager les cas suivants :*

* la methode heritee convient a la classe fille : on ne doit pas la redefinir
* la methode heritee convient mais partiellement du fait de la specialisation apportee par la classe fille : il faut la redefinir voire la surcharger. La plupart du temps une redefinition commencera par appeler la methode heritee (en utilisant le mot cle super) pour garantir l'evolution du code
* la methode heritee ne convient pas : il faut redefinir ou surcharger la methode sans appeler la methode heritee lors de la redefinition.

