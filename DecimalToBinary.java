public class DecimalToBinary {
     public static int convert(int decNum){
        int binNum=0;
        int pow=0;
        int quotient = decNum;

        while(quotient>0){
           
            int remainder = quotient % 2;
            binNum = binNum + (remainder*(int)Math.pow(10, pow));
            quotient= quotient/2;
            pow++;
        }
        return binNum;

    }
     public static void main(String[] args){
        int result = convert(11);
        System.err.println(result);

        
     }
    
}
