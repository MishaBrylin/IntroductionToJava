import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.zip.ZipOutputStream;

// Пусть дан произвольный список целых чисел, удалить из него четные числа

public class Task02 {
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
        // Способ № 1   
        for (int i = 0; i < elementList.size();) {
            if ( elementList.get(i)%2 ==0 ) {
                elementList.remove(i);
            } else {
                i++;
            }
            // Способ № 2          
        // Iterator<Integer> elementListIterator = elementList.iterator();
        // while (elementListIterator.hasNext()) {
        //     Integer element = elementListIterator.next();
           
        //     if((element%2 == 0)) {
        //         elementListIterator.remove();
        //     }
        }
        System.out.println(elementList);
        
        
    }

    public static void main(String[] args) {
    
        List<Integer> arr3 = arr();
        System.out.println(arr3);
        arr2(arr3);

        
    
    }
}
