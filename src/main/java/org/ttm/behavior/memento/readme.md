
# Memento
## Intention
> Mémento est un patron de conception comportemental qui permet de sauvegarder et de rétablir l’état précédent d’un objet sans révéler les détails de son implémentation.


## Solution
> Tous les problèmes que nous rencontrons sont provoqués par une mauvaise encapsulation. Certains objets essayent d’en faire plus que ce qu’ils sont supposés faire. Pour récupérer les données dont ils ont besoin pour effectuer une action, ils envahissent l’espace personnel des autres objets, plutôt que de leur demander d’exécuter l’action eux-mêmes.

> Le mémento délègue la création des états des photos à leur propriétaire, l’objet créateur (originator). Plutôt que d’essayer de copier l’état de l’éditeur depuis « l’extérieur », la classe de l’éditeur de texte peut prendre la photo elle-même, car elle a accès à son propre état.

> Ce patron propose de stocker la copie de l’état de l’objet dans un objet spécial appelé mémento. Son contenu n’est accessible que pour l’objet qui l’a créé. Les autres objets peuvent communiquer avec les mémentos via une interface limitée qui leur permet de récupérer certaines métadonnées de la photo (date de création, nom de l’action effectuée, etc.), mais pas l’état de l’objet original contenu dans la photo.


<img src="/home/merlin/projets/back/DP/alldp/src/main/java/org/ttm/behavior/memento/solution.png">
<div style="width:100%; height:1px;background:white;"></div>


## Structure
Implémentation basée sur des classes imbriquées
<img src="/home/merlin/projets/back/DP/alldp/src/main/java/org/ttm/behavior/memento/structure.png">
<div style="width:100%; height:1px;background:white;"></div>

Implémentation avec une encapsulation encore plus stricte
Si vous ne voulez vraiment pas que les autres classes accèdent au créateur en passant par le mémento, vous pouvez vous y prendre différemment.

<img src="/home/merlin/projets/back/DP/alldp/src/main/java/org/ttm/behavior/memento/structure3.png">
<div style="width:100%; height:1px;background:white;"></div>
