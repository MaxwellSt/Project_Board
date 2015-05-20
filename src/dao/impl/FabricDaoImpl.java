package dao.impl;

import dao.ContextDao;
import dao.FabricDao;

/**
 * Created by Alex on 14.05.2015.
 */
public class FabricDaoImpl implements FabricDao {
    //private BoardFileEntityDaoImpl boardFileEntityDao;
    //private BoardJsonEntityDaoImpl boardJsonEntityDao;
    private ContextFileContextDaoImpl contextFileEntityDao;
    private ContextJsonContextDaoImpl contextJsonEntityDao;
    //private UserFileEntityDaoImpl userFileEntityDao;
    //private UserJsonEntityDaoImpl userJsonEntityDao;



    public boolean openConnection(ContextDao contextDao) {
        return false;
    }


    public boolean closeConnection(ContextDao contextDao) {
        return false;
    }


    public ContextDao dataSource(ContextDao contextDao) {
        return contextDao;
    }
}
