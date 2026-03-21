abstract class libraryitem{
    private String title;
    private String itemid;
    Boolean reserved=false;

    public void itemdetails(String title, String itemid){
        this.title = title;
        this.itemid = itemid;
       
    }
    protected void isreserved(){};

    public void showdetails(){
        System.out.println("Title: "+this.title);
        System.out.println("Item ID: "+this.itemid);
        System.out.println("Reserved: "+ this.reserved);
    }
 public void processloan(){};
    
}

class textbook extends libraryitem{

    public textbook(String title, String itemid){
       itemdetails(title, itemid);
    }

    @Override
    public void processloan(){
        if(this.reserved== false){
            System.out.println("Textbook is available for loan");
            this.reserved = true;
            System.out.println("this textbook has been issued for 14 days");
        }

        else{
            System.out.println("Textbook is currently reserved");
        }
    }
}

class researchpaper extends libraryitem{
    public researchpaper(String title, String itemid){
        itemdetails(title, itemid);
    }
    @Override
    public void processloan(){
        System.out.println("generating secure PDF link...");
    }
}

public class casestudypractice4{
    public static void main(String[] args){
        textbook t= new textbook("B101","Java Core");
        t.showdetails();
        t.processloan();
        
        researchpaper r= new researchpaper("R99","AI Ethics");
        r.processloan();
        t.processloan();

    }
}


