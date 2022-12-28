import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

// Дана json строка (можно сохранить в файл и читать из файла)
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

public class Task03 {
    public static String reader() {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = Files.newBufferedReader(Paths.get("text2.txt"))) {
          String str;
          while ((str = br.readLine()) != null) {
            sb.append(str).append(System.lineSeparator());
          }
        } catch (IOException e) {
          e.printStackTrace();
        }
        String str = sb.toString();
        return str;
    
      }
  
      public static void split(String str){
          str = str.replace("{", "").replace("}", "").replace(":", " ").replace(",", " ").replace("\"", "").replaceAll("\\n", "").replaceAll("\\r", "");
          String[] str2 = str.split(" ");
          
          for (int i = 0; i < str2.length; i+=6) {
            System.out.println("Студент " + str2[i+1]+ " получил " + str2[i+3] + " по предмету " + str2[i+5] + ".");
            
          }
          
      }
      public static void main(String[] args) {
        split(reader());
          
  
         
      
      } 
}
