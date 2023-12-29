public class CountingSort {
    public static void CntSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
           largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest];
        for(int i=0; i<arr.length; i++){
           count[arr[i]]++;
           
        }

        int j=0;
        for(int i=0; i<count.length; i++){
            while (count[i]>0) {
               arr[j] = i;
               j++;
               count[i]--; 
                
            }
        }
       
    }
   
    public static void CntSortDescendingOrder(int arr[]){
        int largest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest+1];

        for(int i=0; i<arr.length; i++){
           count[arr[i]]++;
        }

        int j=0;
        for(int i=count.length-1; i>=0; i--){
            while (count[i]>0) {
                arr[j] = i;
                j++;
                count[i]--;

                
            }
        }
       
    }
   
   
   
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2,8,3,4,9,};
        // CntSort(arr);
        CntSortDescendingOrder(arr);
        printArr(arr);
        
    }
    
}
