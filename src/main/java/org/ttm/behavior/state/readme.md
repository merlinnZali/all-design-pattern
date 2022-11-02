

# State
## Intention
> État est un patron de conception comportemental qui permet de modifier le comportement d’un objet lorsque son état interne change. L’objet donne l’impression qu’il change de classe.


## Solution
> Le patron de conception état propose de créer de nouvelles classes pour tous les états possibles d’un objet et d’extraire les comportements liés aux états dans ces classes.

> Plutôt que d’implémenter tous les comportements de lui-même, l’objet original que l’on nomme contexte, stocke une référence vers un des objets état qui représente son état actuel. Il délègue tout ce qui concerne la manipulation des états à cet objet.


<img src="/home/merlin/projets/back/DP/alldp/src/main/java/org/ttm/behavior/state/state.solution.png">
<div style="width:100%; height:1px;background:white;"></div>

## Structure
<img src="/home/merlin/projets/back/DP/alldp/src/main/java/org/ttm/behavior/state/state.structure.png">

## Possibilités d’application
<b>Utilisez le patron de conception état lorsque le comportement de l’un de vos objets varie en fonction de son état, qu’il y a beaucoup d’états différents et que ce code change souvent.</b>

Ce patron vous propose d’extraire tout le code lié aux états et de le mettre dans des classes distinctes. Ceci vous permet d’ajouter de nouveaux états ou de modifier ceux qui existent indépendamment des autres, et de réduire les coûts de maintenance.

<b>Utilisez ce patron si l’une de vos classes est polluée par d’énormes blocs conditionnels qui modifient le comportement de la classe en fonction de la valeur de ses attributs.</b>

Le patron de conception état vous permet d’extraire des branches de ces conditions et de les transformer en méthodes dans les classes état. Tout en faisant vos modifications, vous pouvez retirer les attributs temporaires et les méthodes qui gèrent les changements d’état du code de votre classe principale.

<b>Utilisez ce patron de conception si vous avez trop de code dupliqué dans des états et transitions similaires de votre automate.</b>

Le patron de conception état vous permet d’assembler des hiérarchies de classes état et de réduire la duplication de code en regroupant le code commun dans des classes de base abstraites.


## Avantages

- Principe de responsabilité unique. Organisez le code lié aux différents états dans des classes séparées.
- Principe ouvert/fermé. Ajoutez de nouveaux états sans modifier les classes état ou le contexte existants.
- Simplifiez le code du contexte en éliminant les gros blocs conditionnels de l’automate.

## Inconvénients
-  L’utilisation de ce patron est un peu exagérée si votre automate n’a que quelques états ou qu’il y a peu de transitions.

