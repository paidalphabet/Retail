package com.rtms.entity.user;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.rtms.entity.BaseObject;
import com.rtms.entity.order.Order;

/**
 * <b><author>Mahavir</author></b>
 *
 */
@Entity
@Table(name = "USER_SESSION")
public class UserSession extends BaseObject{

	@Id
	@Column(name = "SESSION_ID", length = 50)
	@SequenceGenerator(name="USER_SESSION_SEQ",sequenceName="USER_SESSION_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USER_SESSION_SEQ")
	private long sessionID;
	
	@Column(name="USER_ID", length=50)
	private String userID;
	
	@Column(name="SHOPPER_IP_ADDRESS", length=50)
	private String shopperIPAddress;
	
	@Column(name="IS_AUTHENTICATED", length=2)
	private String isAuthenticated;
	
	@OneToOne
	@JoinColumn(name ="ORDER_ID")
	private Order lastOrder;

	/**
	 * @return the sessionID
	 */
	public long getSessionID() {
		return sessionID;
	}

	/**
	 * @param sessionID the sessionID to set
	 */
	public void setSessionID(final long sessionID) {
		this.sessionID = sessionID;
	}

	/**
	 * @return the userID
	 */
	public String getUserID() {
		return userID;
	}

	/**
	 * @param userID the userID to set
	 */
	public void setUserID(final String userID) {
		this.userID = userID;
	}

	/**
	 * @return the shopperIPAddress
	 */
	public String getShopperIPAddress() {
		return shopperIPAddress;
	}

	/**
	 * @param shopperIPAddress the shopperIPAddress to set
	 */
	public void setShopperIPAddress(final String shopperIPAddress) {
		this.shopperIPAddress = shopperIPAddress;
	}

	/**
	 * @return the isAuthenticated
	 */
	public String getIsAuthenticated() {
		return isAuthenticated;
	}

	/**
	 * @param isAuthenticated the isAuthenticated to set
	 */
	public void setIsAuthenticated(String isAuthenticated) {
		this.isAuthenticated = isAuthenticated;
	}
}
