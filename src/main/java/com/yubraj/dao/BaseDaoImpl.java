package com.yubraj.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by yubraj on 3/31/16.
 */

@Repository
@Transactional
public class BaseDaoImpl implements BaseDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void persist(Object o) {
        em.persist(o);
    }

    @Override
    public <T> List<T> getAll(Class<T> tClass) {
        TypedQuery<T> query = em.createQuery(" from "+tClass.getName(), tClass);
        return query.getResultList();
    }
}
