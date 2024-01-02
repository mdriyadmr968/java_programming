public class NumberofSeven {

    
     public static int NumberofSeven(int matrix[][], int key){
        int count = 0;

        for(int i =0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    count++;
                }
            }
        
        }
        return count;   

             
    }

    public static void main(String[] args) {
        int matrix[][] = {{10, 20, 30, 40},
                       {15, 25, 33, 45},
                       {27, 29, 37, 48},
                       {32, 33, 39, 50}};

        int key = 33;
        System.out.println(NumberofSeven(matrix, key));
      
        
    }
    
}
