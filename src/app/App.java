package app;

import java.util.List;
import java.util.Scanner;

import models.dao.DaoFactory;
import models.dao.SellerDao;
import models.entities.Department;
import models.entities.Seller;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println("=== TEST 1: seller findById ===");
        Seller seller = sellerDao.findByID(3);
        if (seller == null) {
            System.out.println("Seller ID not found!");
        } else {
            System.out.println(seller);
        }
        System.out.println("\n === TEST 2: seller findByDepartmentId ===");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);
        for (Seller obj : list) {
            System.out.println(obj);
        }
        System.out.println("\n === TEST 3: seller findAll ===");
        list = sellerDao.findAll();
        for (Seller obj : list) {
            System.out.println(obj);
        }
        // System.out.println("\n === TEST 4: seller insert ===");
        // Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(0),
        // 4000.0, department);
        // sellerDao.insert(newSeller);
        // System.out.println("Inserted! New id = " + newSeller.getId());

        System.out.println("\n === TEST 5: seller update ===");
        seller = sellerDao.findByID(1);
        seller.setName("Marta Waine");
        seller.setEmail("martawaire@gmail.com");
        sellerDao.update(seller);
        System.out.println("Update completed! \n");

        System.out.println("\n === TEST 6: seller delete ===");
        System.out.print("Enter ID for delete test: ");
        int id = sc.nextInt();
        sellerDao.deleteByID(id);
        System.out.println(id + " | Id Deleted Sucessfuly! \n");

        sc.close();
    }
}
