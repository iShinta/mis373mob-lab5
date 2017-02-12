public class Mh47723_CD{
  private double balance;
  private static final double rate = 0.07;

  public void addAnnualInterest(){
    double interest = this.balance * rate;
    System.out.println(interest + "has been added to your balance.");
    this.balance += interest;
    System.out.println("The new balance is now $" + balance);
  }

  public String getBalance(){
    return "$" + this.balance;
  }

  public Mh47723_CD(double starting){
    this.balance = starting;
  }
}
