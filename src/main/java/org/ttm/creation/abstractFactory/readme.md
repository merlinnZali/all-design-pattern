
# AbstractFabrique
## Intention
> Fabrique abstraite est un patron de conception qui permet de créer des familles d’objets apparentés sans préciser leur classe concrète.

## solution
> La première chose que propose la fabrique abstraite est de déclarer explicitement des interfaces pour chaque produit de la famille de produits (dans notre cas : chaise, sofa, table basse). Toutes les autres variantes de produits peuvent ensuite se servir de ces interfaces. Par exemple, toutes les variantes de chaises peuvent implémenter l’interface Chaise ; toutes les variantes de tables basses peuvent implémenter TableBasse, etc.


<img src="./solution1.png">
<div style="width:100%; height:1px;background:white;"></div>

> La prochaine étape est de déclarer la fabrique abstraite — une interface armée d’une liste de méthodes de création pour toutes les familles de produits (par exemple : créerChaise, créerSofa et créerTableBasse). Ces méthodes doivent renvoyer tous les types de produits abstraits des interfaces que nous avons créées précédemment : Chaise, Sofa, TableBasse, etc.

<img src="./solution2.png">
<div style="width:100%; height:1px;background:white;"></div>

## Structure

<img src="./structure.png">
<div style="width:100%; height:1px;background:white;"></div>
