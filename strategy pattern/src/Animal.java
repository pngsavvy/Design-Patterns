public class Animal {
    Flys flyingType;

    Animal(Flys flyingType){
        this.flyingType = flyingType;
    }

    public String tryToFly(){
        return flyingType.fly();
    }

}
