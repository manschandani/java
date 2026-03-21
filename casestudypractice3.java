abstract class transport{
    String trackingid;
    String destination;
    public void dispatch(){};
}

interface GPS{
    default void pingserver(){
        System.out.println("status:online");
    }
    public void getcoordinates();
}

interface autonomous{
    public void selfnavigate();
}

class deliverydrone extends transport implements GPS, autonomous{

    public deliverydrone(String trackingid){
        this.trackingid= trackingid;
    }
    public void dispatch(){
        System.out.println("Drone with tracking id "+this.trackingid+" is taking off");
    }
    public void getcoordinates(){
        System.out.println("Current coordinates are: 37.7749° N, 122.4194° W");
    }
    public void selfnavigate(){
        System.out.println("Drone is navigating to the destination");
    }
    
}

class truck extends transport{
    public truck(String trackingid){
        this.trackingid= trackingid;
    }
    public void dispatch(){
        System.out.println("Truck with tracking id " + this.trackingid+" is departing");
    }
}

public class casestudypractice3{
    public static void main(String[] args){


    
        transport t= new deliverydrone("D101");
         if(t instanceof GPS){
            System.out.println("This transport supports gps");
        }
        t.dispatch();
        
        GPS g = new deliverydrone("D102");

        g.getcoordinates();
        g.pingserver();
        
        transport t1= new truck("T201");
         if (t1 instanceof GPS){
            System.out.println("This transport supports gps");
        }
        t1.dispatch();

    }
}

