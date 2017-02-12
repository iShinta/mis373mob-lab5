public class Mh47723_CD{
  private double balance;
  private static final double rate = 0.07;

  public void addAnnualInterest(){
    double interest = this.balance * rate;
    System.out.format("$%.2f has been added to your balance.\n", interest);
    this.balance += interest;
    System.out.format("The new balance is now $%.2f\n", this.balance);
  }

  public String getBalance(){
    return "$" + this.balance;
  }

  public Mh47723_CD(double starting){
    this.balance = starting;
  }
}
