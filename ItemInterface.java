package cs3560FinalProject;

public interface ItemInterface {
   public void addAnItem(int productID, String ProductName, int totalQuantity, double productPrice, String productDescription);
   public void removeAnItem(int productID);
   public void defectAnItem(int productID);
   public void putItemOnSale(double oldPrice, double newPrice);
   public void searchItemByID(int productID);
   public boolean isOnSale(int productID, String itemName);
   public void relocateBackroomItem(int productID, String newBackLocation);
   public void relocateSalesloorItem(int productID, String newSalesLocation);
   public void restock(int productID, int newTotalQuantity);
   public void checkPrice(int productID, String itemName);
   public void checkBackroomLocation(int productID);
   public void checkSalesFloorLocation(int productID);
}