package com.rtms.entity.product;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import javax.validation.constraints.Size;

import com.rtms.entity.BaseObject;

@Entity
@Table(name = "PRODUCT")
public class Product extends BaseObject {

	@Id
	@Column(name = "PRODUCT_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long productID;

	@Size(min = 3, max = 500)
	@Column(name = "PRODUCT_NAME", nullable = false)
	private String productName;

	@Size(min = 3, max = 500)
	@Column(name = "PRODUCT_DISPLAY_NAME", nullable = false)
	private String productDisplayName;

	@Size(min = 3, max = 500)
	@Column(name = "THUMBNAIL_1", nullable = true)
	private String thumbNail1;

	@Size(min = 3, max = 500)
	@Column(name = "THUMBNAIL_2")
	private String thumbNail2;

	@Size(min = 3, max = 500)
	@Column(name = "ACTUAL_IMAGE")
	private String actualImage;

	@Size(min = 3, max = 50)
	@Column(name = "PRODUCT_COST_PRICE")
	private String productCostPrice;

	@Size(min = 3, max = 50)
	@Column(name = "PRODUCT_SELLING_PRICE")	
	private String productSellingPrice;

	@Size(min = 3, max = 500)
	@Column(name = "MARGIN")
	private String margin;

	@Size(min = 3, max = 500)
	@Column(name = "CATALOG_ID")
	private String catalogID;

	/**
	 * @return the productID
	 */
	public long getProductID() {
		return productID;
	}

	/**
	 * @param productID the productID to set
	 */
	public void setProductID(long productID) {
		this.productID = productID;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName the productName to set
	 */
	public void setProductName(final String productName) {
		this.productName = productName;
	}

	/**
	 * @return the productDisplayName
	 */
	public String getProductDisplayName() {
		return productDisplayName;
	}

	/**
	 * @param productDisplayName the productDisplayName to set
	 */
	public void setProductDisplayName(final String productDisplayName) {
		this.productDisplayName = productDisplayName;
	}

	/**
	 * @return the thumbNail1
	 */
	public String getThumbNail1() {
		return thumbNail1;
	}

	/**
	 * @param thumbNail1 the thumbNail1 to set
	 */
	public void setThumbNail1(final String thumbNail1) {
		this.thumbNail1 = thumbNail1;
	}

	/**
	 * @return the thumbNail2
	 */
	public String getThumbNail2() {
		return thumbNail2;
	}

	/**
	 * @param thumbNail2 the thumbNail2 to set
	 */
	public void setThumbNail2(final String thumbNail2) {
		this.thumbNail2 = thumbNail2;
	}

	/**
	 * @return the actualImage
	 */
	public String getActualImage() {
		return actualImage;
	}

	/**
	 * @param actualImage the actualImage to set
	 */
	public void setActualImage(final String actualImage) {
		this.actualImage = actualImage;
	}

	/**
	 * @return the productCostPrice
	 */
	public String getProductCostPrice() {
		return productCostPrice;
	}

	/**
	 * @param productCostPrice the productCostPrice to set
	 */
	public void setProductCostPrice(final String productCostPrice) {
		this.productCostPrice = productCostPrice;
	}

	/**
	 * @return the productSellingPrice
	 */
	public String getProductSellingPrice() {
		return productSellingPrice;
	}

	/**
	 * @param productSellingPrice the productSellingPrice to set
	 */
	public void setProductSellingPrice(final String productSellingPrice) {
		this.productSellingPrice = productSellingPrice;
	}

	/**
	 * @return the margin
	 */
	public String getMargin() {
		return margin;
	}

	/**
	 * @param margin the margin to set
	 */
	public void setMargin(final String margin) {
		this.margin = margin;
	}

	/**
	 * @return the catalogID
	 */
	public String getCatalogID() {
		return catalogID;
	}

	/**
	 * @param catalogID the catalogID to set
	 */
	public void setCatalogID(final String catalogID) {
		this.catalogID = catalogID;
	}
}
