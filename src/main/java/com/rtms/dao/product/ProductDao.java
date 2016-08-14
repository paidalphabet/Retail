package com.rtms.dao.product;

import java.util.List;

import com.rtms.entity.product.Product;
import com.rtms.spring.dao.BaseDao;

public interface ProductDao extends BaseDao{

	public List<Product> getProducts(Integer startValue, Integer rowCnt);

	public long getProductCount();

}
