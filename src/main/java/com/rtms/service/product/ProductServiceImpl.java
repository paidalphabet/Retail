package com.rtms.service.product;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rtms.dao.product.ProductDao;
import com.rtms.entity.product.Product;
import com.rtms.form.product.ProductDetailsForm;
import com.rtms.form.product.ProductDetailsTransformer;

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

	@Override
	public List<ProductDetailsForm> getProducts(final Integer startValue, final Integer rowCnt) {
		final List<ProductDetailsForm> productList = new ArrayList<ProductDetailsForm>(rowCnt);
		final List<Product> products = productDao.getProducts(startValue,rowCnt);
		for(final Product product : products){
			final ProductDetailsForm productDetails = ProductDetailsTransformer.convertProductDetails(product);
			productList.add(productDetails);
		}
		return productList;
	}

	@Override
	public Long getProductCount() {
		long count = productDao.getProductCount();
		return count;
	}
}
