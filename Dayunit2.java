 class Student{
    int roll,phoneno;
    char gender;
    String name,email;
}

public class Dayunit2 {
public static void main(String[] args) {
    System.out.println("Hello" );
    Student s1 = new Student();

    s1.phoneno=1234;
    s1.roll=1;
    s1.gender='F';
    s1.name="Snehal";
    s1.email="snehal@gmail.com";
    System.out.println(s1.name);
    System.out.println(s1.roll);
    System.out.println(s1.gender);
    System.out.println(s1.email);
    System.out.println(s1.phoneno);
    Student s2 = new Student();

    s1.phoneno=1234567;
    s1.roll=2;
    s1.gender='f';
    s1.name="Saee";
    s1.email="saee@gmail.com";
    System.out.println(s1.name);
    System.out.println(s1.roll);
    System.out.println(s1.gender);
    System.out.println(s1.email);
    System.out.println(s1.phoneno);




}
}
