import java.util.Scanner;
import java.util.Map;

public class DictionaryCommandLine extends DictionaryManagement {
    private static Scanner scan = new Scanner(System.in);
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

    public static void dictionaryAdvanced() {
        DictionaryManagement.insertFromFile();

        DictionaryManagement.dictionaryLookup();
        DictionaryManagement.dictionaryEditing();
        DictionaryManagement.dictionaryDelete();
        DictionaryManagement.dictionaryExportToFile();
        showAllWords();
    }

    public static void dictionarySearcher() {
        System.out.print("Searcher: ");
        String Search = scan.next();

        for (Map.Entry<String, String> getWord : dictionary.entrySet()){
            int k = 0;
            String WordNS = getWord.getKey();
            for (int i = 0; i < Search.length(); i++){
                if(Search.charAt(i) != WordNS.charAt(i)){
                    k =1;
                    break;
                }
            }
            if (k == 0)System.out.println(getWord.getKey());
        }
    }


}
