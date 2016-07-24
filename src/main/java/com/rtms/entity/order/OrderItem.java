package com.rtms.entity.order;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.rtms.entity.BaseObject;
import com.rtms.entity.product.Product;
import com.rtms.entity.state.State;

/**
 * Order Item Object that contains different types of order line items.
 */
@Entity
@Table(name = "ORDER_ITEM")
public class OrderItem extends BaseObject {

	@Id
	@Column(name = "ORDER_ITEM_ID", length = 50)
	@SequenceGenerator(name = "ORDER_ITEM_SEQ", sequenceName = "ORDER_ITEM_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ORDER_ITEM_SEQ")
	private long orderItemID;

	@ManyToOne
	@JoinColumn(name="ORDER_ID")
	private Order order;

	//@OneToOne
	//@JoinColumn(name="STATE_ID")
	private  State state;
	
	//@OneToOne
	//@JoinColumn(name="PRODUCT_ID")
	private Product product;

	@Column(name="QUANTITY", length=3)
	private int quantity;
	
	@Column(name = "AMOUNT", length=10)
	private String amount;
	
	@Column(name = "CURRENCY_CODE", length=10)
	private String currencyCode;

	/**
	 * @return the orderItemID
	 */
	public long getOrderItemID() {
		return orderItemID;
	}

	/**
	 * @param orderItemID the orderItemID to set
	 */
	public void setOrderItemID(long orderItemID) {
		this.orderItemID = orderItemID;
	}

	/**
	 * @return the order
	 */
	public Order getOrder() {
		return order;
	}

	/**
	 * @param order the order to set
	 */
	public void setOrder(Order order) {
		this.order = order;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the amount
	 */
	public String getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}

	/**
	 * @return the currencyCode
	 */
	public String getCurrencyCode() {
		return currencyCode;
	}

	/**
	 * @param currencyCode the currencyCode to set
	 */
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	/**
	 * @return the state
	 */
	public State getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(State state) {
		this.state = state;
	}

	/**
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * @param product the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}

}
