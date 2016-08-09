import java.util.*;

public class PetShop{
  private ArrayList<Sellable> inventory;

  public PetShop(){
    this.inventory = new ArrayList<Sellable>();
  }

  public int stockCount(){
    return inventory.size();
  }

  public void addInventory(Sellable animal){
    inventory.add(animal);
  }

  public Sellable sellAnimal(){
    if(stockCount() > 0){
      return inventory.remove(0);
    }
    return null;
  }

  public int totalInventoryValue(){
    int total = 0;
    for(Sellable animal : inventory){
      total += animal.getPrice();
    }
    return total;
  }
}