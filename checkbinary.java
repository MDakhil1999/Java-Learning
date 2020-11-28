import java.util.*;

class checkbinary
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("Binary : " + input.matches("[01]*"));
        System.out.println("Hexadecimal : " + input.matches("[0-9A-F]*"));
        System.out.println("Date : " + input.matches("[0-3][1-9]/[01][1-9]/[0-9]{4}"));
    }
}