package dao.impl;

import dao.ContextDao;
import entity.AbstractEntity;
import entity.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 14.05.2015.
 */
public class ContextFileContextDaoImpl implements ContextDao {

    //connection IO/JSON

    private List<Context> listContext;

    {
        listContext = new ArrayList<Context>();
        listContext.add(new Context(23, "sdddd"));
        listContext.add(new Context(25, "wwwww"));
        listContext.add(new Context(30, "qqqqq"));
    }

    public List<Context> select() {
        return listContext;
    }

    public boolean delete(int id) {
        return false;
    }

    public boolean insert(AbstractEntity entity) {
        return false;
    }

    public boolean update(AbstractEntity entity) {
        return false;
    }
}
