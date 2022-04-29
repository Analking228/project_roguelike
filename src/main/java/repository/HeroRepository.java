package repository;

import Model.HeroClasses.HeroClass;

import java.sql.SQLException;
import java.util.List;

public class HeroRepository implements CrudRepository<HeroClass> {
    @Override
    public HeroClass findByName(String name) throws SQLException {
        return null;
    }

    @Override
    public HeroClass findById(int id) throws SQLException {
        return null;
    }

    @Override
    public List<HeroClass> findAll() throws SQLException {
        return null;
    }

    @Override
    public void save(HeroClass hero) throws SQLException {

    }

    @Override
    public void update(HeroClass hero) throws SQLException {

    }

    @Override
    public void delete(HeroClass hero) throws SQLException {

    }
}
