public class InsertionSort {
    public static void InsSort(int arr[]){
        for(int i =1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;

            // finding the correct space to insert arr[i] element 
            while (prev>=0 && arr[prev]>curr) {
                arr[prev+1] = arr[prev];
                prev--;
                
            }
            
            // inserting arr[i] element to correct position 
            arr[prev+1] =curr;

        }
       
       
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        InsSort(arr);
        printArr(arr);
        
    }
    
}
