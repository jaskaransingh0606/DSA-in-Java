class Name {
    public int sum(int a, int b) {
        int sum1 = a + b;
        return sum1;
    }
    public int sum(int a, int b, int c) {
        int sum2 = a + b + c;
        return sum2;
    }
    public int sum(int a, int b, int c, int d) {
        int sum3 = a + b + c + d;
        return sum3;
    }
}

public class Method {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 7;
        int num3 = 8;
        int num4 = 9;
        Name obj = new Name();  
        int result1 = obj.sum(num1, num2, num3,num4);
        int result2=obj.sum(num1,num2,num3);
        System.out.println("The sum of the numbers is " + result1);
        System.out.println("The sum of the numbers is " + result2);
    }
}
