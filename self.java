import java.util.Scanner;
public class self{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter radius for circle:");
        double radius= input.nextDouble();
        double area= radius*radius*3.14159;
        System.out.println("the area is:" + area);
        System.out.println("enter temp in celcius:");
        double celcius= input.nextDouble();
        double fahrenheit= (9.0/5)*celcius + 32;
        System.out.println(fahrenheit);
        System.out.print("enter number of minutes:");
        long minutes= input.nextLong();

        long minutesindays= 24 * 60;
        long minutesinyears= 365 * minutesindays;

        long years= minutes / minutesinyears;
        long remainingminutes= minutes % minutesinyears;
        long days= remainingminutes / minutesindays;

        System.out.println("years: " + years + " days: " + days);
        input.close();
    }  
}
