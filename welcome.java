import java.util.*;

class welcome
{
    public static void main(String args[])
    {
        System.out.println("May I know your name");
        Scanner s = new Scanner(System.in);
        String name;
        name = s.next();
        System.out.println("Welcome Mr/Mrs:"+name);
    }
}