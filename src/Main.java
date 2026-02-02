import java.util.*;
class Student{
     int roll_No;
     String name;
     float marks;

    Student(int roll_No,String name,float marks){
        this.roll_No=roll_No;
        this.name=name;
        this.marks=marks;
    }

    public String toString(){
        return roll_No +" "+ name +" "+ marks;
    }

}

class CompOverleading implements Comparator<Student>{
    public int compare(Student s,Student r){
        return Integer.compare(s.roll_No,r.roll_No);
    }

}

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3, "Rahul", 85f));
        list.add(new Student(1, "Ankit", 92f));
        list.add(new Student(2, "Mansi", 78f));

        //sort by roll no (Ascending)
        Collections.sort(list,new CompOverleading());
        System.out.println("Sorted by Roll No:");
        System.out.println(list);

        //sort by name
        list.sort(Comparator.comparing((Student s) -> s.name));
        System.out.println("Sorted by Name:");
        System.out.println(list);

        //sort by marks
        list.sort(Comparator.comparingDouble((Student s) -> s.marks).reversed());

    }
}

/*
* class SortByName implements Comparator<Student> {

    @Override

    public int compare(Student a, Student b) {
        return a.name.compareTo(b.name);
    }
}

* */
