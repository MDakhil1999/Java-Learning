

import java.util.*;
class grade {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int sum = m1 + m2 + m3;
        System.out.println("The sum is " + sum);
        float avg = (float)sum/3;
        System.out.println("The average is " + avg);
        if (avg >= 70) {
            System.out.println("A Grade");
        }
        else if (60 <= avg && avg < 70) {
            System.out.println("B Grade");
        }
        else if (50 <= avg && avg < 60) {
            System.out.println("C Grade");
        }
        else if (40 <= avg && avg < 50) {
            System.out.println("D Grade");
        }
        else {
            System.out.println("F Grade");
        }
    }



}
