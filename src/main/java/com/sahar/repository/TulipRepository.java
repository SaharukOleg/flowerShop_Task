package com.sahar.repository;

import com.sahar.entity.goods.Tulip;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class TulipRepository extends EntityRepository {


    public int insertTulip(Tulip tulip) {
        Session session = factory.openSession();
        Transaction tx = null;
        Integer userIdSaved = null;
        try {
            tx = session.beginTransaction();

            userIdSaved = (Integer) session.save(tulip);
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

    public Tulip getTulip(int id) {
        Session session = factory.openSession();
        Transaction tx = null;
        Tulip tulip2 = null;
        try {
            tx = session.beginTransaction();

            tulip2 = (Tulip) session.get(Tulip.class, 3);
            tx.commit();
        } catch (HibernateException ex) {
            if (tx != null)
                tx.rollback();
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return tulip2;
    }


    public Tulip updateTulip(int id) {
        Session session = factory.openSession();
        Transaction tx = null;
        Tulip tulip2 = null;
        try {
            tx = session.beginTransaction();

            tulip2 = (Tulip) session.get(Tulip.class, 3);
            tulip2.setName("СУПЕР ПІОНОВИДНИЙ ");
            session.update(tulip2);

            tx.commit();
        } catch (HibernateException ex) {
            if (tx != null)
                tx.rollback();
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return tulip2;
    }


    public Tulip deleteTulip(int id) {
        Session session = factory.openSession();
        Transaction tx = null;
        Tulip tulip2 = null;
        try {
            tx = session.beginTransaction();

            tulip2 = (Tulip) session.get(Tulip.class, 3);
            session.delete(tulip2);

            tx.commit();
        } catch (HibernateException ex) {
            if (tx != null)
                tx.rollback();
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return tulip2;
    }

}
