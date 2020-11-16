import java.util.*;

class trianglearea
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int base,height;
        float area;
        base = sc.nextInt();
        height = sc.nextInt();
        area = (float)(base*height)/2;
        System.out.println("The area of the triangle is : " + area);
    }
}