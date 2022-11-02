
# Proxy
## Intention
> La Procuration est un patron de conception structurel qui vous permet d’utiliser un substitut pour un objet. Elle donne le contrôle sur l’objet original, vous permettant d’effectuer des manipulations avant ou après que la demande ne lui parvienne.

## problem
<img src="/home/merlin/projets/back/DP/alldp/src/main/java/org/ttm/structural/proxy/problem.png">
<br>

## solution
<img src="/home/merlin/projets/back/DP/alldp/src/main/java/org/ttm/structural/proxy/solution.png">
<br>

## structure
<img src="/home/merlin/projets/back/DP/alldp/src/main/java/org/ttm/structural/proxy/structure.png">
<br>


## pseudo code

<img src="/home/merlin/projets/back/DP/alldp/src/main/java/org/ttm/structural/proxy/example.png">
<br>

## Possibilités d’application
<b>  Instanciation paresseuse (procuration virtuelle). À utiliser lorsque l’objet du service est très consommateur en ressources système car il est actif en permanence, mais vous n’en avez pas tout le temps besoin.</b>

Vous pouvez différer l’initialisation de l’objet plutôt que de le créer au lancement de l’application.

<b>Vérification des droits (procuration de protection). Si vous avez besoin de limiter l’accès de vos clients à l’objet du service, par exemple si vos objets sont des parties cruciales d’un système d’exploitation et que les clients sont différentes applications lancées (dont certaines sont malveillantes).</b>

La procuration peut ne transmettre une demande à l’objet du service que si les identifiants du client remplissent certains critères.

<b>Lancement local d’un service distant (procuration à distance). L’objet du service se situe sur un serveur distant.</b>

Dans ce cas, la procuration envoie la demande par le réseau en s’occupant de gérer tous les détails compliqués de la gestion du réseau.

<b> Demande de logs (procuration de logs). Pour garder un historique des demandes passées auprès de l’objet du service.</b>

La procuration peut garder la trace de toutes les demandes passées au service.

<b>Mettre en cache les résultats des demandes (procuration de cache). Si vous voulez mettre en cache les résultats des demandes faites au client et gérer le cycle de vie de ce cache, principalement lorsque les résultats sont imposants.</b>

La procuration peut gérer la mise en cache des demandes récurrentes qui retournent toujours le même résultat. Les paramètres des demandes peuvent servir de clé.

<b>Référencement intelligent. Si vous voulez vous débarrasser d’un objet très consommateur en ressources lorsqu’aucun client ne l’utilise.</b>

La procuration peut garder la trace des clients qui ont récupéré une référence vers l’objet du service ou vers ses résultats. De temps en temps, la procuration peut faire le tour des clients et vérifier s’ils sont toujours actifs. Si la liste des clients est vide, la procuration peut supprimer l’objet du service afin de libérer des ressources.

Elle peut également savoir si le client avait modifié l’objet du service. Les objets non modifiés peuvent ensuite être réutilisés par les autres clients.


## Avantages

-  Vous pouvez contrôler l’objet du service sans que le client ne s’en aperçoive.
- Vous pouvez gérer le cycle de vie de l’objet du service si les clients ne s’en occupent pas.
-  La procuration fonctionne même si l’objet du service n’est pas prêt ou pas disponible
- Principe ouvert/fermé. Vous pouvez ajouter de nouvelles procurations sans toucher au service ou aux clients.

## Inconvénients
- Le code peut devenir plus complexe puisque vous devez y introduire de nombreuses classes.
-  La réponse du service peut mettre plus de temps à arriver.

