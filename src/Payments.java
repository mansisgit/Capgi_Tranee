import java.io.ObjectInputFilter;
import java.util.Stack;

abstract class PaymentProcessor{
    String transactionID;
    double amount;
    enum status{
        PENDING,
        SUCCESS,
        FAILED
    }

    //constructor
    PaymentProcessor(String transactionID,double amount){
        this.amount = amount;
        this.transactionID = transactionID;
        this.status = Status.PENDING;
    }

    //Abstract methods
    abstract boolean validatePayment();
    abstract void executeTranscation();

    //Concrete method
    void printReceipt(){
        System.out.println("Transcation id"+ transactionID);
        System.out.println("Amount"+amount);
        System.out.println("Status: " + status);
        System.out.println("----------------------");
    }

    //final templeate method
    final void process(){
        if(validatePayment()){
            executeTranscation();
            status= Status.SUCCESS;
        } else {
            status = Status.FAILED;
        }
        printReceipt();
    }

}

class CreditCardProcessor extends PaymentProcessor{
    String cardNumber;
}


public class Payments {
    public static void main(String[] args) {

    }
}
