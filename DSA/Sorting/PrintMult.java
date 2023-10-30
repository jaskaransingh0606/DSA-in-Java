public class PrintMult {
    public static void main(String[] args) {
        int n=20;
        int k=5;

        printMult(n,k);
    }

    public static void printMult(int n,int k){
        if(k==1){
            System.out.println(n);
            return ;
        }
        else{
             printMult(n, k-1);
            System.out.println(n*k);
        }
    }
    
}
