package cs3560FinalProject;

public interface ProductItemInterface extends ItemInterface {
   public void putItemOnSale(int productID, double discountPercent, String startDate, String endDate);
}