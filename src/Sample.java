class MyBook extends Sample {
    void setTitle(String s) {
        this.title = s;
    }
}

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){return title;}
}

public class Sample{
    Book new_novel = new Book() {
        @Override
        void setTitle(String s) {
            title = "this is the title";
        }
    };
}


