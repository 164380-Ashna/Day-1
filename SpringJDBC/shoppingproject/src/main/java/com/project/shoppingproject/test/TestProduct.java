package com.project.shoppingproject.test;

import java.util.List;  
  


import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  

import com.project.shoppingproject.dao.ProductDao;
import com.project.shoppingproject.pojo.Product;
public class TestProduct {  
public static void main(String[] args) {  
    ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");  
    ProductDao dao=(ProductDao)context.getBean("ProductDao"); 
    
    dao.add(new Product(159, "Pepsi", 50, "Beverage")); 
    dao.add(new Product(753, "Coke", 60, "Beverage"));
    dao.remove(321);
   dao.add(new Product(300, "Kya", 552, "Thanda"));
    dao.add(new Product(148, "Sprite", 50, "Beverage"));
    dao.getAll();
    dao.get(159);
   
    List<Product> list=dao.getAll();  
          
    for(Product product:list)  
        System.out.println(product);
}  
}  