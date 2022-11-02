package org.ttm.behavior.strategy;

/*
Utilisez le patron de conception stratégie si vous voulez avoir différentes variantes d’un algorithme à l’intérieur d’un objet à disposition, et pouvoir passer d’un algorithme à l’autre lors de l’exécution.
Utilisez la stratégie si vous avez beaucoup de classes dont la seule différence est leur façon d’exécuter un comportement
Utilisez la stratégie pour isoler la logique métier d’une classe, de l’implémentation des algorithmes dont les détails ne sont pas forcément importants pour le contexte.
* */
public class StrategyP {

    public static void main(String[] args) {
        Context context = new Context();
        ConcreteStrategy strategy = new ConcreteStrategy();
        context.setStrategy(strategy);
        context.doSOmething();
    }
}

interface Strategy{
    void execute();
}

class ConcreteStrategy implements Strategy{

    @Override
    public void execute() {
        // algorithm
        System.out.println("ConcreteStrategy algorithm");
    }
}

class Context{
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public void doSOmething(){
        this.strategy.execute();
    }
}
