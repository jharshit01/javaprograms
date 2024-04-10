package staticExamples;

public class UseEmp1 {
    public static void main(String[] args) {
        Emp1 e,f,g;
        e=new Emp1(23,"Harshit");
        f=new Emp1(24,"Durgesh");
        g=new Emp1(25,"Naman");
        e.show();
        f.show();
        g.show();
        e.showNextId();
        {
            Emp1 x,y;
            x=new Emp1(20,"Rahul");
            y=new Emp1(24,"Vinay");
            x.show();
            y.show();
            x.showNextId();
            x=y=null;
            System.gc();
            System.runFinalization();
        }
        e.showNextId();
    }
}
