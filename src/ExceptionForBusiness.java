public class ExceptionForBusiness{
    public static void main(String[] args) throws NegativeValueException {
        try{
            int num = 2394809;
            int sum =0;

            if (num < 0) {
                throw new NegativeValueException("Negative value not allowed");
            }

            while(num>0){
                int digit = num%10;
                sum+=digit;
                num/=10;
            }
        }
        catch (NegativeValueException e){
            System.out.println("no negative value");
        }

    }
}

class NegativeValueException extends Exception {
    public NegativeValueException(String msg) {
        super(msg);
    }
}