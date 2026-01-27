class PrintDetails{
    public static void main(String[] args){
    System.out.println("name: Mansi Chandani");
    System.out.println("roll no : 143");
    System.out.println("address : jaipur");

}}

class DivideNumbers{
    public static void main(String[] args){
        int a=40;
        int b=4;
        if(b==0){
            System.out.println("error! cannot be divided");
        }
        else{
            int result= a/b;
            System.out.println("result="+ result);

        }
    }
}

class parent{
    int a= 10;
    void showparent(){
        System.out.println("this is parent class");
        System.out.println("the value of a="+a);
    }
}

class child extends parent{
    void showchild(){
        System.out.println("this is child class");
        System.out.println("accessing parent variable a="+ a);
    }
}

class inheritancedemo{
    public static void main(String[] args){
        child obj= new child();
        obj.showparent();
        obj.showchild();
    }
}

class methodoverloading{
    void add(int a, int b){
        int sum= a+b;
        System.out.println("sum of integers =" + sum);
    }

    void add(double a, double b){
        double sum = a+b;
        System.out.println("sum of doubles = "+ sum);
    }


public static void main( String[] args){
    methodoverloading obj = new methodoverloading();
    obj.add(10,20);
    obj.add(10.5,5.5);

}
}