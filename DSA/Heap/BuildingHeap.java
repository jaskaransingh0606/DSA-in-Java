// time complexity : O(n)
// space complexity : O(1)

public class BuildingHeap {
    public static void heapify(int arr[] , int n , int i){
        //assumption that parent node  is the largest element
        int largest = i;
        //left child of the parent node
        int leftIdx = 2*i+1;
        //right child of the parent node
        int rightIdx = 2*i+2;

        //check if left child is greater than parent node

        if(leftIdx<n && arr[leftIdx]>arr[largest]){
            largest = leftIdx;
        }

        //check if right child is greater than parent node

        if(rightIdx<n && arr[rightIdx]>arr[largest]){
            largest = rightIdx;
        }

        // if left or right child is greater than parent node than its index will not be same as i which is the index of parent node so we will swap the parent node with the largest element

        if(largest!=i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr,n,largest);   //recursively heapify the affected sub-tree
        }
    }

    public static void buildHeap(int arr[] , int n){
        int startIdx = (n/2)-1;
        for(int i=startIdx;i>=0;i--){
            heapify(arr,n,i);    
        }
        
    }
    public static void displayHeap(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int arr[] = {1,3,5,4,6,13,10,9,8,15,17};
        int n = arr.length;
         buildHeap(arr,n);
         displayHeap(arr,n);
    }
    
}
