package cs3560FinalProject;

public class SaleItem {
    private int saleID;
    private int productID;
    
    public SaleItem(int productID, int saleID)
    {
        this.saleID = saleID;
        this.productID = productID;
    }
    
    // getters
    public int getSaleID()
    {
        return saleID;
    }
    
    public int getProductID()
    {
        return productID;
    }
}