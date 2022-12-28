// Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;




public class Task01 {
    


    public static String reader() {
      StringBuilder sb = new StringBuilder();
      try (BufferedReader br = Files.newBufferedReader(Paths.get("text.txt"))) {
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
        str = str.replace("{", "").replace("}", "").replace(":", " ").replace(",", "").replace("\"", "").replaceAll("\\n", "").replaceAll("\\r", "");
        String[] str2 = str.split(" ");
        System.out.println("from students where");
        for (int i = 0; i < str2.length; i+=2) {
          if (!(str2[i+1].equals("null"))){
                    System.out.println(str2[i]+ " = "+ str2[i+1]);
          }
        }
        
    }
    public static void main(String[] args) {
      split(reader());
        

       
    
    }



}
