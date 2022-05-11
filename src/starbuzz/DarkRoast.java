package starbuzz;

public class DarkRoast extends Beverage{

    public DarkRoast(){
        description="This is a dark roast beverage";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
