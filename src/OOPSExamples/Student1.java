package OOPSExamples;

public class Student1 {
    private int roll;
    private  char grade;
    private  double per;
    public void setStudent(int r,char g,double p){
        roll=r;
        grade=g;
        per=p;
    }
    public void showStudent(){
        System.out.println("Roll is "+roll);
        System.out.println("Grade is "+grade);
        System.out.println("percentage is "+per);
    }
}

