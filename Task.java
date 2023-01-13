import java.lang.ProcessBuilder.Redirect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

public class Task {
    public static void main(String[] args) {
        Laptop comp1= new Laptop(8, 1000, "Windows", "black");
        Laptop comp2= new Laptop(16, 1000, "Mac", "pink");
        Laptop comp3= new Laptop(8, 2000, "Windows", "yellow");
        Laptop comp4= new Laptop(16, 500, "Windows", "black");
        Laptop comp5= new Laptop(32, 3000, "Linux", "white");
        Laptop comp6= new Laptop(8, 250, "Mac", "rainbow");
        Laptop comp7= new Laptop(32,4000, "Linux", "green");
        Set<Laptop> comps = new HashSet<>(List.of(comp1, comp2, comp3, comp4, comp5, comp6, comp7));
        Set<Laptop> comps2 = new HashSet<>();

        System.out.println(comps.toString());
        // boolean x = true;
        while (true) {

            System.out.println( "Введите цифру, соответствующую необходимому критерию:\n1 - ОЗУ\n2 - Объем ЖД\n3 - Операционная система\n4 - Цвет");
            Map<Integer, String> result = new HashMap<>();
            Scanner iScanner = new Scanner(System.in);
            int key = iScanner.nextInt();
            String value = input();
            result.put(key, value);
            
            System.out.println( "Введите цифру, соответствующую необходимому критерию:\n1 - Посмотреть результат\n2 - ввести еще значение\n3 - Выход");
            String res = input();
            if (res.equals("1")){
                comps2.clear();
                for (Laptop comp : comps) {


                    try {
                        if(comp.getRam() >= Integer.parseInt(result.get(1))){
                            comps2.add(comp);
                        }
                    } catch (Exception e) {
                        ;
                    }
                    try {
                        if(comp.getHardDisk() >= Integer.parseInt(result.get(2))){
                            comps2.add(comp);
                        }
                    } catch (Exception e) {
                        ;
                    }
                    try {
                        if(comp.getOperatingSystem().equals(result.get(3))){
                            comps2.add(comp);
                        }
                    } catch (Exception e) {
                        ;
                    }
                    try {
                        if(comp.getColour().equals(result.get(4))){
                            comps2.add(comp);
                        }
                    } catch (Exception e) {
                        ;
                    }


                }
                
            }
            System.out.println(comps2.toString());
            if (res.equals("3")){
                break;
            }


            }
           
        
        }
        
    
    public static String input() {
        Scanner iScanner = new Scanner(System.in);
        String str = iScanner.nextLine();
        return str;
        
    }


    
    
}
