// Реализовать простой калькулятор
import java.util.Scanner;
public class task3 {
    
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int n = iScanner.nextInt();
        System.out.printf("Введите второе число: ");
        int z = iScanner.nextInt();
        System.out.printf("Введите знак -,+,*,/ : ");
        String f = iScanner.next();
        int res = 0;
        // String res2 = "asd";
        if (f.equals("-")) {
            res = n - z;

        }
        if (f.equals("+")) {
            res = n+z;
            
        }
        if (f.equals("*")) {
            res = n*z;
            
        }
        if (f.equals("/")) {
            res = n/z;
            
        }


        
        System.out.println(n +  f + z + " = "+ res);
        iScanner.close();
    }
 }