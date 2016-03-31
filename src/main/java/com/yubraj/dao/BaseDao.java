package com.yubraj.dao;

import java.util.List;

/**
 * Created by yubraj on 3/31/16.
 */
public interface BaseDao {
    public void persist(Object o);
    public <T> List<T> getAll(Class<T> tClass);
}
