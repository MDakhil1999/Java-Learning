import java.util.*;

class remove_special
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = str.replaceAll("[^A-Za-z0-9]", "");
        System.out.println(ans);
    }
}