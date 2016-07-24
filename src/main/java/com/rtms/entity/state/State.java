package com.rtms.entity.state;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import com.rtms.entity.BaseObject;

public class State extends BaseObject {
	
	@Column(name = "STATE_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stateID;
	
	@Column(name = "STATE_NAME", length=100)
	private String stateName;

	/**
	 * @return the stateID
	 */
	public int getStateID() {
		return stateID;
	}

	/**
	 * @param stateID the stateID to set
	 */
	public void setStateID(int stateID) {
		this.stateID = stateID;
	}

	/**
	 * @return the stateName
	 */
	public String getStateName() {
		return stateName;
	}

	/**
	 * @param stateName the stateName to set
	 */
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

}
