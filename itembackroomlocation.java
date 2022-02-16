package cs3560FinalProject;

public class itembackroomlocation {
    private int productID;
    private String productLocation;
    private String productName;
    
    public itembackroomlocation(int productID, String productLocation, String productName)
    {
        this.productID = productID;
        this.productLocation = productLocation;
        this.productName = productName;
    }
    

	// getters
    public int getProductID()
    {
        return productID;
    }
    
    public String getProductLocation()
    {
        return productLocation;
    }
    
    public String getProductName()
    {
    	return productName;
    }
}