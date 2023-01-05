import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

// * В калькулятор добавьте возможность отменить последнюю операцию.

public class Task03 {
    public static Logger logger() throws SecurityException, IOException{
        Logger log = Logger.getLogger(Task03.class.getName());
        FileHandler fHandler = new FileHandler("log.txt", true);
        SimpleFormatter sFormatter = new SimpleFormatter();
        fHandler.setFormatter(sFormatter);
        log.addHandler(fHandler);
        return log;
    }
 

    public static void input(){

        
    }
 
 
    public static void main(String[] args) throws SecurityException, IOException {
        Scanner iScanner = new Scanner(System.in);
        Boolean n1 = true;
        String n2 = "0";
        String z2 = "0";
        String f = "0";
        Boolean f1 = true;
        while (n1 == true){
            Boolean z1 = true;
            System.out.printf("Введите число: ");
            n2 = iScanner.next();
            while (z1 == true){
                
                System.out.printf("Введите второе число или <b> если хотите вернуться назад: ");
                z2 = iScanner.next();
                if (z2.equals("b")){
                    break;
                }

                while (f1 == true){
                    System.out.printf("Введите знак -,+,*,/ или <b> если хотите вернуться назад: ");
                    f = iScanner.next();
                    if (f.equals("b")){
                        break;
                        
                        
                    }
                    f1 = false;
                    
                }
                if (f1 != true){
                    z1 = false;
                }                
                }
                if (z1 != true){
                break;
                }

            
        }
        int res = 0;
        int n = Integer.parseInt(n2);
        int z = Integer.parseInt(z2);



       
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
