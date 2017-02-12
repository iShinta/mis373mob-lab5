public class Mh47723_TempTester{
  public static void main(String [] args){
    Mh47723_Temperature t1 = new Mh47723_Temperature();
    Mh47723_Temperature t2 = new Mh47723_Temperature();

    t1.setFahrenheit(80);
    t1.setCelsius(28);
    t2.setFahrenheit(100);
    t2.setCelsius(0);
    System.out.println(t1.getAsCelsius());
    System.out.println(t1.getAsFahrenheit());
    System.out.println(t2.getAsCelsius());
    System.out.println(t2.getAsFahrenheit());
  }
}
