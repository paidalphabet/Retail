package com.rtms.dao.product;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.rtms.spring.dao.AbstractDao;

@Repository("productDao")
@Transactional(propagation=Propagation.REQUIRED)
public class ProductDaoImpl extends AbstractDao implements ProductDao {
	

}