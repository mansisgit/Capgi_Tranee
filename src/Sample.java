import java.util.Scanner;

//abstract class
abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){return title;}
}

//child class
class MyBook extends Book{
    void setTitle(String s){
        this.title=s;
    }

}
//Main method class
public class Sample {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        Book book1 = new MyBook();//child
        book1.setTitle(title);

        System.out.println("The title is: " + book1.getTitle());
    }
}



