package com.rtms.dao.product;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.rtms.entity.product.Product;
import com.rtms.spring.dao.AbstractDao;

@Repository("productDao")
@Transactional(propagation=Propagation.REQUIRED)
public class ProductDaoImpl extends AbstractDao implements ProductDao {

	@Override
	public List<Product> getProducts(final Integer startValue, final Integer rowCnt) {
		final String productQuery = "select p from Product p";
		final Session session = getSession();
		final Query query = session.createQuery(productQuery);
		query.setFetchSize(rowCnt.intValue());
		query.setFirstResult(startValue.intValue());
		return query.list();
	}

	@Override
	public long getProductCount() {
		final String productQuery = "select count(p) from Product p";
		final Session session = getSession();
		final Query query = session.createQuery(productQuery);
		Long cnt = (Long) query.uniqueResult();
		return cnt;
	}
	

}