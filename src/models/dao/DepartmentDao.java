package models.dao;

import java.util.List;

import models.entities.Department;

public interface DepartmentDao {
    
    void insert(Department obj);

    void update(Department obj);

    void deleteByID(Integer id);

    Department findByID(Integer id);

    List<Department> findAll();
}
