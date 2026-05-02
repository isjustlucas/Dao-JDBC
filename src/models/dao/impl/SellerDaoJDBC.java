package models.dao.impl;

import java.util.List;

import models.dao.SellerDao;
import models.entities.Seller;

public class SellerDaoJDBC implements SellerDao {

    @Override
    public void insert(Seller obj) {
        throw new UnsupportedOperationException("Unimplemented method 'insert'");
    }

    @Override
    public void update(Seller obj) {
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void deleteByID(Integer id) {
        throw new UnsupportedOperationException("Unimplemented method 'deleteByID'");
    }

    @Override
    public Seller findByID(Integer id) {
        throw new UnsupportedOperationException("Unimplemented method 'findByID'");
    }

    @Override
    public List<Seller> findAll() {
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

}
