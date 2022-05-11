package pizza;

public class ThickcrustPizza extends Pizza{

    public ThickcrustPizza(){
        description="This is a Thick crust Pizza";
    }

    @Override
    public double cost() {
        return 10.99;
    }
}
