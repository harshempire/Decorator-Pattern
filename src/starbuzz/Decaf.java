package starbuzz;

public class Decaf extends Beverage{

    public Decaf(){
        description="This is decaf coffee";
    }
    @Override
    public double cost() {
        return 1.05;
    }
}
