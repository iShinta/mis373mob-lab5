import java.util.ArrayList;

public class Mh47723_Shopping_Cart{
  private ArrayList<Mh47723_Sellable> items;

  public void addItemToCart(Mh47723_Sellable item){
    items.add(item);
    System.out.println("Added " + item.getName() + " costing $" + item.getPrice() + " to cart.");
  }

  public int getCartItemCount(){
    return items.size();
  }

  public int getCartTotalPrice(){
    int res = 0;
    for(Mh47723_Sellable s: this.items){
      // Mh47723_Sellable s2 = (Mh47723_Sellable) s;
      // res +=  s2.getPrice();
      // res +=  ((Mh47723_Sellable)s).getPrice();
      res +=  s.getPrice();
    }
    return res;
  }

  public void printToScreen(){
    for(Mh47723_Sellable s: this.items){
      // System.out.println(((Mh47723_Sellable)s).getName());
      System.out.println(s.getName());
    }
  }

  public Mh47723_Shopping_Cart(){
    this.items = new ArrayList<Mh47723_Sellable>();
  }

  public Mh47723_Shopping_Cart(ArrayList<Mh47723_Sellable> itemsPassedIn){
    //this.items = itemsPassedIn;
    this();
    for(Mh47723_Sellable cartItemObject: itemsPassedIn){
      addItemToCart(cartItemObject);
    }
  }
}
