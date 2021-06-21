/**
 * 
 */
package com.priceengine.dao;

import java.util.Map;
import java.util.TreeMap;

import com.priceengine.enums.HandleType;


public class HandleDAO {

	private Map<Long, Double> handleOrdPrice;
	private Map<Long, Double> handleDropPrice;
	


	public HandleDAO() {
		setFramePrice();
	}

	private void setFramePrice() {
		handleOrdPrice = new TreeMap<>();
		handleOrdPrice.put(Long.valueOf(1578240385), 2222.00);
		handleOrdPrice.put(Long.valueOf(1586102785), 1111.00);

		handleDropPrice = new TreeMap<>();
		handleDropPrice.put(Long.valueOf(1578240385), 1000.00);
		handleDropPrice.put(Long.valueOf(1586102785), 2000.00);

	}

	public Double getHandlePrice(String part, Long date) {
		Double price = Double.valueOf(0);

		if (part.equalsIgnoreCase(HandleType.ORDINARY.toString())) {

			for (Map.Entry<Long, Double> entry : handleOrdPrice.entrySet()) {
				if (entry.getKey() > date)
					return price;
				price = entry.getValue();
			}
		} else if (part.equalsIgnoreCase(HandleType.DROP.toString())) {

			for (Map.Entry<Long, Double> entry : handleDropPrice.entrySet()) {
				if (entry.getKey() > date)
					return price;
				price = entry.getValue();
			}
		} 
		return price;
	}
	

}
