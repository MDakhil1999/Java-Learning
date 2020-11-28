import java.util.*;

class emailid
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int indexofat = str.indexOf("@");
        String username = str.substring(0, indexofat);
        String domain = str.substring(indexofat + 1, str.length());
        System.out.println("The username is : " + username);
        System.out.println("The domain is : " + domain);
        int indexofdot = domain.indexOf(".");
        System.out.println(domain.substring(0, indexofdot).equals("gmail"));
    }
}