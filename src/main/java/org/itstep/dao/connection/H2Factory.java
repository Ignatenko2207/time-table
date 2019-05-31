package org.itstep.dao.connection;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Component
public class H2Factory implements ConnectionFactory {

    public SessionFactory getSessionFactory() {
        try {
            Configuration configuration = new Configuration();

            Properties properties = new Properties();

            properties.setProperty("hibernate.connection.driverClassName", "org.h2.Driver");
            properties.setProperty("hibernate.connection.url", "jdbc:h2:~/timetable");
            properties.setProperty("hibernate.connection.username", "alex");
            properties.setProperty("hibernate.connection.password", "pass");
            properties.setProperty("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
            properties.setProperty("hibernate.hbm2ddl.auto", "update");
            properties.setProperty("hibernate.show_sql", "true");
            properties.setProperty("hibernate.format_sql", "true");

            configuration.addProperties(properties);


            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();

            return configuration.buildSessionFactory(serviceRegistry);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
