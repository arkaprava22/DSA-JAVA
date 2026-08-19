package Arrays;

import java.util.*;

public class Largest_array {
    public static int getlargest(int numbers[]){

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE; 

        for(int i=0;i<numbers.length;i++){

            if(largest < numbers[i]){

                largest = numbers[i];
            }
            if(smallest>numbers[i]){
                smallest = numbers[i];
            }
        }

        System.out.println("smallest value: "+smallest);
        return largest;
    }

    public static void main(String[] args) {
        int numbers[]  = {2,9,5,6,10,8};

        System.out.println("Largest number: "+getlargest(numbers));

    }
}
