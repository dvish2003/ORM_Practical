package lk.ijse;

import lk.ijse.Entity.Address;
import lk.ijse.Entity.Customer_entity;
import lk.ijse.config.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Customer_entity customerEntity = new Customer_entity();
        customerEntity.setCus_id(4);
        customerEntity.setCus_name("Customer_2");

        Address address = new Address();
        address.setId(5);
        address.setStreet("Street_2");
        address.setCity("City_2");
        address.setCustomer(customerEntity);


        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        session.save(customerEntity);
        session.save(address);
transaction.commit();
session.close();
        }

}