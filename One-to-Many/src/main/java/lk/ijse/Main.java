package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.entity.Address;
import lk.ijse.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        Customer customer = new Customer();
        Address address = new Address();
        customer.setId(1);
        customer.setName("Jack");

        address.setId(2);
        address.setStreet("ALone");
        address.setCity("Francisco_1");
        address.setCustomer(customer);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        /*session.save(customer);*/
        session.save(address);
        transaction.commit();
        session.close();
        }

}