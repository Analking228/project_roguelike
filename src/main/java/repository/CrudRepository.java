package repository;

import java.sql.SQLException;
import java.util.List;

public interface    CrudRepository<T> {
    T               findByName(String name) throws SQLException;
    T               findById(int id) throws SQLException;
    List<T>         findAll() throws SQLException;
    void            save(T hero) throws SQLException;
    void            update(T hero) throws  SQLException;
    void            delete(T hero) throws SQLException;
}
