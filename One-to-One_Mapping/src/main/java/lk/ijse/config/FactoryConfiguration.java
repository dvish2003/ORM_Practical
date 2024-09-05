package lk.ijse.config;

import lk.ijse.Entity.Address;
import lk.ijse.Entity.Customer_entity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfiguration {
    private static  FactoryConfiguration factoryConfiguration;

    private SessionFactory sessionFactory;


    private FactoryConfiguration() {
        Configuration configuration = new Configuration().configure()
                .addAnnotatedClass(Address.class)
        .addAnnotatedClass(Customer_entity.class);
        sessionFactory = configuration.buildSessionFactory();
    }

    public static FactoryConfiguration getInstance() {
        return (factoryConfiguration == null) ?
            factoryConfiguration = new FactoryConfiguration() : factoryConfiguration;

    }
    public Session getSession() {
        return sessionFactory.openSession();

}
}
