package behave.template;

public class Cook {

    private AbstractCook cook;

    private Cook(AbstractCook cook){
        this.cook = cook;
    }

    void cook(){
        cook.wash();
        cook.cook();
        cook.dishUp();
    }

    public static void main(String[] args) {
        Cook cook = new Cook(new BoilCook());
        cook.cook();
    }

}
