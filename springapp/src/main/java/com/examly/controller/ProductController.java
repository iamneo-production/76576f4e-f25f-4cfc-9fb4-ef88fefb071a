package com.examly.springapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.model.ProductModel;
import com.examly.springapp.repository.ProductRepository;
import com.examly.springapp.service.ProductService;


@RestController
@RequestMapping
public class ProductController {
    @Autowired
	private ProductService productService;
	
	@PostMapping("/admin/addProduct")
	public ProductModel addProducts(@RequestBody ProductModel product){
		return productService.saveProduct(product);
	}
	
	@GetMapping("/admin/productEdit/{id}")
	public ProductModel getProductById(@PathVariable String id) {
		return productService.getProductById(id);
	}
	
	@GetMapping("/home")
	public List<ProductModel> findAllProductsHome() {
		return productService.getProducts();
	}

	@GetMapping("/admin")
    public List<ProductModel> findAllProductsAdmin(){
        return productService.getProducts();
    }
	
	@DeleteMapping("/admin/delete/{id}")
	public void deleteProductById(@PathVariable String id) {
		productService.deleteById(id);
	}
	
	@PutMapping("/admin/productEdit/{id}")
	public ProductModel productSaveEdit(@RequestBody ProductModel product,@PathVariable String id) {
		return productService.productSaveEdit(product,id);
	}
    
	@GetMapping("/home/getProduct/{id}")
	public ProductModel getParticularProduct(@PathVariable String id) {
		return productService.getProductById(id);
	}


}






