class account{
    String accountnumber;
    String accountholdername;
    Double balance;

    void deposit(double amount){
        balance= balance + amount;
        System.out.println("deposited: "+ amount);

    }

    void withdraw(double amount){
        if(amount<= balance){
            balance= balance - amount;
            System.out.println("withdrawn: "+ amount); } 
        else{ 
            System.out.println("insufficient balance"); } } void displaybalance(){ System.out.println("current balance: "+ balance);
        }
    void transfer(account fromaccount, account targetaccount, double amount){
        if(amount<= fromaccount.balance){
            fromaccount.balance= fromaccount.balance - amount;
            targetaccount.balance= targetaccount.balance + amount;
            System.out.println("transferred: "+ amount);

        }

    }
    void displayaccountdetails(){
        System.out.println("account number: "+ accountnumber);
        System.out.println("account holder name: "+ accountholdername);
        System.out.println("balance: "+ balance);
    }

    }

class bank{
    account[] accounts = new account[100];
     int count=0; 
    void createaccount(String accountnumber, String accountholdername, double balance){
        account newaccount= new account();
        newaccount.accountnumber= accountnumber;
        newaccount.accountholdername= accountholdername;
        newaccount.balance= balance;
        accounts[count]= newaccount;
        count++;

    }

    void getaccount(String accountnumber){
        for (int i=0; i<count; i++){
            if(accounts[i].accountnumber.equals(accountnumber)){
                accounts[i].displayaccountdetails();
                return;
            }
        }
    }

    void displayallaccounts(){
        for(int i=0; i<count; i++){
            accounts[i].displayaccountdetails();
        }
    }

}

//insufficientbalance?

public class case4{
    public static void main(String[] args){
        bank bank1= new bank();
        bank1.createaccount("123456","Alice", 1000.0);
        bank1.createaccount("654321","Bob", 700.0);
        bank1.displayallaccounts();
        account aliceaccount= bank1.accounts[0];
        account bobaccount= bank1.accounts[1];
        aliceaccount.deposit(6000.0);
        bobaccount.withdraw(100.0);
        aliceaccount.transfer(aliceaccount, bobaccount, 300.0);
        bank1.displayallaccounts();         
    }
}
