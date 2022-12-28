

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;



// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
public class Task02 {
    
    public static int[] str() {
        Random rand = new Random();


        int[] str = new int[10];
        for (int i = 0; i < 10; i++) {
            str[i]= rand.nextInt(100);
 
 
 
        }
        return str;
    }

    public static Logger logger() throws SecurityException, IOException{
        Logger loger = Logger.getLogger("task02");
        FileHandler fHandler = new FileHandler("log.txt");
        SimpleFormatter sFormatter = new SimpleFormatter();
        fHandler.setFormatter(sFormatter);
        loger.addHandler(fHandler);
        return loger;
    }

    public static void main(String[] args) throws SecurityException, IOException {
        int[] str2 =  str();
        

        logger().info(Arrays.toString(str2));
            int x;
            for (int i = 0; i < str2.length; i++) {
                for (int j = 0; j < str2.length-1; j++) {
                    if(str2[j] > str2[j+1]){
                        x = str2[j+1];
                        str2[j+1] = str2[j];
                        str2[j] = x;

                    }
                }
                
                
            }
            logger().info(Arrays.toString(str2));
            System.out.println(Arrays.toString(str2));
    }
 
} 
