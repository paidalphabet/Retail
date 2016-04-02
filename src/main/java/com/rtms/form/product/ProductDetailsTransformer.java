package com.rtms.form.product;

import com.rtms.entity.product.Product;

public class ProductDetailsTransformer {

	public static ProductDetailsForm convertToProductDetails(final Product product) {
		final ProductDetailsForm form = new ProductDetailsForm();
		form.setProductID(product.getProductID());
		form.setProductName(product.getProductName());
		form.setProductDisplayName(product.getProductDisplayName());
		form.setThumbNail1(product.getThumbNail1());
		form.setThumbNail2(product.getThumbNail2());
		form.setActualImage(product.getActualImage());
		form.setProductCostPrice(product.getProductCostPrice());
		form.setProductSellingPrice(product.getProductSellingPrice());
		form.setMargin(product.getMargin());
		form.setCatalogID(product.getCatalogID());
		return form;
	}

	public static Product convertToProductDetails(final ProductDetailsForm form, Product product) {
		if(product == null){
			product = new Product();
		}
		product.setProductID(form.getProductID());
		product.setProductName(form.getProductName());
		product.setProductDisplayName(form.getProductDisplayName());
		product.setThumbNail1(form.getThumbNail1());
		product.setThumbNail2(form.getThumbNail2());
		product.setActualImage(form.getActualImage());
		product.setProductCostPrice(form.getProductCostPrice());
		product.setProductSellingPrice(form.getProductSellingPrice());
		product.setMargin(form.getMargin());
		product.setCatalogID(form.getCatalogID());
		return product;
	}
}
