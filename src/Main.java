import java.util.*;
class Stud {
     int roll_No;
     String name;
     float marks;

    Stud(int roll_No, String name, float marks){
        this.roll_No=roll_No;
        this.name=name;
        this.marks=marks;
    }

    public String toString(){
        return roll_No +" "+ name +" "+ marks;
    }

}

class CompOverleading implements Comparator<Stud>{
    public int compare(Stud s, Stud r){
        return Integer.compare(s.roll_No,r.roll_No);
    }

}

public class  Main {
    public static void main(String[] args) {
        List<Stud> list = new ArrayList<>();
        list.add(new Stud(3, "Rahul", 85f));
        list.add(new Stud(1, "Ankit", 92f));
        list.add(new Stud(2, "Mansi", 78f));

        //sort by roll no (Ascending)
        Collections.sort(list,new CompOverleading());
        System.out.println("Sorted by Roll No:");
        System.out.println(list);

        //sort by name
        list.sort(Comparator.comparing((Stud s) -> s.name));
        System.out.println("Sorted by Name:");
        System.out.println(list);

        //sort by marks
        list.sort(Comparator.comparingDouble((Stud s) -> s.marks).reversed());

        AreaCalculator a = new AreaCalculator();

        System.out.println(a.area(5));       // Square
        System.out.println(a.area(3.0));     // Circle
        System.out.println(a.area(4, 6));    // Rectangle

    }

    public void countSpamMails(String[] mails) {
        String[] spamWords = {"free", "win", "offer", "money"};
        int spam = 0, nonSpam = 0;

        for (String mail : mails) {
            boolean isSpam = false;
            String lower = mail.toLowerCase();

            for (String word : spamWords) {
                if (lower.contains(word)) {
                    isSpam = true;
                    break;
                }
            }

            if (isSpam) spam++;
            else nonSpam++;
        }

        System.out.println("Spam mails: " + spam);
        System.out.println("Non-spam mails: " + nonSpam);
    }
}

class AreaCalculator {

    double area(double radius) { // Circle
        return Math.PI * radius * radius;
    }

    double area(double length, double breadth) { // Rectangle
        return length * breadth;
    }

    double area(int side) { // Square
        return side * side;
    }
}

//String array ,maths ,ll, exception,stream api,oops,file,handling

//1.oops ==== MATHS
//2.exception ==== 4.stream API
//3.String & array === //LL
//FILE and ques(word doc)
