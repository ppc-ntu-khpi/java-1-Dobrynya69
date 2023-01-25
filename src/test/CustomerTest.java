
package test;
import domain.Customer;

public class CustomerTest {
    public static void main(String[] args){
        Customer customer = new Customer();
        customer.displayCustomerInfo();
        
        customer.setID(13);
        customer.setIsNew(true);
        customer.setTotal(10.9F);
        customer.displayCustomerInfo();
    }
}
