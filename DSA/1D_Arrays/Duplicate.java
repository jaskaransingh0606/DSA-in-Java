public class Duplicate {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5 };

        boolean foundDuplicate = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate element is " + arr[i]);
                    foundDuplicate = true;

                }
            }
        }

        if(foundDuplicate==false)
        {
            System.out.println("No duplicate element found");
        }

    }

}
