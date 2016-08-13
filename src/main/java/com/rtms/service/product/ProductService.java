package com.rtms.service.product;

import java.util.List;

import com.rtms.entity.product.Product;
import com.rtms.form.product.ProductDetailsForm;

public interface ProductService {

	public Product getProduct(final Long productID);

	public Product saveProduct(final Product product);

	public List<ProductDetailsForm> getProducts(final Integer startValue, final Integer rowcnt);

	public Long getProductCount();

}
