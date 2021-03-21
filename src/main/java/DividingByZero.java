public class DividingByZero { //Chapter 13, Exceptions


    public static void main(String[] args) {

        try {
            int c = 30/0;
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by zero");
        } finally {
            System.out.println("Division is fun");
        }
    }
}
