
# Strategy
## Intention
> Stratégie est un patron de conception comportemental qui permet de définir une famille d’algorithmes, 
de les mettre dans des classes séparées et de rendre leurs objets interchangeables.

<img src="/home/merlin/projets/back/DP/alldp/src/main/java/org/ttm/behavior/strategy.png">
<div style="width:100%; height:1px;background:white;"></div>
<img src="/home/merlin/projets/back/DP/alldp/src/main/java/org/ttm/behavior/strategy.structure.png">

## Possibilités d’application
<b>Utilisez le patron de conception stratégie si vous voulez avoir différentes variantes d’un algorithme à l’intérieur d’un objet à disposition, 
et pouvoir passer d’un algorithme à l’autre lors de l’exécution.</b>

Ce patron vous permet de modifier indirectement le comportement de l’objet lors de l’exécution, en l’associant avec différents sous-objets qui peuvent accomplir des sous-tâches spécifiques de différentes manières.

<b>Utilisez la stratégie si vous avez beaucoup de classes dont la seule différence est leur façon d’exécuter un comportement.</b>

Ce patron vous permet d’extraire des variantes d’un comportement dans une hiérarchie de classes séparées et de combiner les classes originales dans une seule, évitant de dupliquer du code.

<b>Utilisez la stratégie pour isoler la logique métier d’une classe, 
de l’implémentation des algorithmes dont les détails ne sont pas forcément importants pour le contexte.</b>

Ce patron vous permet de séparer le code, les données internes et les dépendances des divers algorithmes du reste du code. Une interface toute simple permet aux clients d’exécuter les algorithmes et d’en changer lors de l’exécution.

<b>Utilisez ce patron si votre classe possède un gros bloc conditionnel qui choisit entre différentes variantes du même algorithme.</b>

La stratégie vous débarrasse de toutes ces conditions en extrayant tous les algorithmes dans des classes séparées, et ces dernières implémentent toutes la même interface. L’objet original délègue l’exécution à l’un de ces objets, au lieu d’implémenter toutes les variantes de l’algorithme.

## Avantages

- Vous pouvez permuter l’algorithme utilisé à l’intérieur d’un objet à l’exécution.
- Vous pouvez séparer les détails de l’implémentation d’un algorithme et le code qui l’utilise.
- Vous pouvez remplacer l’héritage par la composition.
- Principe ouvert/fermé. Vous pouvez ajouter de nouvelles stratégies sans avoir à modifier le contexte.

## Inconvénients
- Si vous n’avez que quelques algorithmes qui ne varient pas beaucoup, nul besoin de rendre votre programme plus compliqué avec les nouvelles classes et interfaces qui accompagnent la mise en place du patron.
- Les clients doivent pouvoir comparer les différentes stratégies et choisir la bonne.

## Alternatives
- De nombreux langages de programmation modernes gèrent les types fonctionnels et vous permettent d’implémenter différentes versions d’un algorithme à l’intérieur d’un ensemble de fonctions anonymes. Vous pouvez ensuite utiliser ces fonctions exactement comme vous le feriez pour des objets stratégie, sans encombrer votre code avec des classes et interfaces supplémentaires.





# Patron de méthode
## Intention
> Patron de Méthode est un patron de conception comportemental qui permet de mettre le squelette d’un algorithme dans la classe mère, mais laisse les sous-classes redéfinir certaines étapes de l’algorithme sans changer sa structure.

<img src="/home/merlin/projets/back/DP/alldp/src/main/java/org/ttm/behavior/patron.problem.png">
<div style="width:100%; height:1px;background:white;"></div>

## Solution
> Le patron de méthode vous propose de découper un algorithme en une série d’étapes, de transformer ces étapes en méthodes et de mettre l’ensemble des appels à ces méthodes dans une seule méthode socle, le patron de méthode. Les étapes peuvent être abstraites ou avoir une implémentation par défaut. Pour utiliser l’algorithme, le client doit fournir sa propre sous-classe, implémenter toutes les étapes abstraites et redéfinir certaines d’entre elles si besoin (mais pas la méthode socle elle-même).

<img src="/home/merlin/projets/back/DP/alldp/src/main/java/org/ttm/behavior/patron.solution.png">
<div style="width:100%; height:1px;background:white;"></div>

<img src="/home/merlin/projets/back/DP/alldp/src/main/java/org/ttm/behavior/patron.structure.png">

## Avantages

- Vous permettez aux clients de redéfinir certaines parties d’un grand algorithme. Elles sont ainsi moins affectées par les modifications apportées aux autres parties de l’algorithme.
- Vous pouvez remonter le code dupliqué dans la classe mère.

## Inconvénients
- Certains clients peuvent être limités à cause du squelette de l’algorithme.
Vous ne respectez pas le Principe de substitution de Liskov, si vous supprimez l’implémentation d’une étape par défaut dans une sous-classe.
- Plus vous avez d’étapes, plus le patron de méthode devient difficile à maintenir.

## Alternatives
- De nombreux langages de programmation modernes gèrent les types fonctionnels et vous permettent d’implémenter différentes versions d’un algorithme à l’intérieur d’un ensemble de fonctions anonymes. Vous pouvez ensuite utiliser ces fonctions exactement comme vous le feriez pour des objets stratégie, sans encombrer votre code avec des classes et interfaces supplémentaires.




# State
## Intention
> État est un patron de conception comportemental qui permet de modifier le comportement d’un objet lorsque son état interne change. L’objet donne l’impression qu’il change de classe.


## Solution
> Le patron de conception état propose de créer de nouvelles classes pour tous les états possibles d’un objet et d’extraire les comportements liés aux états dans ces classes.

> Plutôt que d’implémenter tous les comportements de lui-même, l’objet original que l’on nomme contexte, stocke une référence vers un des objets état qui représente son état actuel. Il délègue tout ce qui concerne la manipulation des états à cet objet.


<img src="/home/merlin/projets/back/DP/alldp/src/main/java/org/ttm/behavior/state.solution.png">
<div style="width:100%; height:1px;background:white;"></div>

## Structure
<img src="/home/merlin/projets/back/DP/alldp/src/main/java/org/ttm/behavior/state.structure.png">

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

