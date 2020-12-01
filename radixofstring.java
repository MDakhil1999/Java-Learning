import java.util.*;

class radixofstring{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        if(a.matches("[01]+")){
            System.out.println("Radix = 2 : Binary");
        }
        else if(a.matches("[0-7]+")){
            System.out.println("Radix = 8 : Octal");
        }
        else if(a.matches("[0-9]+")){
            System.out.println("Radix = 10 : Decimal");
        }
        else if(a.matches("[0-9A-F]+")){
            System.out.println("Radix = 16 : Hexadecimal");
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}