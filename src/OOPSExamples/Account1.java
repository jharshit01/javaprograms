package OOPSExamples;

public class Account1 {
    private int accId;
    private String name;
    private  double balance;
    public Account1(int id,String n,double b)
    {

        accId=id;
        name=n;
        balance=b;
    }
    public void showAccount(){
        System.out.println("Acc id is "+accId+",Name is "+name+",bal is"+balance);}



}
