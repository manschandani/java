final class finalclassexample {

    final int finalvar = 100;

    final void finalmethod() {
        System.out.println("this is a final method");
        System.out.println("value of final variable: " + finalvar);
    }
}

abstract class calculator {

    public abstract void add(double a, double b);

    public abstract void subtract(double a, double b);
}

class simplecalculator extends calculator {

    public void add(double a, double b) {
        System.out.println("addition: " + (a + b));
    }

    public void subtract(double a, double b) {
        System.out.println("subtraction: " + (a - b));
    }
}

public class assignment7 {

    public static void main(String[] args) {

        finalclassexample obj = new finalclassexample();
        obj.finalmethod();
        System.out.println("accessing final variable: " + obj.finalvar);

        calculator calc = new simplecalculator();
        calc.add(10, 5);
        calc.subtract(10, 5);
    }
}
