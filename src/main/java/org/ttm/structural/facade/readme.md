
# Facade
## Intention
> Façade est un patron de conception structurel qui procure une interface offrant un accès simplifié à une librairie, un framework ou à n’importe quel ensemble complexe de classes.

## pseudo code
> Dans cet exemple, la Façade simplifie l’interaction avec un framework complexe de conversion vidéo.

<img src="/home/merlin/projets/back/DP/alldp/src/main/java/org/ttm/structural/facade/example.png">
<br>

## Possibilités d’application
<b>Utilisez la façade si vous avez besoin d’une interface limitée mais directe à un sous-système complexe.</b>

Souvent, les sous-systèmes gagnent en complexité avec le temps et mettre en place un patron de conception implique de créer de nouvelles classes. Dans de nombreux contextes, un sous-système peut se révéler plus souple et facile à réutiliser, mais la quantité de travail pour configurer et écrire le code de base ne fait que croitre. La façade tente de remédier à ce problème en fournissant un raccourci aux fonctionnalités du sous-système qui sont adaptées au besoin du client.

<b> Utilisez la façade si vous voulez structurer un sous-système en plusieurs couches.</b>

Créez des façades pour définir des points d’entrée à chaque niveau d’un sous-système. Vous pouvez réduire le couplage entre plusieurs sous-systèmes en les obligeant à communiquer au travers de façades.

> Reprenons notre exemple de framework de conversion vidéo. Il peut être désassemblé en deux couches : 
> tout ce qui concerne la vidéo d’un côté et l’audio de l’autre. Créez une façade pour chaque couche. 
> Vous pouvez utiliser ce genre de façades pour faire communiquer les classes de ces couches ensemble. 
> Cette approche peut fortement ressembler au patron de conception <b>Médiateur</b>.

## Avantages

- Vous pouvez isoler votre code de la complexité d’un sous-système.

## Inconvénients
-  Une façade peut devenir un objet omniscient couplé à toutes les classes d’une application.

