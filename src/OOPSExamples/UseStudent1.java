package OOPSExamples;

public class UseStudent1 {
    public static void main(String[] args) {
        Student1 s;
        System.out.println("First Student Details");
        s=new Student1();
        s.setStudent(10,'A',67.9);
        s.showStudent();
        Student1 p;
        System.out.println("Second Student Details");
        p=new Student1();
        p.setStudent(110,'B',87.9);
        p.showStudent();

    }
}
