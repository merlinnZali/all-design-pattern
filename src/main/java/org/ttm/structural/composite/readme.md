
# Bridge
## Intention
>Composite est un patron de conception structurel qui permet d’agencer les objets dans des arborescences afin de pouvoir traiter celles-ci comme des objets individuels.

## tructure
<img src="./structure.png">
<div style="width:100%; height:1px;background:white;"></div>

## example
>Dans cet exemple, le patron de conception Composite nous permet de gérer des imbrications de formes géométriques dans un éditeur graphique.
> 
<img src="./example.png">

## Possibilités d’application
<b>Utilisez le pont dans les situations où vous souhaitez diviser et organiser une classe monolithique composée de plusieurs variantes d’une fonctionnalité (par exemple, si la classe fonctionne avec différents serveurs de base de données).</b>

Plus une classe grandit, plus il est difficile de comprendre son fonctionnement et plus les modifications prennent du temps. Les modifications apportées à l’une des variantes de la fonctionnalité vont demander des changements dans toute la classe, ce qui risque de créer des erreurs ou de provoquer des effets de bord critiques.

Le pont vous permet de diviser la classe monolithique en plusieurs hiérarchies de classes. Ensuite, les classes d’une hiérarchie peuvent être modifiées indépendamment des classes des autres hiérarchies. La maintenance du code devient ainsi plus simple et minimise les risques de bugs.

<b>Utilisez le pont si vous voulez étendre une classe dans plusieurs dimensions orthogonales (indépendantes).</b>

Le pont vous propose de construire une hiérarchie de classes séparée pour chaque dimension. La classe d’origine délègue la tâche aux objets de ces hiérarchies plutôt que de tout faire par elle-même.

<b>Utilisez ce patron si vous voulez être en mesure de changer d’implémentation dès le lancement de l’application.</b>

Grâce à ce patron, l’objet de l’implémentation peut être déplacé à l’intérieur de l’abstraction. Cette manipulation n’est pas obligatoire, mais elle est aussi simple à mettre en place que de donner une valeur à un attribut.

> J’en profite pour vous informer que ce dernier point pousse souvent les développeurs à confondre le pont et la <b>Stratégie.</b>
> Rappelez-vous bien qu’un patron n’est pas seulement une manière de structurer vos classes,
> c’est aussi un moyen de communiquer votre intention ou de répondre à un problème.


## Avantages

- Vous pouvez créer des classes et des applications multiplateformes.
- Le code client manipule des abstractions de haut niveau. Il n’est pas dépendant des détails de la plateforme.
- Principe ouvert/fermé. Vous pouvez introduire de nouvelles abstractions et implémentations indépendamment les unes des autres.
- Principe de responsabilité unique. Vous pouvez vous concentrer sur la logique de haut niveau dans l’abstraction, et sur les détails de la plateforme dans l’implémentation.

## Inconvénients
- Le code va devenir plus compliqué si vous introduisez ce patron dans une classe très cohésive.
