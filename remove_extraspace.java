import java.util.*;
class remove_extraspace {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.trim();
        System.out.println(str.replaceAll("\\s+"," "));
    }

    
}
