import java.util.*;

class typeofwebsite{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int indexofcolon = str.indexOf(":");
        if(str.substring(0,indexofcolon).equals("http")){
            System.out.println("Hypertext transfer protocol");
        }
        else if(str.substring(0,indexofcolon).equals("ftp")){
            System.out.println("File transfer protocol");
        }
        else if(str.substring(0, indexofcolon).equals("https")){
            System.out.println("Hypertext transfer protocol secure");
        }

        int lastindexofdot = str.lastIndexOf(".");
        if(str.substring(lastindexofdot+1, str.length()).equals("com")){
            System.out.println("Commercial ");
        }
        else if(str.substring(lastindexofdot+1, str.length()).equals("org")){
            System.out.println("Organization ");
        }
        else if(str.substring(lastindexofdot+1, str.length()).equals("net")){
            System.out.println("Network ");
        }
        

    }
}