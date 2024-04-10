package inhexamples;

public class UseManager {
    public static void main(String []args){
        Manager boss;
        boss=new Manager();
        boss.setData("Harshit",90000.0);
        boss.setBonus(25000.0);
        System.out .println("Manager's Name is "+boss.getName());
        System.out.println("Manager's Income is "+boss.getIncome());
    }
}
