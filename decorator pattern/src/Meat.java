public class Meat extends PizzaDecorator {

    Meat(Pizza newPizza){
        super(newPizza);
    }

    @Override
    public String getDescription() {
        return toppings.getDescription() + " meat ";
    }

    @Override
    public double getCost() {
        return toppings.getCost() +  5.5;
    }
}
