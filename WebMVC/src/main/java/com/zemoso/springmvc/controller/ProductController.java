//package com.zemoso.springmvc.controller;
//
//import com.zemoso.springmvc.model.Product;
//import com.zemoso.springmvc.service.ProductService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import java.util.List;
//
//@Controller
//public class ProductController {
//    @Autowired
//    private ProductService productService;
//
//    @GetMapping("/products")
//    public String listProducts(Model model) {
//        List<Product> products = productService.getAllProducts();
//        model.addAttribute("products", products);
//        return "product-list";
//    }
//
//    // Other controller methods for creating, updating, and deleting products
//}
