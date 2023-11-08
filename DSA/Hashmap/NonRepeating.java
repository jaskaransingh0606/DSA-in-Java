import java.util.*;

public class NonRepeating {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");

        String str = sc.nextLine();

        HashMap<Character, Integer> map = new HashMap<>();

        //Constructing the hashmap
        //Key: Character
        //Value: Frequency of the character

        for(int i=0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
            else{
                map.put(str.charAt(i),1);
            }
        }

        int result=-1;
        for(int i=0;i<str.length();i++){
            if(map.get(str.charAt(i))==1){
                System.out.println("The first non-repeating character is: " + str.charAt(i) + " at index: " + i);
                result=1;
                break;
            }
        }

        if(result==-1){
            System.out.println("No non-repeating character found");
        }
        


        
    }
    
}
