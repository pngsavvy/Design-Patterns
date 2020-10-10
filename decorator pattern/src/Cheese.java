public class Cheese extends PizzaDecorator{

    public Cheese(Pizza newPizza){
        super(newPizza);
    }

    @Override
    public String getDescription() {
        return toppings.getDescription() + " Cheese ";
    }

    @Override
    public double getCost() {
        return toppings.getCost() + 2.0;
    }
}
