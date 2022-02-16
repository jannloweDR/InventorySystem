package cs3560FinalProject;

import java.sql.*;
import java.util.Vector;
import javax.swing.table.*;


public class ProductItem implements ProductItemInterface {
    sqlCreds cred = new sqlCreds();
    
    private int productID;
    private String productName;
    private int totalQuantity;
    private double productPrice;
    private String productDescription;
    private String productDepartment;
    
    public ProductItem(int productID, String productName, int totalQuantity, double productPrice, String productDescription, String productDepartment)
    {
        this.productID = productID;
        this.productName = productName;
        this.totalQuantity = totalQuantity;
        this.productPrice = productPrice;
        this.productDescription = productDescription;
        this.productDepartment = productDepartment;
    }
    
    // getters
    public int getProductID()
    {
        return productID;
    }
    
    public String getProductName()
    {
        return productName;
    }
    
    public int getTotalQuantity()
    {
        return totalQuantity;
    }
    public double getProductPrice()
    {
        return productPrice;
    }
    
    public String getProductDescription()
    {
        return productDescription;
    }
    
    public String getProductDepartment()
    {
        return productDepartment;
    }
    
    @Override
    public void putItemOnSale(int productID, double discountPercent, String startDate, String endDate) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(cred.getUrl(),cred.getUsername(),cred.getPass());
            String query = "INSERT INTO saleoffering VALUES(?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, productID);
            ps.setDouble(2, discountPercent);
            ps.setString(3, startDate);
            ps.setString(4, endDate);
            ps.executeUpdate();
        }catch(Exception e){System.out.println(e);}
    }

    @Override
    public void addAnItem(int productID, String productName, int totalQuantity, double productPrice, String productDescription) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(cred.getUrl(),cred.getUsername(),cred.getPass());
            String query = "INSERT INTO productitem VALUES(?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, productID);
            ps.setString(2, productName);
            ps.setInt(3, totalQuantity);
            ps.setDouble(4, productPrice);
            ps.setString(5, productDescription);
            ps.executeUpdate();
        }catch(Exception e){System.out.println(e);}
    }
    @Override
    public void removeAnItem(int productID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void defectAnItem(int productID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void searchItemByID(int productID) {        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(cred.getUrl(),cred.getUsername(),cred.getPass());
            Statement stmt=con.createStatement();  
            String query = "Select * from productitem where productID = " + productID;
            ResultSet rs=stmt.executeQuery(query);
            ResultSetMetaData md = rs.getMetaData();            
            while(rs.next()){

            }
            rs.close();
            stmt.close();
            con.close();
            
        }catch(Exception e){System.out.println(e);}  
    }

    @Override
    public boolean isOnSale(int productID, String itemName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void restock(int productID, int newTotalQuantity) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(cred.getUrl(),cred.getUsername(),cred.getPass());
            String query = "UPDATE productitem SET TotalQuantity = ? WHERE ProductID = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, newTotalQuantity);
            ps.setInt(2, productID);
            ps.executeUpdate();
        }catch(Exception e){System.out.println(e);} 
    }

    @Override
    public void checkPrice(int productID, String itemName) {
        
    }

    @Override
    public void checkBackroomLocation(int productID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void checkSalesFloorLocation(int productID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void putItemOnSale(double oldPrice, double newPrice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void relocateBackroomItem(int productID, String newBackLocation) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void relocateSalesloorItem(int productID, String newSalesLocation) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}