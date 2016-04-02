package com.rtms.service.product;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rtms.dao.product.ProductDao;

@Service("productService")
@Transactional
public class ProductServiceImpl implements ProductService{
	private static final Logger LOGGER  = Logger.getLogger(ProductServiceImpl.class.getName());

	@Autowired
	private ProductDao productDao;
}
