class finalvariableexample{
    final int max= 100;
    void display(){
        System.out.println("max value"+ max);
    }
    public static void main(String[] args){
    finalvariableexample obj= new finalvariableexample();
    obj.display();
}

}

abstract class animal{
    abstract void sound();

    void eat(){
        System.out.println("this animal eats food");
    }
}
class dog extends animal{
    void sound(){
        System.out.println("dog barks.")
    }
}
public class abstractmethodexample{
    public static void main(String[] args){
        animal animal = new dog();
        animal.sound();
    }
}

