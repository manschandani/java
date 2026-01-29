class student{
    static String collegename = "ABC college";
    String name;
    int rollno;

    student(String n, int r){
        name= n;
        rollno = r;
    }

    void display(){
        System.out.println("name :" + name);
        System.out.println("roll number :" + rollno);
        System.out.println("college name :"+ collegename);
    }

    public static void main(String[] args){
        student s1 = new student("mansi",143);
        student s2 = new student("riya", 144);

        s1.display();
        System.out.println();
        s2.display();
    }
}