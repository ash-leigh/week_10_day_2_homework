public class Dog implements Sellable {

  private int price;

  public Dog(int price){
    this.price = price;
  }

  public int getPrice(){
    return this.price;
  }
  
}