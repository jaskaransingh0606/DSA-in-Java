public class BinarySearch {

    public static int FindIndex(int[] arr,int start,int end,int target){
        int mid= start +(end-start)/2;
        while(start<=end){
            if(arr[mid]== target){
                return mid;
            }
            else if(arr[mid]<target){
                return FindIndex(arr,mid+1,end,target);

            }
            else{
                return FindIndex(arr,start,mid-1,target);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int target=9;
        int result=FindIndex(arr,0,arr.length-1,target);
        System.out.println("Index of "+target+" is "+result);
    }
    
}
