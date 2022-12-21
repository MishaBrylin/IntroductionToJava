// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;
public class task1 {
    
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int n = iScanner.nextInt();
        int res1 = 0;
        int res2 = 1;
        for (int i = 1; i <= n; i++) {
        	res1 += i;
            res2 *= i;
    	}

        System.out.println("Сумма треугольного числа " + n + " равна " + res1 + "\nПроизведение числа " + n + " равна " + res2 );
        iScanner.close();
    }
 }
 
