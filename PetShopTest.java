import static org.junit.Assert.*;
import org.junit.*;

public class PetShopTest{
  PetShop petShop;
  Dog dog;
  Cat cat;

  @Before
  public void before(){
    petShop = new PetShop();
    dog = new Dog(50);
    cat = new Cat(20);
  }

  @Test
  public void inventoryStartsEmpty(){
    assertEquals(0, petShop.stockCount());
  }

  @Test
  public void canAddInventory(){
    petShop.addInventory(dog);
    assertEquals(1, petShop.stockCount());
  }

  @Test
  public void canSellPet(){
    petShop.addInventory(dog);
    Sellable animal = petShop.sellAnimal();
    Dog original = (Dog) animal;
    assertEquals(50, original.getPrice());
  }

  @Test
  public void hasInventoryTotal(){
    petShop.addInventory(dog);
    petShop.addInventory(cat);
    assertEquals(70, petShop.totalInventoryValue());
  }


}

