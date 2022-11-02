
# Observer
## Intention
> L’Observateur est un patron de conception comportemental qui permet de mettre en place un mécanisme de souscription pour envoyer des notifications à plusieurs objets, au sujet d’événements concernant les objets qu’ils observent.


## Solution
> L’objet que l’on veut suivre est en général appelé sujet, mais comme il va envoyer des notifications pour prévenir les autres objets dès qu’il est modifié, nous l’appellerons diffuseur (publisher). Tous les objets qui veulent suivre les modifications apportées au diffuseur sont appelés des souscripteurs (subscribers).

> Le patron de conception Observateur vous propose d’ajouter un mécanisme de souscription à la classe diffuseur pour permettre aux objets individuels de s’inscrire ou se désinscrire de ce diffuseur. Pas d’inquiétude ! Ce n’est pas si compliqué que cela en a l’air. En réalité, ce mécanisme est composé 1) d’un tableau d’attributs qui stocke une liste de références vers les objets souscripteur et 2) de plusieurs méthodes publiques qui permettent d’ajouter ou de supprimer des souscripteurs de cette liste.


<img src="/home/merlin/projets/back/DP/alldp/src/main/java/org/ttm/behavior/observer/observer.solution1.png">
<div style="width:100%; height:1px;background:white;"></div>
<img src="/home/merlin/projets/back/DP/alldp/src/main/java/org/ttm/behavior/observer/observer.solution2.png">

## Structure

<img src="/home/merlin/projets/back/DP/alldp/src/main/java/org/ttm/behavior/observer/observer.structure.png">

## Possibilités d’application
<b>Utilisez le patron de conception Observateur quand des modifications de l’état d’un objet peuvent en impacter d’autres, et que l’ensemble des objets n’est pas connu à l’avance ou qu’il change dynamiquement.</b>

Ce problème est souvent rencontré lorsque l’on travaille sur des classes d’une interface utilisateur graphique. Par exemple, si vous créez des classes bouton personnalisées et que vous voulez que les clients puissent y ajouter du code déclenché par le clic d’un utilisateur.

L’observateur permet à tous les objets qui suivent l’interface souscripteur de s’inscrire aux notifications des événements des objets diffuseur. Vous pouvez ajouter le mécanisme de souscription à tous vos boutons et laisser les clients mettre leur code personnalisé dans des classes souscripteur personnalisées.

<b>Utilisez ce patron quand certains objets de votre application doivent en suivre d’autres, mais seulement pendant un certain temps ou dans des cas spécifiques.</b>

La liste d’inscription est dynamique, les souscripteurs peuvent donc rejoindre ou quitter la liste quand ils le désirent.

## Avantages

-  Principe ouvert/fermé. Vous pouvez ajouter de nouvelles classes souscripteur sans avoir à modifier le code du diffuseur (et inversement si vous avez une interface diffuseur).
-  Vous pouvez établir des relations entre les objets lors du lancement de l’application.

## Inconvénients
-  Les souscripteurs sont avertis dans un ordre aléatoire.
