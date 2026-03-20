abstract class payment{
    private String transactionid;
    private double amt;

    public payment(String transactionid, double amt){
        this.transactionid = transactionid;
        this.amt = amt;
    }
    public String getTransactionId(){
        return transactionid;
    }
    public double getAmt(){
        return amt;
    }
    public abstract double processpayment();
}

class creditcardpayment extends payment{
    public creditcardpayment(String transactionid, double amt){
        super(transactionid, amt);
    }
    @Override
    public double processpayment(){
        return getAmt()*0.02 +getAmt();
    }

}
class upipayment extends payment{
    private String upiid;
    public upipayment(String transactionid, double amt, String upiid){
        super(transactionid, amt);
        this.upiid = upiid;
    }
    @Override
    public double processpayment(){
    if (upiid == null){
        return 0;
    }
    else{
        return getAmt();
    
    }
}
}

public class casestudypractice{
    public static void main(String[] args){
        payment p= new creditcardpayment("TXN123",1000.0);
        System.out.println("credit card payment amount:"+ p.processpayment());
        payment p1= new upipayment("TXN456",1000.0,"user@upi");
        System.out.println("UPI payment amount:"+ p1.processpayment());
        payment[] payments = new payment[2];
        payments[0] = p;
        payments[1] = p1; 
        double total = 0;
        for (payment payment : payments){
            total= total + payment.processpayment();
        }
        System.out.println("Total payment amount: " + total);
    }
}
