class Name {
    public int sum(int a, int b) {
        int sum1 = a + b;
        return sum1;
    }
    public int sum(int a, int b, int c) {
        int sum2 = a + b + c;
        return sum2;
    }
}

public class Method {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 7;
        int num3 = 8;
        Name obj = new Name();
        int result = obj.sum(num1, num2, num3);
        System.out.println("The sum of the numbers is " + result);
    }
}
