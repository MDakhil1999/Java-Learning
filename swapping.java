import java.util.*;

class swapping
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Before swapping the value of a is " + a + " and value of b is " + b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("After swapping the value of a is " + a + " and value of b is " + b);
    }
}