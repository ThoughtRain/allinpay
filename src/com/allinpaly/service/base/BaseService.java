package com.allinpaly.service.base;

import java.util.List;

/**
 * Created by Administrator on 2017/7/31.
 */
public interface BaseService<T> {
    void saveData(T t);

    List getQueryData(T t);

    void deleteData();

    void upData(T t);


}
