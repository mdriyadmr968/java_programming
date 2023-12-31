public class SearchInRCSortedMatrix {

    
     public static boolean SearchInRCSortedMatrix(int matrix[][], int key){
        int row = matrix.length-1, col=0;

        while (row>=0 && col < matrix[0].length) {
            if(matrix[row][col] == key){
               return true;
            }else if(key>matrix[row][col]){ 
                col++;

            }else{
                row--;
            }
            
        }

        System.out.println("Not found ");
       

        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = {{10, 20, 30, 40},
                       {15, 25, 35, 45},
                       {27, 29, 37, 48},
                       {32, 33, 39, 50}};

        int key = 33;
        System.out.println(SearchInRCSortedMatrix(matrix, key));
      
        
    }
    
}
