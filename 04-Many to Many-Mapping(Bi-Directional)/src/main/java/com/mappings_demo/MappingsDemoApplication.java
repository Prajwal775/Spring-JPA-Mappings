package com.mappings_demo;

//import com.mappings_demo.service.AppService;
import com.mappings_demo.entity.Category;
import com.mappings_demo.entity.Product;
import com.mappings_demo.repository.CategoryRepository;
import com.mappings_demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class MappingsDemoApplication implements CommandLineRunner {

	@Autowired
	CategoryRepository categoryRepository;
	@Autowired
	ProductRepository productRepository;


	public static void main(String[] args) {
		SpringApplication.run(MappingsDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Product p1=new Product("iphone 14 pro","12");
		Product p2=new Product("samsung s22 ultra","13");
		Product p3=new Product("samsung led","14");
		Product p4=new Product("moto g54","15");
		Product p5=new Product("Lg Refrigerator","17");


		Category c1=new Category("101","Electronics");
		Category c2=new Category("201","Mobile Phones");

		List<Product> category1products= c1.getProductList();
		category1products.add(p1);
		category1products.add(p2);
		category1products.add(p3);
		category1products.add(p4);
		category1products.add(p5);

		List<Product> category2products= c2.getProductList();
		category2products.add(p1);
		category2products.add(p2);
		category2products.add(p4);



		categoryRepository.save(c1);
		categoryRepository.save(c2);
	}
}
