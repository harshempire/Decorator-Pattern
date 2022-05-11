package pizza;

public class ThincrustPizza extends Pizza{

    public ThincrustPizza(){
        description="This is thin crust Pizza , with tomato sauce";
    }

    @Override
    public double cost() {
        return 7.99;
    }
}
