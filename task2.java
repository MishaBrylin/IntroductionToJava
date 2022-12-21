import java.util.*;

// Вывести все простые числа от 1 до 1000
public class task2 {
    public static void main(String[] args) {
        
        ArrayList<String> arr = new ArrayList<>();
        
        arr.add("1");
        arr.add("2");


        for (int i = 3; i < 1000; i++) {
            for (int j = 2; i%j != 0; j++) {
                if (j == i-1){
                    arr.add(""+i);

                   

                }

            }
        }

            System.out.println(arr);    
        }

        
    }
    

