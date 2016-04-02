package com.rtms.service.product;

import com.rtms.entity.product.Product;

public interface ProductService {

	public Product getProduct(final Long productID);

	public Product saveProduct(final Product product);

}
