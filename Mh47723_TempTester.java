public class Mh47723_TempTester{
  public static void main(String [] args){
    Mh47723_Temperature t1 = new Mh47723_Temperature();
    Mh47723_Temperature t2 = new Mh47723_Temperature();

    t1.setFahrenheit(80);
    t1.setCelsius(28);
    t2.setFahrenheit(100);
    t2.setCelsius(0);
    System.out.format("C%.2f\n", t1.getAsCelsius());
    System.out.format("F%.2f\n", t1.getAsFahrenheit());
    System.out.format("C%.2f\n", t2.getAsCelsius());
    System.out.format("F%.2f\n", t2.getAsFahrenheit());
  }
}
