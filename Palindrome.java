public class Palindrome {
    public static void main(String args[]){
        int num =123;
        int rev = 0;
        int temp = num;
        while (temp > 0) {
            int lastdigit = temp%10;
            rev = (rev*10)+lastdigit;
            temp = temp /10;
                        
        }
        if(num == rev){
            System.out.println("palindrome");

        }else{
              System.out.println("Not palindrome");
        }
    }
    
}
