
# Alias : Wrapper, Adapter
## Intention
> L’Adaptateur est un patron de conception structurel qui permet de faire collaborer des objets ayant des interfaces normalement incompatibles.

## solution
> Vous créez un adaptateur. C’est un objet spécial qui convertit l’interface d’un objet afin qu’un autre objet puisse le comprendre.

> Un adaptateur encapsule un des objets afin de masquer la complexité de la conversion, exécutée à l’ombre des regards. L’objet encapsulé n’a pas conscience de ce que fait l’adaptateur. Par exemple, vous pouvez encapsuler un objet qui calcule en mètres et en kilomètres avec un adaptateur qui effectue la conversion de toutes les données en unités impériales comme les pieds et les milles.

> Les adaptateurs peuvent non seulement effectuer des conversions dans différents formats, mais ils peuvent également aider différentes interfaces à collaborer. Le fonctionnement de l’adaptateur est le suivant :

 - L’adaptateur prend une interface compatible avec un des objets existants.
 - L’objet existant peut appeler les méthodes de l’adaptateur via cette interface en toute sécurité.
 - Lorsque l’adaptateur reçoit un appel, il passe la requête au second objet dans un format et dans un ordre qu’il peut interpréter.


<img src="./solution.png">


### Adaptateur d’objets
>Cette implémentation a recours au principe de composition : l’adaptateur implémente l’interface d’un objet et en encapsule un autre. Elle peut être utilisée dans tous les langages de programmation classiques.

<img src="./structure-object-adapter.png">

### pseudo code

<img src="./example.png">


## Possibilités d’application
<b> Utilisez l’adaptateur de classe si vous avez besoin d’une classe existante, mais que son interface est incompatible avec votre code.</b>

L’adaptateur permet de créer une classe faisant office de couche intermédiaire. Cette couche sert de convertisseur entre votre code et une classe héritée ou externe, ou n’importe quelle classe avec une interface incongrue.

<b>Mettez en place l’adaptateur si vous désirez réutiliser plusieurs sous-classes existantes à qui il manque des fonctionnalités communes qui ne peuvent pas être remontées dans la classe mère.</b>

Vous pourriez étendre chaque sous-classe et mettre la fonctionnalité manquante dans les nouvelles sous-classes. En revanche, vous allez devoir dupliquer le code dans ces nouvelles classes, ce qui n’est pas terrible.

> Pour une solution un peu plus élégante, vous pouvez mettre la fonctionnalité manquante dans une classe adaptateur. Ensuite, encapsulez les objets avec les fonctionnalités manquantes à l’intérieur de l’adaptateur, les rendant disponibles dynamiquement. Pour que cela fonctionne, les classes ciblées doivent implémenter une interface commune, et l’attribut de l’adaptateur doit implémenter cette interface. 
> Cette solution se rapproche du patron de conception <b>Décorateur</b>.

## Avantages

- Principe de responsabilité unique. Vous découplez l’interface ou le code de conversion des données, de la logique métier du programme.
- rincipe ouvert/fermé. Vous pouvez ajouter de nouveaux types d’adaptateurs dans le programme sans modifier le code client existant. Ces adaptateurs doivent forcément passer par l’interface du client.

## Inconvénients
- La complexité générale du code augmente, car vous devez créer un ensemble de nouvelles classes et interfaces. Parfois, il est plus simple de modifier la classe du service afin de la faire correspondre avec votre code.
