package com.Spring.Product;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController 
{
	@PostMapping("/hello")
	public String saveProduct(@RequestBody Product p)
	{
		System.out.println(p);
		return"Product has been saved!!";
		
	}

}
