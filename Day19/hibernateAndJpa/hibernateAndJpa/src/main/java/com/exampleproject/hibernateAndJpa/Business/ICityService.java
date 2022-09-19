package com.exampleproject.hibernateAndJpa.Business;

import com.exampleproject.hibernateAndJpa.Entities.City;
import java.util.List;

public interface ICityService {
    List<City> getAll();
    void add(City city);
    void update(City city);
    void delete(City city);
    City getById(int id);
}
