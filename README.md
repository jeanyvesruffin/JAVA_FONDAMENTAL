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



### Variables final

Une variable final est utilise, par exemple, pour definir une constante et ainsi eviter sa reaffectation par une autre valeur.

```java
//Constante
final int nombreMAx = 1542 ;
```


## Les donnees de type primitives

*Entier (Nombre)*

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



* Carateres

```java
//Constante
final int nombreMAx = 1542 ;
```

* Boolean

```java
//Constante
final int nombreMAx = 1542 ;
```


## Le stockage des donnees de type primitives
## Les operateurs arithmetiques

## La convertion des types de donnees