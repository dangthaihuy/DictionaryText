import java.util.Scanner;

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

}
