package app;

import models.dao.DaoFactory;
import models.dao.SellerDao;
import models.entities.Seller;

public class App {
    public static void main(String[] args) throws Exception {
        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller = sellerDao.findByID(3);
        System.out.println(seller);
    }
}
