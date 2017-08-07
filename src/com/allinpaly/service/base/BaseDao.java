package com.allinpaly.service.base;

import java.io.Serializable;

/**
 * Created by prarui on 2017/7/17.
 */
public interface BaseDao<T> {
    public void save(T entity);

    public void update(T entity);

    public void delete(Serializable id);

    public T findById(Serializable id);


}
