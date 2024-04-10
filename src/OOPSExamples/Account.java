package OOPSExamples;

public class Account {
    private int accId;
    private String name;
    private  double balance;
    public Account()
    {
        System.out.println("Constuctor Called");
        accId=345;
        name="Harshit JAin";
        balance=768646.6;
    }
    public void showAccount(){
    System.out.println("Acc id is "+accId+",Name is "+name+",bal is"+balance);}


}
