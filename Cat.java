public class Cat implements Sellable {

  private int price;

  public Cat(int price){
    this.price = price;
  }
  
  public int getPrice(){
    return this.price;
  }

}