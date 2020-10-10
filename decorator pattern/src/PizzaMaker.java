public class PizzaMaker {
    public static void main(String[] args) {
        Pizza plain = new PlainPizza();
        plain = new Meat(plain);
        plain = new Cheese(plain);


        System.out.println(plain.getCost());
        System.out.println(plain.getDescription());
    }
}
