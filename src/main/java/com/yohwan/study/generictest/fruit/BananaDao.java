package com.yohwan.study.generictest.fruit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BananaDao {
    private Map<Integer, Banana> datasource = new HashMap<>();

    public void save(Banana banana) {
        datasource.put(banana.getId(), banana);
    }

    public void delete(Banana banana) {
        datasource.remove(banana.getId());
    }

    public void delete(Integer id) {
        datasource.remove(id);
    }

    public List<Banana> findAll() {
        return new ArrayList<>(datasource.values());
    }

    public Banana findById(Integer id) {
        return datasource.get(id);
    }
}
