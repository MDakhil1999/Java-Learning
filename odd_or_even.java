import java.util.*;
class odd_or_even {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n%2 == 0) {
            System.out.println("It is an even number!!");
        }
        else {
            System.out.println("It is an odd number!!");
        }
    }
}