public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int target=5;
        int result=FindIndex(arr,0,target);
        if(result==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index "+result);
        }
    }

    public static int FindIndex(int[] arr,int index,int target){
        if(index==arr.length){
            return -1;
        
        }

        else if(arr[index]==target){
            return index;
        }
        else {
            return FindIndex(arr,index+1,target);
        }
    }
    
}
