package com.rtms.service.product;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rtms.dao.product.ProductDao;
import com.rtms.entity.product.Product;

@Service("productService")
@Transactional
public class ProductServiceImpl implements ProductService{
	private static final Logger LOGGER  = Logger.getLogger(ProductServiceImpl.class.getName());

	@Autowired
	private ProductDao productDao;

	public Product getProduct(final Long productID) {
		return (Product) productDao.getObjectByID(Product.class, productID.longValue());
	}

	public Product saveProduct(final Product product) {
		productDao.updateBusinessObject(product);
		return product;
		
	}
}
