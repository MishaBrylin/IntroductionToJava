import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Random;


// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

public class Task01 {
    public static void main(String[] args) {
        rev();
        

        

        

    }

    public static LinkedList<Integer> crLst() {
        Random rand = new Random();
        LinkedList<Integer> arr = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            arr.add(rand.nextInt(20));
            
            
                        
        }
        return arr;
        
        

    }
    public static void rev() {
        Deque<Integer> arr2= new ArrayDeque<>();
        LinkedList<Integer> arr = crLst();
        for (Integer integer : arr) {
            arr2.addFirst(integer);

        }
        System.out.println(arr);
        System.out.println(arr2);




    }


}
