import java.util.*;
class count_noof_words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.replaceAll("\\s+"," ").trim();
        String words[] = str.split("\\s");
        System.out.println(words.length);
        
    }

}
