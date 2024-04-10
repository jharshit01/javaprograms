package staticExamples;

public class UseEmp {
    public static void main(String[] args) {
        Emp e,f,g;
        e=new Emp(23,"mohan");
        f=new Emp(25,"sooraj");
        g=new Emp(27,"Gunjan");
        e.show();
        f.show();
        g.show();
        e.showNextId();
        f.showNextId();
        g.showNextId();
    }
}
