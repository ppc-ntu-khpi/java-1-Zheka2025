/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import domain.Customer;

/**
 *
 * @author Evgenii
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setID(5);
        customer.setIsNew(false);
        customer.setTotal(123.0);
        customer.displayCustomerInfo();
    }
}
