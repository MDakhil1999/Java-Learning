

import java.util.*;
class youngornot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 14 && age <= 55) {
            System.out.println("Young!!");
        }
        else {
            System.out.println("Aged!!");
        }
    }
}
