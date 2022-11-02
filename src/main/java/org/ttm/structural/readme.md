## Adaptor

link 2 objects with # interfaces

- AdaptorObject1 <>----> encapsule adaptee (object1) concrete class

- AdaptorObject1 --------> implement Object2Interface

>Donc l'adatpeur au final via une <b>method de Object2Interface</b>
va permettre a l'object1 qu il <b>encapsule</b> de se comporter comme Object2


## Bridge

permettre d acceder au comportement d une abtraction via un autre object

- bridge(remoteControl) <>--------> encapsule type interface(device) exemple(radio ou tv)

> le remoteControl via ses methode va pouvoir appeller celle de la class encapsulee


## Composite

permettre d avoir un arbre d object partageant une meme abstraction

- parent 1 <>--------> n encapsule type interfaceX (descendants)
- parent    -------->  implement lui meme interfaceX

> Au final on peut iterer sur la list de descendants et appeler les methods liees de interfaceX


## Decorator

permettre d'empaqueter un object et de reutiliser sa ou ses methodes

- baseDecorateur <>--------> encapsule wrappee(component)
- wrappee(component)  -------->  implement interfaceX
- baseDEcorateur  -------->  implement lui meme interfaceX
- concreteDecorateur --------|> extends baseDecorateur

> Au final concreteDecorateur appel execute method de son parent qui lui meme appel execute du wrappee(component)


## Facade looks like mediator

Isoler votre code de la complexité d’un sous-système.

creer un object qui va retourner de facon simple les donnees complexe d un autre object
```
              sous-system3
                   |
sous-system1 <- mediator  -> sous-system2;       user -> facade -> sous-system complex
                   |
              sous-system4
```              
## Proxy

permettre d acceder au comportement d une abtraction via un autre object
tout en ajoutant un cache

- proxy(middleman) <>--------> encapsule type interface(x) exemple(db)
- db  -------->  implement interfaceX
- proxy  -------->  implement lui meme interfaceX

> Au final le proxy retourne l info de la db si celle ci n est pas presente en cache

> Il faut aussi ajouter les methodes de gestion du cache
