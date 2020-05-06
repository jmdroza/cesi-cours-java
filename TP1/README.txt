Exercice 1.1
javac Bonjour.java
java Bonjour

Exercice 1.2
javac BonjourPersonnalise.java
java BonjourPersonnalise
**Il faut rentrer son prénom à ce moment-là

Exercice 1.4
javadoc -d "javadoc" Bonjour.java

Exercice 1.5
--Creation de l'archive
jar cvmf manifestBonjour.txt Bonjour.jar Bonjour.java
--Execution de l'archive
java -jar Bonjour.jar