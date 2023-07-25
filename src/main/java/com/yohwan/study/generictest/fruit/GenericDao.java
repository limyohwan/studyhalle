package com.yohwan.study.generictest.fruit;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericDao<E extends Entity2<K>, K> {

    private Class<E> entityClass;

//    public GenericDao(Class<E> entityClass) { // 실제로 생성자에 타입을 인자로 넣어 타입을 알 수 있지만 상속받은 구현체들마다 해당 생성자 로직을 구현해야하므로 번거로움
//        this.entityClass = entityClass;
//    }


    public GenericDao() {
        this.entityClass = (Class<E>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public Class<E> getEntityClass() {
        return entityClass;
    }

    private Map<K, E> datasource = new HashMap<>();

    public void save(E e) {
        datasource.put(e.getId(), e);
    }

    public void delete(E e) {
        datasource.remove(e.getId());
    }

    public void delete(K k) {
        datasource.remove(k);
    }

    public List<E> findAll() {
        return new ArrayList<>(datasource.values());
    }

    public E findById(K k) {
        return datasource.get(k);
    }
}
