package cs3560FinalProject;

public class SaleFloorLocation {
    private String salesfloorlocationid;
    private int productid;
    private int currentQuantity;
    
    public SaleFloorLocation (String saleid, int productid, int currentQuantity)
    {
        this.salesfloorlocationid = saleid;
        this.productid = productid;
        this.currentQuantity = currentQuantity;
    }
    
    // getter methods
    public String getSaleID()
    {
        return salesfloorlocationid;
    }
    
    public int getProductID()
    {
        return productid;
    }
    public int getCurrentQuantity()
    {
        return currentQuantity;
    }
}