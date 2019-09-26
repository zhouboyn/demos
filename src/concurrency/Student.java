package concurrency;

/**
 * @desc:
 * @author: zhoubo
 * @date: 2019-05-17
 **/
public class Student extends Person {

    String school;
    String name;

    public Student(String name,  String school) {
        super();
        this.school = school;
        this.name = name;
    }
    String getFatherName() {
        return super.name;
    }
    public static void main(String[] args) {
        Student s = new Student("Bob", "SEU");
        System.out.println(s.name);
        System.out.println(s.getFatherName());

        System.out.println(s.age);
        System.out.println(s.money);

        String s1 = "runoob";
        String s2 = "runoob";
        System.out.println("s1 == s2 is:" + s1 == s2);
    }
}
