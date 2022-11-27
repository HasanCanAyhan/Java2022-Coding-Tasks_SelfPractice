package task3.service;

import java.util.List;

public interface CrudService<T,ID> {

    T save(T obj) throws Exception;
    T findById(ID id);
    List<T> findAll();
    void deleteById(ID id);



}