//rectangle pattern
package Patterns;

public class Patterns {
    public static void main(String[] args){
             int n = 4;
             int m = 5;   
        //inner loop for columns
        for(int i=1;i<=n;i++){
            //outer loop for rows
            for(int j=1;j<m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
