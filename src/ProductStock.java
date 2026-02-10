import java.util.ArrayList;
import java.util.List;

public class ProductStock {
    public static void main(String[] args) {
        List<String> CurrentInventory = new ArrayList<>();
        List<String> NewArrivals = new ArrayList<>();

        for(String item : NewArrivals){
            CurrentInventory.add(item);
        }

        for(String item : CurrentInventory){
            System.out.print(item);
        }


    }
}
