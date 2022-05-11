package starbuzzwithSize;

public class Soy extends CondimentDecorator{

    public Soy(Beverage beverage){
        this.beverage=beverage;
    }
    @Override
    public double cost() {
        double cost=beverage.cost();
        if(beverage.getSize()==Size.TALL){
            cost+=0.10;
        }
        else if(beverage.getSize()==Size.MEDIUM){
            cost+=0.15;
        }
        else if(beverage.getSize()==Size.VENTI){
            cost+=0.20;
        }
        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+" Soy";
    }
}