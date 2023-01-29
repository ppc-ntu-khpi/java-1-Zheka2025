/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Evgenii
 */
public class Customer {
    private int ID = 1;
    private boolean isNew = true;
    private double total = 1000.0;
  
    public Customer() {
    ID = 0;
    isNew = false;
    total = 0.0;
  }
    public int getID() {
        return ID;
    }
  
    public boolean getIsNew() {
        return isNew;
    }
  
    public double getTotal() {
        return total;
    }
    
    public void setID(int ID) {
    this.ID = ID;
  }

  public void setIsNew(boolean isNew) {
    this.isNew = isNew;
  }

  public void setTotal(double total) {
    if (total >= 0) {
      this.total = total;
    }
  }
  
    public void displayCustomerInfo() {
        System.out.println("ID: " + ID);
        System.out.println("Is new customer: " + isNew);
        System.out.println("Total purchases are: " + total);
    }
}
