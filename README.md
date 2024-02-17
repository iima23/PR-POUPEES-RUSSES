                                                     PR-POUPEES-RUSSES

* OBJECTIF :
      L'objectif de ce projet consiste à développer une application console en Java qui simule des poupées russes de diverses tailles, en parallèle avec la conception et la modélisation d'une application de gestion de collection de ces poupées en utilisant UML.

* Classe de Base : Poupee

--La classe Poupee représente la base de la hiérarchie. Elle encapsule les propriétés communes à toutes les poupées.
--La classe Poupee doit avoir un constructeur permettant d'initialiser une poupée avec une taille donnée.
--Les propriétés (taille, ouverte) doivent être encapsulées et accessibles via des méthodes d'accès.
--La classe Poupee doit avoir les méthodes abstraites suivantes :

* Classe Concrète : PoupéeRusse

--La classe PoupéeRusse hérite de la classe de base Poupee et implémente les méthodes spécifiques.
--Le constructeur de la classe PoupéeRusse doit appeler le constructeur de la classe de base.
--Les méthodes ouvrir, fermer, placerDans et sortirDe doivent être implémentées pour respecter les spécifications de la classe de base.
