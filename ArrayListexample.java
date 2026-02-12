import java.util.ArrayList;

public class ArrayListexample{
    public static void main(String[] args){
        ArrayList<String> fruits= new ArrayList<>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");

        System.out.println("fruits:"+ fruits);
        fruits.remove("banana");
        System.out.println("after removing banana:"+ fruits);

        System.out.println("size:"+ fruits.size());
        System.out.println("contains apple?"+ fruits.contains("apple"));
    }
}

class test{
    public static void main(String[] args){
        test obj = new test();
        obj=null;
        System.gc();
    }
}