package pizza;

public class Pizzastore {
    public static void main(String[] args) {
        Pizza pizza=new ThincrustPizza();
        Pizza pizza1=new Cheese(pizza);
        Pizza pizza2=new Olive(pizza1);
        System.out.println(pizza2.getDescription()+"    $ "+pizza2.cost());
    }
}
