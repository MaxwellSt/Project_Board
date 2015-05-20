package dao;

/**
 * Created by Alex on 14.05.2015.
 */
public interface FabricDao {

    boolean openConnection(ContextDao contextDao);

    boolean closeConnection(ContextDao contextDao);

    ContextDao dataSource(ContextDao contextDao);

}
