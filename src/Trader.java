import java.util.List;

public class Trader {
    private String name;
    private String city;

    // constructor, getters
    public Trader(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() { return name; }
    public String getCity() { return city; }

     public static void main(String[] args) {
         Trader t1 = new Trader("Aman", "Delhi");
         Trader t2 = new Trader("Rohit", "Mumbai");
         Trader t3 = new Trader("Neha", "Delhi");

         List<Transaction> transactions = List.of(
                 new Transaction(t1, 2011, 300),
                 new Transaction(t2, 2012, 1000),
                 new Transaction(t3, 2011, 400),
                 new Transaction(t1, 2011, 200)
         );

     }
}

class Transaction {
    private Trader trader;
    private int year;
    private int value;

    // constructor, getters
    public Transaction(Trader trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }

    public Trader getTrader() { return trader; }
    public int getYear() { return year; }
    public int getValue() { return value; }
}

