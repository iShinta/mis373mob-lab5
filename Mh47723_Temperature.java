public class Mh47723_Temperature{
  private double tempF;
  private double tempC;

  public void setFahrenheit(double temp){
    this.tempF = temp;
  }

  public void setCelsius(double temp){
    this.tempC = temp;
  }

  public double getAsFahrenheit(){
    return this.tempC * ((double)9/5) + 32;
  }

  public double getAsCelsius(){
    return (this.tempF - 32) * ((double)5/9);
  }

  public Mh47723_Temperature(){
    this.tempC = 0;
    this.tempF = 0;
  }
}
