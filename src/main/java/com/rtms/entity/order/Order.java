package com.rtms.entity.order;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.rtms.entity.BaseObject;
import com.rtms.entity.state.State;

/**
 * Order Object that contains different types of order line items.
 */
@Entity
@Table(name = "ORDER")
public class Order extends BaseObject {

	@Id
	@Column(name = "ORDER_ID", length = 50)
	@SequenceGenerator(name = "ORDER_SEQ", sequenceName = "ORDER_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ORDER_SEQ")
	private long orderID;
	
	//@OneToMany(fetch = FetchType.LAZY, mappedBy = "order")
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ORDER_ID")	
	private Set<OrderItem> orderLineItems;
	
	@Column(name = "AMOUNT", length=10)
	private String amount;
	
	@Column(name = "CURRENCY_CODE", length=10)
	private String currencyCode;
	
	//@OneToOne
//	@JoinColumn(name="STATE_ID")//, insertable=false, updatable=false, nullable=false)
	private State orderState;

	/**
	 * @return the orderID
	 */
	public long getOrderID() {
		return orderID;
	}

	/**
	 * @param orderID the orderID to set
	 */
	public void setOrderID(long orderID) {
		this.orderID = orderID;
	}

	/**
	 * @return the orderLineItems
	 */
	public Set<OrderItem> getOrderLineItems() {
		return orderLineItems;
	}

	/**
	 * @param orderLineItems the orderLineItems to set
	 */
	public void setOrderLineItems(Set<OrderItem> orderLineItems) {
		this.orderLineItems = orderLineItems;
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
	 * @return the orderState
	 */
	public State getOrderState() {
		return orderState;
	}

	/**
	 * @param orderState the orderState to set
	 */
	public void setOrderState(State orderState) {
		this.orderState = orderState;
	}
}
