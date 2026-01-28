class student{
    String name;
    String branch;
    long prn;

    student(String n, String r, long p){
        name= n;
        branch= r;
        prn= p;
    }

    void display(){
        System.out.println("name :" + name);
        System.out.println("branch :" + branch);
        System.out.println("PRN :" + prn);

    }
    public static void main(String[] args){
    student s = new student("mansi","ComputerScience",104);
    s.display();
}
}


class Calculator {

    int a, b;

    // Parameterised constructor
    Calculator(int x, int y) {
        a = x;
        b = y;
    }

    void calculate(int choice) {

        if (choice == 1) {
            System.out.println("Addition = " + (a + b));
        }
        else if (choice == 2) {
            System.out.println("Subtraction = " + (a - b));
        }
        else if (choice == 3) {
            System.out.println("Multiplication = " + (a * b));
        }
        else if (choice == 4) {
            if (b != 0)
                System.out.println("Division = " + (a / b));
            else
                System.out.println("Division by zero not allowed");
        }
        else {
            System.out.println("Invalid choice");
        }
    }

    public static void main(String[] args) {

        Calculator c = new Calculator(20, 10);

        int choice = 1;   // 1-add, 2-sub, 3-mul, 4-div
        c.calculate(choice);
    }
}
