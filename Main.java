class animal{
    void eat(){
        System.out.println("this animal eats food");
    }
}

class dog extends animal{
    void bark(){
        System.out.println("dog barks!");
    }
}

public class Main {
    public static void main(String[] args){
        dog d = new dog();
        d.eat();
        d.bark();
    }
}

class student {
    String name;

    student(String name){
        this.name=name;
    }
    void display(){
        System.out.println("name :"+ this.name);
    }
}
