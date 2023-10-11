 
// Rotate a matrix by 90 degree in clockwise direction without using any extra space

// time complexity: O(n^2)
// space complexity: O(1)


public class Rotation {
    
    public static void rotatedMatrix(int[][] arr){

        // step 1: transpose the matrix
        
        int n = arr.length;  // number of rows
        int m = arr[0].length;  // number of columns

        for(int i=0;i<n;i++){
            for(int j=i;j<m;j++){

                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        // step 2: swap between columns

        for(int i=0;i<n;i++){
            
            int li=0;
            int ri=n-1;

            while(li<ri){
                int temp=arr[i][li];
                arr[i][li]=arr[i][ri];
                arr[i][ri]=temp;

                li++;
                ri--;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");

        }


    }
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        

        rotatedMatrix(arr);



    }

}
