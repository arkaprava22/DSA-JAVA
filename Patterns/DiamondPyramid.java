package Patterns;

public class DiamondPyramid{
   public static void main(String args[]) {
       int n = 5;


       for(int i=1; i<=n; i++) {
           //spaces 1st half
           for(int j=1; j<=n-i; j++) {
               System.out.print(" ");
           }
           for(int j=1; j<=2*i-1; j++) {
               System.out.print("*");
           }
           System.out.println();
       }


        //spaces 2nd half
       for(int i=n; i>=1; i--) {
       
           for(int j=1; j<=n-i; j++) {
               System.out.print(" ");
           }
           for(int j=1; j<=2*i-1; j++) {
               System.out.print("*");
           }
           System.out.println();
       }
   }   
}
