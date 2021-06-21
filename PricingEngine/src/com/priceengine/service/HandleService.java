/**
 * 
 */
package com.priceengine.service;

import com.priceengine.dao.HandleDAO;
import com.priceengine.model.Handle;

public class HandleService {

	private Long date = null;

	private Handle handle = null;

	private HandleDAO handleDAO = null;

	public HandleService(Long date, Handle handle) {
		this.date = date;
		this.handle = handle;
		handleDAO = new HandleDAO();
	}

	public double getPrice() {
		return handle.getPrice();
	}

	public void calculatePrice() {
		double spokePrice = handleDAO.getHandlePrice(handle.getType(), date);
		double totalPrice = spokePrice;
		handle.setPrice(totalPrice);
	}

}
