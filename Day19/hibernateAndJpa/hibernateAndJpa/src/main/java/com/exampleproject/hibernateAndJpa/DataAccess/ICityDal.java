package com.exampleproject.hibernateAndJpa.DataAccess;

import com.exampleproject.hibernateAndJpa.Entities.City;
import java.util.List;

public interface ICityDal {
    List<City> getAll();
    void add(City city);
    void update(City city);
    void delete(City city);
    City getById(int id);
}
