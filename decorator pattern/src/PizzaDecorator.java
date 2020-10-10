abstract class PizzaDecorator implements Pizza {
    Pizza toppings;

    PizzaDecorator(Pizza newToppings){
        toppings = newToppings;
    }

    public String getDescription(){
        return toppings.getDescription();
    }

    public double getCost(){
        return toppings.getCost();
    }
}
