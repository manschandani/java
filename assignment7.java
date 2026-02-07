final class finalclassexample{
    final int finalvar = 100;
    final void finalmethod(){
        System.out.println("this is a final method");
        System.out.println("value of final variable:"+ finalvar);
    }
}
public class assignment7{
    public static void main(String[] args){
        finalclassexample obj = new finalclassexample();
        obj.finalmethod();
        System.out.println("accessing final variable directly"+ obj.finalvar);
    }
}