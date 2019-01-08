package com.sahar.repository;

import com.sahar.entity.Plant;
import com.sahar.entity.goods.Cactus;
import com.sahar.entity.goods.Palm;
import com.sahar.entity.goods.Tulip;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class EntityRepository {

    protected static SessionFactory factory;
    private static ServiceRegistry serviceRegistry;

    static {
        setupHibernate(); // при першому звертанні до EntityRepository то створює все
    }

    public static void setupHibernate() { //  настройки
        Configuration config = new Configuration();//  в цьому конфізі будуть зберігатись всі настройки для гібернейту !
        config.configure("hibernate.cfg.xml"); // з цього файлу записую дані в обєкт config
        config.addAnnotatedClass(Plant.class); // конфігу кажу щоб пройшовся по цих класах (в них є анотації)
        config.addAnnotatedClass(Tulip.class);
        config.addAnnotatedClass(Palm.class);
        config.addAnnotatedClass(Cactus.class);
        // config.addResource("User.hbm.xml");
        serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();// настройки (хз)
        factory = config.buildSessionFactory(serviceRegistry); // factory це обєкт який представляє базу даних
    }

}
