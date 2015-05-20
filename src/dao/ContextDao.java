package dao;


import entity.AbstractEntity;
import entity.Context;

import java.util.List;

public interface ContextDao {

    List<Context> select();

    boolean delete(int id);

    boolean insert(AbstractEntity entity);

    boolean update(AbstractEntity entity);

}
