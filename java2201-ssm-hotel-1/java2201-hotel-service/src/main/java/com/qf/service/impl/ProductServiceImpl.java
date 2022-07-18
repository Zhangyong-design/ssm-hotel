package com.qf.service.impl;

import com.qf.dao.ProductDao;
import com.qf.pojo.Product;
import com.qf.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductDao productDao;

    public List<Product> findAll() {
        return productDao.findAll();
    }
}
