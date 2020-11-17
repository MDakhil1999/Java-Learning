import java.util.*;

class cuboid
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int length,breadth,height,area,volume;
        System.out.println("Enter the dimensions of the cuboid : ");
        length = sc.nextInt();
        breadth = sc.nextInt();
        height = sc.nextInt();
        volume = length * breadth * height;
        area = 2 * ((length*breadth) + (breadth*height) + (length*height));
        System.out.println("The area is " + area + " and volume is " + volume);
    }
}