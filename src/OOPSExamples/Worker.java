package OOPSExamples;

public class Worker {
 private   int hw;
 private double payrate;
 public void  setData(int h,double r){
     hw=h;
     payrate=r;
 }
 public double getSalary(){
     double sal;
     if (hw<=40)
         sal=hw*payrate;
     else
         sal=40*payrate+2*(hw-40)*payrate;
     return sal;
 }


}