class Parent{
String name="ABC College";
void show(){
System.out.println("This is Parent class");
}
}

class Child extends Parent{
String name="Computer Department";
Child(String name){
this.name=name;
}
void display(){
System.out.println("Parent name: "+super.name);
System.out.println("Child name: "+this.name);
super.show();
}
public static void main(String[] args){
Child obj=new Child("Information Technology");
obj.display();
}
}
