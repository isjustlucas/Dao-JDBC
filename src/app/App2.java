package app;

import java.util.List;
import java.util.Scanner;

import models.dao.DaoFactory;
import models.dao.DepartmentDao;
import models.entities.Department;

public class App2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: department findById ===");
        Department department = departmentDao.findByID(3);
        if (department == null) {
            System.out.println("Department ID not found!");
        } else {
            System.out.println(department);
        }

        System.out.println("\n=== TEST 2: department findAll ===");
        List<Department> list = departmentDao.findAll();
        for (Department obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 3: department insert ===");
        Department newDepartment = new Department(null, "Music");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id = " + newDepartment.getId());

        System.out.println("\n=== TEST 4: department update ===");
        department = departmentDao.findByID(1);
        department.setName("Enterprise");
        departmentDao.update(department);
        System.out.println("Update completed!");

        System.out.println("\n=== TEST 5: department delete ===");
        System.out.print("Enter ID for delete test: ");
        int id = sc.nextInt();
        departmentDao.deleteByID(id);
        System.out.println(id + " | Id Deleted Successfully!");

        sc.close();
    }

}
