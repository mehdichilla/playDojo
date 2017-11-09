# playFrameworkDojo

Ce TP permet de decouvrir [`Play Framework 2.6`] (https://www.playframework.com/) et son écosystème  


## le Sujet

Sujet en deux parties : 
Partie 1:
Lors de ce dojo je vous propose de developper une api rest permettant la gestion de sa mediatheque

Partie 2:

Consommation de l'api via une application ios/swift proposé par jean-baptiste

### Fonctionnalités :

*Ajouter un item(cd, livre , jeux de société , film ....) selon sa catégorie

*Lister les items par categorie

*Afficher la fiche detaillée d'un item

*Supprimer un item

*Afficher l'etat d'avancement de possession d'une collection

## Près-requis technique

Afin de realiser ce workshop il est necessaire d'installer sur sa machine:

*Git

*Ide Prefere

*Java (JDK8)

*SBT installation sur mac via homebrew [`sbt`] (http://www.scala-sbt.org/download.html)

## Debut du dojo 

### Etape 1 Creation du projet

Creation nouveau projet soit via intellij (cration new project javaEE play 2)
soit en ligne de commande "sbt new playframework/play-java-seed.g8"
After that, use sbt run and then go to http://localhost:9000 to see the running server.

### Etape 2 Configuration et connexion a la base 

     Application.conf
     Build.sbt
     Plugins.sbt
     logback.xml


### Etape 3 Nos Models

Création des models:

    livre
    musique
    jeux de societe
    film

### Etape 4 Nos Controllers 

Création des controllers associés 


### Etape 5 Les routes

definir les les actions a utiliser selon l'url et la methode utilisé (POST/GET/....) 

### Etape 6 

 