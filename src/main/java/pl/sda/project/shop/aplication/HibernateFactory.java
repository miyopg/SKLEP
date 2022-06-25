package pl.sda.project.shop.aplication;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import pl.sda.project.shop.model.Oil;

public class HibernateFactory {
    private Configuration getHibernateConfig() {
        Configuration configuration = new Configuration();
        configuration.setProperty("hibernate.connection.url", "jdbc:postgres://cwqnkqsn:PdWTvI74W6fqE0__aBzRVXomLI8Y34Zg@tyke.db.elephantsql.com/cwqnkqsn");
        configuration.setProperty("hibernate.connection.username", "cwqnkqsn");
        configuration.setProperty("hibernate.connection.password", "PdWTvI74W6fqE0__aBzRVXomLI8Y34Zg");
        configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.HSQLDialect");
        configuration.setProperty("hibernate.connection.driver_class", "org.hsqldb.jdbc.JDBCDriver");
        configuration.setProperty("hibernate.hbm2ddl.auto", "update");
//		configuration.setProperty("hibernate.show_sql", "true");


        configuration.addAnnotatedClass(Oil.class);


        return configuration;
    }

    public SessionFactory getSessionFactory() {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .applySettings(getHibernateConfig().getProperties()).build();
        return getHibernateConfig().buildSessionFactory(registry);
    }
}
