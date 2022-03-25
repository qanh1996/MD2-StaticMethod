package th;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.changge();
        Student s1 = new Student(111,"Anh");
        Student s2 = new Student(222,"Long");
        Student s3 = new Student(333,"Thanh");

        s1.display();
        s2.display();
        s3.display();

    }

}
