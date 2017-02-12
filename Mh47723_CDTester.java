public class Mh47723_CDTester{
  public static void main(String [] args){
    Mh47723_CD cd = new Mh47723_CD(150070.38);
    System.out.println("The Certificate Deposit currently has " + cd.getBalance());
    cd.addAnnualInterest();
    cd.addAnnualInterest();
  }
}
