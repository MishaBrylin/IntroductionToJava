import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

public class Task03 {
    
    public static ArrayList<Integer> arr() {
        Random rand = new Random();
 
 
        ArrayList<Integer> arr = new ArrayList<>(20);
        for (int i = 0; i < 20; i++) {
            arr.add(rand.nextInt(100));
 
 
 
        }
        return arr;
    }
    public static void arr2(List<Integer> arr) {
        

        ArrayList<Integer> elementList = (ArrayList<Integer>) arr;
        int max = elementList.get(0);
        int min = elementList.get(0);
        float x = 0;

        for (int i = 0; i < elementList.size(); i++) {
            if ( elementList.get(i) > max ) {
                max = elementList.get(i);

            } 
            if ( elementList.get(i) < min ) {
                min = elementList.get(i);

            }
            x = x+ elementList.get(i);
            




        }
        // int res = x/elementList.size();
        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное чисор: " + min);
        System.out.println("Среднее число: "+(x/elementList.size()));
        
        
    }

    public static void main(String[] args) {
    
        List<Integer> arr3 = arr();
        System.out.println(arr3);
        arr2(arr3);

        
    
    }
}
