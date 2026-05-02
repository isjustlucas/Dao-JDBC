package app;

import models.dao.DaoFactory;
import models.dao.SellerDao;
import models.entities.Seller;

public class App {
    public static void main(String[] args) throws Exception {
        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println("=== TEST 1: seller findById ===");
        Seller seller = sellerDao.findByID(10);
        if (seller == null) {
            System.out.println("Seller ID not found!");
        } else {
            System.out.println(seller);
        }

    }
}
