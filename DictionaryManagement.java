
import java.util.Scanner;
import java.util.ArrayList;

public class DictionaryManagement extends Dictionary{

    public static void insertFromCommandline(){
         Scanner scanner = new Scanner(System.in);
         int n;
         String english, vietnamese, t;
         n = scanner.nextInt();
         t = scanner.nextLine();
         for (int i = 0; i < n; i++){
             english = scanner.nextLine();
             vietnamese = scanner.nextLine();
             Word temp = new Word(english, vietnamese);
             words.add(temp);
         }

     }
}
