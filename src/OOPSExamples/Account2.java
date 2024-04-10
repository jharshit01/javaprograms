package OOPSExamples;

public class Account2 {
    private int accId;
    private String name;
    private  double balance;
        public Account2(int id,String n,double bl){
        System.out.println(" 3 Constuctor Called");
        accId=id;
        name=n;
        balance=bl;
    }
    public Account2(int id,String n){
        System.out.println("  2 Constuctor Called");
        accId=id;
        name=n;

    }

    public void showAccount(){
        System.out.println("Acc id is "+accId+",Name is "+name+",bal is"+balance);}

}
