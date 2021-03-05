package behave.strategy;

public class Context {

    private Strategy strategy;

    private Context(Strategy strategy){
        this.strategy = strategy;
    }

    void excute(){
        this.strategy.strategy();
    }

    public static void main(String[] args) {
        new Context(new StrategyA()).excute();
    }

}
