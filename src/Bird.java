public class Bird {
    public static void main(String[] args) {
        Acquaintance a = new Acquaintance("Ravi");
        Friend f = new Friend("Amit");
        BestFriend b = new BestFriend("Rahul");

        a.getStatus();
        f.getStatus();
        b.getStatus();
    }
}

class Acquaintance {
    protected String name;

    public Acquaintance(String name) {
        this.name = name;
    }

    public void getStatus() {
        System.out.println("This is " + name + ", an acquaintance.");
    }
}

class Friend extends Acquaintance {
    public Friend(String name) {
        super(name);
    }

    @Override
    public void getStatus() {
        System.out.println("This is " + name + ", a friend.");
    }
}

class BestFriend extends Friend {
    public BestFriend(String name) {
        super(name);
    }

    @Override
    public void getStatus() {
        System.out.println("This is " + name + ", my best friend!");
    }
}
