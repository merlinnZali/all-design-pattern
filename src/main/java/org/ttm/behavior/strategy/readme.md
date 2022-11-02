
# Strategy
## Intention
> Stratégie est un patron de conception comportemental qui permet de définir une famille d’algorithmes, 
de les mettre dans des classes séparées et de rendre leurs objets interchangeables.

<img src="./strategy.png">
<div style="width:100%; height:1px;background:white;"></div>
<img src="./strategy.structure.png">

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


