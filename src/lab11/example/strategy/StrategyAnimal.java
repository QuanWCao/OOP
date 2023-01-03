package lab11.example.strategy;


public class StrategyAnimal {

    private Animal strategyAnimal;

    public void setStrategy(Animal strategyAnimal) {
        this.strategyAnimal = strategyAnimal;
    }

    public void greetsStrategy() {
        strategyAnimal.greets();
    }
}
