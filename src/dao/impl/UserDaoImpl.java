package dao.impl;

import dao.UserDao;
import entity.Context;
import entity.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ���� on 20.05.2015.
 */
public class UserDaoImpl implements UserDao {

    private List<User> listUser;

    {
        listUser = new ArrayList<User>();
        listUser.add(new User(1, "admin"));
    }

    public List<User> select() {
        return listUser;
    }

    public boolean delete(int id) {
        return false;
    }

    public boolean insert(User entity) {
        //�������� �� ������ �����
        listUser.add(entity);
        return true;
    }

    public boolean update(User entity) {
        return false;
    }
}
