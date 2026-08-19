package Arrays;

import java.util.Scanner;

public class ArraysCC {
    public static void main(String[] args) {
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in) ;

        // marks[0] = sc.nextInt(); //chem
        // marks[1] = sc.nextInt(); //phy
        // marks[2] = sc.nextInt(); //math

        // System.out.println("phy : "+marks[0]);
        // System.out.println("math : "+marks[1]);
        // System.out.println("chem : "+marks[2]);

        // float percentage = (marks[0]+marks[1]+marks[2]) / 3;
        // System.out.println("percentage : %"+percentage);
        System.out.println("length of Array= " + marks.length);
    }
}
