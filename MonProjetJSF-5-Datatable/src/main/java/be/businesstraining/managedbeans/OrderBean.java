package be.businesstraining.managedbeans;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import be.businesstraining.domain.Product;

@ManagedBean
@SessionScoped
public class OrderBean {
	
	private List<Product> products;
	
	@PostConstruct
	public void init(){
		products = new ArrayList<Product>(Arrays.asList(
				new Product("A0001", "Intel CPU",new BigDecimal("700.00"), 1),
				new Product("A0002", "Harddisk 10TB",new BigDecimal("500.00"), 2),
				new Product("A0003", "Dell Laptop",	new BigDecimal("11600.00"), 8),
				new Product("A0004", "Samsung LCD",	new BigDecimal("5200.00"), 3),
				new Product("A0005", "A4Tech Mouse",new BigDecimal("100.00"), 10)
				));		
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
