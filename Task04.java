import java.io.IOException;
import java.util.logging.Logger;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

// 4*. К калькулятору из предыдущего дз добавить логирование.
public class Task04 {

    public static Logger logger() throws SecurityException, IOException{
        Logger log = Logger.getLogger(Task04.class.getName());
        FileHandler fHandler = new FileHandler("log.txt");
        SimpleFormatter sFormatter = new SimpleFormatter();
        fHandler.setFormatter(sFormatter);
        log.addHandler(fHandler);
        return log;
    }

    public static void main(String[] args) throws SecurityException, IOException {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int n = iScanner.nextInt();
        System.out.printf("Введите второе число: ");
        int z = iScanner.nextInt();
        System.out.printf("Введите знак -,+,*,/ : ");
        String f = iScanner.next();
        int res = 0;
        
        if (f.equals("-")) {
            res = n - z;
            logger().info(n +  f + z + " = "+ res);
            System.out.println(n +  f + z + " = "+ res);    
 
        }
        if (f.equals("+")) {
            res = n+z;
            logger().info(n +  f + z + " = "+ res);
            System.out.println(n +  f + z + " = "+ res); 
           
        }
        if (f.equals("*")) {
            res = n*z;
            logger().info(n +  f + z + " = "+ res);
            System.out.println(n +  f + z + " = "+ res); 

           
        }
        if (f.equals("/")) {
            try {
                res = n/z;
                System.out.println(n +  f + z + " = "+ res);
            } catch (Exception e) {
                System.out.println("делить на 0 нельзя");
                logger().info("попытка делить на 0");

            }
            
           
        }
 
 
       
        
        iScanner.close();
    }
 }

    

