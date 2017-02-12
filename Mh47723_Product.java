public class Mh47723_Product implements Mh47723_Sellable{
  private String name;
  private int price;

  public int getPrice(){
    return this.price;
  }

  public String getName(){
    return this.name;
  }

  public Mh47723_Product(String name, int price){
    this.name = name;
    this.price = price;
  }

  public Mh47723_Product(){}
}
