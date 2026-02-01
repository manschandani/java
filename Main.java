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



class student {
    String name;

    student(String name){
        this.name=name;
    }
    void display(){
        System.out.println("name :"+ this.name);
    }
}

class demo{
    demo(){
        this("default constructor");
    }
    demo( String message){
        System.out.println(message);

    }
}


class Parent{
    void display(){
        System.out.println("parent class method");
        
    }
}
class Child extends Parent{
    void display(){
        super.display();
        System.out.println("child class method");
    }
}

public class Main {
    public static void main(String[] args){
        dog d = new dog();
        d.eat();
        d.bark();
        new demo();
         
        Child c= new Child();
        c.display();
    
    }
}