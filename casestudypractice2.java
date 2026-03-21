abstract class device{
    String brand;
    public void turnOn(){
        System.out.println(brand +"TV is booting up");
    }
}

interface remotecontrollable {
    public void connecttowifi();
}

interface powersaving{
    public void getenergyratting();
}

class smarttv extends device implements remotecontrollable, powersaving{
    public smarttv(String brand){
        this.brand = brand;
    }

    public void connecttowifi(){
        System.out.println("Connecting to home_5G");
    }
    
    public void getenergyratting(){
        System.out.println("Energy ratting for smart tv is A");
    }
}

class electrickettle extends device{
    public electrickettle(String brand){
        this.brand = brand;
    }
}

public class casestudypractice2{
    public static void main(String[] args){
        device d = new smarttv("Sony");
        d.turnOn();
        remotecontrollable r = new electrickettle("LG");
        r.turnOn();
        
        
    }
}