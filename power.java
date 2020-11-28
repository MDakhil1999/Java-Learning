import java.util.*;

class power
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        int b = sc.nextInt();
        int total = 1;
        for (int i=0;i<b;i++)
        {
            total = total * 2;
        }
        System.out.println(total);
        System.out.println(total - a);

    }
}