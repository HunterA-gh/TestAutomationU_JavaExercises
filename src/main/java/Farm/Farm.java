package Farm;

public class Farm {

    public static void main(String[] args) {
        Pig pig1 = new Pig();
        pig1.makeSound();
        pig1.eat();

        Duck duck1 = new Duck();
        duck1.makeSound();
        duck1.eat();

        Animal pig2 = new Pig();
        pig2.makeSound();
        pig2.eat();

    }
}
