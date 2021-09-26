import java.util.Scanner;
import java.util.Map;

public class DictionaryCommandLine extends DictionaryManagement {
    private Scanner scan = new Scanner(System.in);
    public static void showAllWords() {
        int Check = 0;
        System.out.println("No  " + "English  " + "Vietnamese");
        for(Map.Entry<String, String> getWord : dictionary.entrySet()) {
            Check++;
            System.out.println(Check + "     "+ getWord.getKey() + "      " + getWord.getValue());
        }
    }

    public static void dictionaryBasic() {
        DictionaryManagement.insertFromCommandline();
        showAllWords();
    }

}
