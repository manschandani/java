
class ClassA {
    int x;

    
    void setValue(int a) {
        x = a;
    }
}


class ClassB {
    int y;

    
    void setValue(int b) {
        y = b;
    }
}


class ClassC {

    public static void main(String[] args) {

        ClassA obj1 = new ClassA();
        ClassB obj2 = new ClassB();
        ClassC obj3 = new ClassC();

        obj1.setValue(10);
        obj2.setValue(20);

        System.out.println("Value of x from ClassA = " + obj1.x);
        System.out.println("Value of y from ClassB = " + obj2.y);
        System.out.println("Object of ClassC created = " + obj3);
    }
}
