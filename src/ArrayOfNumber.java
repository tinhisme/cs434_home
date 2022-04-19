public class ArrayOfNumber {
     private int[] arr;

     public void descSort(int arr[]){
    	 int n = arr.length;
         for (int i = 0; i < n - 1; i++)
             for (int j = 0; j < n - i - 1; j++)
                 if (arr[j] < arr[j + 1]) {
                     int temp = arr[j];
                     arr[j] = arr[j + 1];
                     arr[j + 1] = temp;
         }
     }
     

     public int getMinimumValue(int arr[]){
    	 int result = arr[0];
    	 int n = arr.length;
         for (int i = 1; i < n; i++)
             result = Math.min(result, arr[i]);
         return result;
     }
     
     public int[] getArr() {
 		return arr;
 	}

 	public void setArr(int[] arr) {
 		this.arr = arr;
 	}

	

}