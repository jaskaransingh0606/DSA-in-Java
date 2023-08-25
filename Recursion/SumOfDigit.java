

public class SumOfDigit {
    public static int FindSum(int n){
        int result=0;
        if(n==0){
            return 0;
        }
        else{
            result=(n%10)+FindSum(n/10);
        }
        return result;
    }
    public static void main(String[] args) {
        int n=12345;
        int result=FindSum(n);
        System.out.println("Sum of digit of "+n+" is "+result);
    }
}
