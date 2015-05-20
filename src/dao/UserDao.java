package dao;

import entity.AbstractEntity;
import entity.Context;
import entity.User;

import java.util.List;

/**
 * Created by Макс on 20.05.2015.
 */
public interface UserDao {

    List<User> select();

    boolean delete(int id);

    boolean insert(User entity);

    boolean update(User entity);

}
