import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Map;

public class DictionaryManagement extends Dictionary {
    private static final Scanner scan = new Scanner(System.in);
    public static void insertFromCommandline() {
        System.out.print(" Number insert: ");
        int n = scan.nextInt();
        for ( int i = 1; i <= n; i++) {
            Word word = new Word();
            System.out.print("New Word: ");
            word.setWord_target(scan.next());
            scan.nextLine();
            System.out.print("Mean:  ");
            word.setWord_explain(scan.nextLine());
            dictionary.put(word.getWord_target(), word.getWord_explain());
        }
    }
    public static void insertFromFile() {
        try {
            FileReader fr = new FileReader("data.txt");
            BufferedReader br = new BufferedReader(fr);
            String insert = "";
            while (true){
                insert = br.readLine();
                if (insert == null){
                    break;
                }
                String txt[] = insert.split("\t");
                dictionary.put(txt[0], txt[1]);
            }
        }catch (Exception e){ }
    }
    public static void dictionaryLookup() {
        System.out.print("Searching: ");
        String wordSearch = scan.next();
        scan.nextLine();
        System.out.println(  dictionary.getOrDefault("Mean: " + wordSearch ,"Word not found"));

    }

}
