import java.util.Scanner;

public class LargestString {

    public static String LargestString(String str[]){
        String largest = str[0];
        for(int i=1; i<str.length; i++){           
            if(largest.compareTo(str[i]) < 0){
               largest = str[i];
            }          

        }
         return largest;
    }
    public static void main (String[] args){
        String fruits[] = {"apple", "banana","mango"};
       
        System.out.println(LargestString(fruits));


    }
    
}
