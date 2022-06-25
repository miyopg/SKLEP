package pl.sda.project.shop.aplication;

import org.hibernate.SessionFactory;

public class ShopApp {
    public static void main(String[] args) {
        System.out.println("hello world");
        System.out.println("hello world2");
        SessionFactory sessionFactory = new HibernateFactory().getSessionFactory();

        sessionFactory.close();
    }
}
