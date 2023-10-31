public class FindingPower {
    public static void main(String[] args) {
        int n=2;
        int k=10;

        int num = findPower(n,k);
        System.out.println(num);
    }

    public static int findPower(int n,int k){
        if(k==1){
            return n;
        }
        else{
           int result=findPower(n,k/2);
            int finalResult=result*result;

            if(k%2==0){
                return finalResult;
            }
            else{
                return finalResult*n;
            }
        }
    }
    
}
