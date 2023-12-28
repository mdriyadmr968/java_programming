public class BinaryToDecimal {
    public static int convert(int binNum){
        int decimal=0;
        int pow=0;
        while(binNum>0){
            int lastdigit = binNum%10;
            decimal = decimal+ lastdigit*(int)Math.pow(2, pow);
            pow++;
            binNum = binNum/10;


        }
        return decimal;

    }
     public static void main(String[] args){
        int result = convert(1001);
        System.err.println(result);

        
     }
    
}
