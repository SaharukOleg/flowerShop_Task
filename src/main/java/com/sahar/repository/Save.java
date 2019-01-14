package com.sahar.repository;

import com.sahar.bouquets.Bouquet;
import com.sahar.entity.goods.Tulip;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Save extends EntityRepository {

    public int save(Bouquet bouquet) { // і якщо сюда передати Object object
        Session session = factory.openSession();
        Transaction tx = null;
        Integer userIdSaved = null;
        try {
            tx = session.beginTransaction();
            userIdSaved = (Integer) session.save(bouquet);
            tx.commit();
        } catch (HibernateException ex) {
            if (tx != null)
                tx.rollback();
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return userIdSaved;
    }
}
