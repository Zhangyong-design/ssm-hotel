package com.qf.controller;

import com.qf.pojo.Product;
import com.qf.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("product")
public class ProductController {

    @Autowired
    ProductService productService;

    //查询所有的产品信息
    @RequestMapping("findAll.do")
    public String findAll(Model model){
        List<Product> productList = productService.findAll();
        model.addAttribute("productList",productList);
        return "product-list";
    }
}
