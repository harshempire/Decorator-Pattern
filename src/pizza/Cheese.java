package pizza;

public class Cheese extends ToppingDecorator{

    public Cheese(Pizza pizza){
        this.pizza=pizza;
    }

    @Override
    public double cost() {
        return pizza.cost()+ 2.00;// adding cheese cost
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+"   Cheese Topping   ";
    }
}
