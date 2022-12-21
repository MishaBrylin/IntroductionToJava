// *+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
public class task4 {
    public static void main(String[] args) {
        String z = "2? + ?5 = 69";
        z = z.replace("+ ", "");
        z = z.replace("= ", "");
        z = z.replace("?", "0");
        String[] f = z.split(" ");
 
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {

                int u = Integer.parseInt(f[0].trim())+i;
                int y = Integer.parseInt(f[1].trim())+j*10;
                int k = Integer.parseInt(f[2].trim());
                // System.out.println(u +" " + y + "\n"+ k);
                int l = u + k;
                
                if (k==u+y) {
                    System.out.println(u+"+" + y + "=" + + k);
                    
                }
                // System.out.println(f[0] +  "  " + f[1][0]);
                // System.out.println(u + "  "+ y + "  "+ k);
                // f[0] = f[0].replace(Integer.toString(i-1), Integer.toString(i));
                // f[1] = f[1].replace(Integer.toString(j-1), Integer.toString(j));


                
            }
            
        }
        
    } 
}
