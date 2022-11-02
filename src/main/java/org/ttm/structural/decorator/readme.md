
# Decorator
## Alias : Emballeur, Empaqueteur, Wrapper, Decorator
## Intention
> Décorateur est un patron de conception structurel qui permet d’affecter dynamiquement de nouveaux comportements à des objets en les plaçant dans des emballeurs qui implémentent ces comportements.

## tructure
<img src=".solution.png">
Des méthodes de notification deviennent des décorateurs.
<div style="width:100%; height:1px;background:white;"></div>
<br>
<img src=".solution2.png">
Les applications peuvent configurer des piles complexes de décorateurs pour les notifications.
<div style="width:100%; height:1px;background:white;"></div>
<br>

## pseudo code
> Dans cet exemple, le Décorateur permet la compression et le chiffrage des données indépendamment du code qui les utilise.

<img src=".example.png">
<br>

## Possibilités d’application
<b>Utilisez le décorateur si vous avez besoin d’ajouter des comportements supplémentaires au moment de l’exécution sans avoir à altérer le code source de ces objets.</b>

Le décorateur vous permet de structurer votre logique métier en couches, de créer un décorateur pour chacune de ces couches et de décorer les objets avec différentes combinaisons au moment de l’exécution. Le code client peut traiter les objets uniformément puisqu’ils implémentent la même interface.

<b>Utilisez ce patron si l’héritage est impossible ou peu logique pour étendre le comportement d’un objet.</b>

De nombreux langages de programmation permettent l’utilisation du mot clé final pour interdire l’héritage une classe. Le seul moyen d’étendre le comportement d’une telle classe est de l’emballer en utilisant un décorateur.

## Avantages

- Vous pouvez étendre le comportement d’un objet sans avoir recours à la création d’une nouvelle sous-classe.
- Vous pouvez ajouter ou retirer dynamiquement des responsabilités à un objet au moment de l’exécution
-  Vous pouvez combiner plusieurs comportements en emballant un objet dans plusieurs décorateurs.
- Principe de responsabilité unique. Vous pouvez découper une classe monolithique qui implémente plusieurs comportements différents en plusieurs petits morceaux.

## Inconvénients
- Retirer un emballeur spécifique de la pile n’est pas chose aisée.
- Il n’est pas non plus aisé de mettre en place un décorateur dont le comportement ne varie pas en fonction de sa position dans la pile.
- Le code de configuration initial des couches peut avoir l’air assez moche.

