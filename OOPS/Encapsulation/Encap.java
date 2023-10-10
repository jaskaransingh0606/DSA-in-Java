
class Student {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public void show() {
        System.out.println(age + " " + name);
    }

}

public class Encap {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setAge(20);
        obj.setName("Rahul");
        obj.show();
        int stud1 = obj.getAge();
        System.out.println(stud1);

    }

}
