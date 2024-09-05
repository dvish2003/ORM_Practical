package lk.ijse.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Address {
    @Id
    private int id;
    private String street;
    private String city;
    @OneToMany
    private Customer_entity customer;

    public Address(int id, String street, String city, Customer_entity customer) {
        this.id = id;
        this.street = street;
        this.city = city;
        this.customer = customer;
    }
    public Address() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Customer_entity getCustomer() {
        return customer;
    }

    public void setCustomer(Customer_entity customer) {
        this.customer = customer;
    }
}
