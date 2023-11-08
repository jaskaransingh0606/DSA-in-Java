import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int[] result = new int[2];
        int targetSum = 1;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            map.put(arr[i], i);

        }

        

        // if current element equals target

        for(int i=0;i<arr.length;i++){

           
            if(arr[i]== targetSum && map.containsKey(0)){
                result[0] = i;
                result[1] = map.get(0);
                break;

            }

            else if(map.containsKey(targetSum-arr[i])){

                if(map.get(targetSum-arr[i])>i){
                    result[0] = i;
                    result[1] = map.get(targetSum-arr[i]);
                    break;
                }

            }
            else{
                continue;
            }
        }

        result[0]=-1;
        result[1]=-1;

        System.out.println("The indices are: " + result[0] + " " + result[1]);



    }

}
