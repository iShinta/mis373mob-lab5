public class Mh47723_BankTester{
  public static void main(String [] args){
    Mh47723_BankAccount savings = new Mh47723_BankAccount("Savings");
    Mh47723_BankAccount checking = new Mh47723_BankAccount("Checking");

    savings.depositMoney(10250.67);
    checking.depositMoney(217.38);

    savings.depositMoney(200);
    checking.withdrawMoney(220);

    String[] balance = checking.getBalance();
    System.out.println(balance[1] + " has a balance of " +balance[0]);
  }
}
