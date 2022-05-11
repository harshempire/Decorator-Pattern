package starbuzz;

public class Espresso extends Beverage{

    public Espresso(){
        description="This is a Espresso Beverage";
    }
    @Override
    public double cost() {
        return 1.99;
    }
}
