# Projet JSON - Partie principal - IDM
## M2 MIAGE - Université Rennes 1 - Maud Garçon & Emmanuel Chauvel

Vous trouverez dans ce Git le code source du projet principal d'IDM.

Ce projet contient :
- notre grammaire json
- notre compilateur json en java
- notre compilateur json en python

Nous avons séparé la partie statistique par manque de connaissance et de temps dans un autre git.
Lien du git de la partie statistique : https://github.com/ChibiMG/IDM_Stats

### Description
La grammaire de ce projet est présente dans le package org.xtext.example.idmProjet > org.xtext.example.mydsl > MyDsl.xtext.
Les fichiers de tests et d'exécution des deux compilateurs sont présents dans le package org.xtext.example.idmProjet.tests > src > org.xtext.example.mydsl.tests. Les fichiers correspondant aux deux compilateurs sont aussi présents.

### Prérequis
Le compilateur Java a besoin du package org.json.simple pour fonctionner, téléchargeable sur ce site http://www.java2s.com/Code/Jar/j/Downloadjsonsimple11jar.htm.
