public class Mh47723_Event implements Mh47723_Sellable{
  private String name;
  private int days;
  private int pricePerDay;

  public int getPrice(){
    return this.pricePerDay * this.days;
  }

  public String getName(){
    return name;
  }

  public Mh47723_Event(String name, int days, int pricePerDay){
    this.name = name;
    this.days = days;
    this.pricePerDay = pricePerDay;
  }

  public Mh47723_Event(){}
}
