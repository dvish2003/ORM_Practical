package lk.ijse.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Customer_entity {
    @Id
    private int cus_id;
    private String cus_name;

    public Customer_entity(int cus_id, String cus_name) {
        this.cus_id = cus_id;
        this.cus_name = cus_name;
    }
    public Customer_entity() {}

    public int getCus_id() {
        return cus_id;
    }

    public void setCus_id(int cus_id) {
        this.cus_id = cus_id;
    }

    public String getCus_name() {
        return cus_name;
    }

    public void setCus_name(String cus_name) {
        this.cus_name = cus_name;
    }
}
