//post increment

package Operators;

public class Post_increment {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        b = a++; 
        //---> b = a
        //     a = a + 1
        System.out.println("Post increment valueof a : "+a);
        System.out.println("value of b : "+b);


    }
}
