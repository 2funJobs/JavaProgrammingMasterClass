public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello Tim");

        boolean isAlien = false;
        if (isAlien == false) { //;
            System.out.println("It is not an alien!");
            System.out.println("And i am scared of aliens.");
        }
        // Ternary Operator
        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? false : true;
        if (isDomestic) {
            System.out.println("This car is domestic to our country.");
        }

        String s = (isDomestic) ? "This car is domestic." : "This car is not domestic.";
        System.out.println(s);

        double num1 = 20.00;
        double num2 = 80.00;
        double num3 = (num1 + num2) * 100;

        boolean hasRemainder = num3 % 40 == 0 ? false : true;
        System.out.println(hasRemainder);

        if (hasRemainder) {
            System.out.println("Got some remainder!");
        }
    }
}
