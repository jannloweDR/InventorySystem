package cs3560FinalProject;

public class SaleOffering {
    private int saleID;
    private double discount;
    private String beginDate;
    private String endDate;
    
    public SaleOffering(int saleID, double discount, String beginDate, String endDate)
    {
        this.saleID = saleID;
        this.discount = discount;
        this.beginDate = beginDate;
        this.endDate = endDate;
    }
    
    // getters
    public int getSaleID()
    {
        return saleID;
    }
    
    public double getDiscount()
    {
        return discount;
    }
    
    public String getBeginDate()
    {
        return beginDate;
    }
    
    public String getEndDate()
    {
        return endDate;
    }
}