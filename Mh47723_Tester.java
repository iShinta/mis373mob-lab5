import java.util.ArrayList;

public class Mh47723_Tester{
  public static void main(String [] args){
    System.out.println("------------");
    Mh47723_Product p1 = new Mh47723_Product("Bling Bling Jeans", 100);
    Mh47723_Event e1 = new Mh47723_Event("Fashion Training", 5, 200);

    Mh47723_Shopping_Cart cart = new Mh47723_Shopping_Cart();
    cart.addItemToCart(p1);
    cart.addItemToCart(e1);
    print(cart);
    System.out.println("------------");
    ArrayList<Mh47723_Sellable> items = new ArrayList<Mh47723_Sellable>();
    items.add(new Mh47723_Product("Dance Video", 50));
    items.add(new Mh47723_Event("Rumba Class", 5, 100));
    items.add(p1);
    items.add(e1);
    Mh47723_Shopping_Cart cart2 = new Mh47723_Shopping_Cart(items);
    print(cart2);
    System.out.println("-------------");
  }

  private static void print(Mh47723_Shopping_Cart cart){
    System.out.println("Number of cart items is: " + cart.getCartItemCount());
    System.out.println("Total price of cart items is: " + cart.getCartTotalPrice());
  }
}
