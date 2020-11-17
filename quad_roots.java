import java.util.*;

class quad_roots
{
    public static void main(String args[])
    {
        int a,b,c;
        double root1,root2;
        System.out.println("Enter the 3 coefficients: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        root1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
        root2 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);
        System.out.println("The roots are : " + root1 + " and " + root2);
    }
}