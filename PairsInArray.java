public class PairsInArray {
     public static void Pairs(int numbers[]) {
        for(int i=0; i<numbers.length;i++){
           for(int j=0;j<numbers.length; j++){
             System.out.print("("+numbers[i]+ ","+ numbers[j]+")");
           }
           System.out.println();

        }
        
    }

    public static void main(String args[]) {
        int numbers[] = {2, 4, 6, 8, 10};
        Pairs(numbers);
       
        
    }
    
}
