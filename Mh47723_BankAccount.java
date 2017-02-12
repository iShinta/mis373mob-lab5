public class Mh47723_BankAccount{
  private double balance;
  private String nickname;

  public void depositMoney(double amount){
    if(amount >= 0){
      this.balance += amount;
      System.out.println("$" + amount + " has been deposited in " + this.nickname);
    }
  }

  public void withdrawMoney(double amount){
    if(amount >= 0){
      if(this.balance >= amount){
        this.balance -= amount;
        System.out.println("$" + amount + " has been withdrawed from " + this.nickname);
      }else{
        System.out.println(this.nickname + " doesn't have enough balance for this withdraw");
      }
    }else{
      System.out.println("You cannot withdraw a negative amount");
    }
  }

  public String[] getBalance(){
    String[] res = new String[2];
    res[0] = "$" + this.balance;
    res[1] = this.nickname;
    return res;
  }

  public Mh47723_BankAccount(String nickname){
    this.balance = 0;
    this.nickname = nickname;
  }
}
