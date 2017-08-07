package com.allinpaly.service.base;

/**
 * Created by prarui on 2017/7/17.
 */
public interface BaseDao<T> {
    public void save(T entity);

    public void update(T entity);

    public void delete(int id);

    public T findById(int id);


}
