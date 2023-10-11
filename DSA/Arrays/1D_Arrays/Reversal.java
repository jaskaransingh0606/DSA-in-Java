// Reversal of an array

// Time Complexity: O(n)
// Space Complexity: O(1)



public class Reversal {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};

        int n = arr.length;

        for(int i=0;i<n/2;i++)
        
        {
            //we need to send arr also along with i and n-i-1 because otherwise it will only swap the copies of the elements and not in the original array


            swap(arr,i,n-i-1);            // Swapping the elements
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void swap (int[] arr,int i,int j)        // Swapping function 
    {         
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
}
