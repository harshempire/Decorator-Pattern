package pizza;

// this Pizza is abstract so you can not create instance of it.
public  abstract class Pizza {
    String description="Basic Pizza";
    public String getDescription(){return description;};
    public abstract double cost();
}
