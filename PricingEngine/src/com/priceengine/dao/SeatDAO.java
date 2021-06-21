/**
 * 
 */
package com.priceengine.dao;

import java.util.Map;
import java.util.TreeMap;

import com.priceengine.enums.SeatType;


public class SeatDAO {

	private Map<Long, Double> seatComfPrice;
	private Map<Long, Double> seatOrdPrice;
	private Map<Long, Double> seatRacingPrice;

	public SeatDAO() {
		setSeatPrice();
	}

	private void setSeatPrice() {
		seatComfPrice = new TreeMap<>();
		seatComfPrice.put(Long.valueOf(1578240385), 2000.00);
		seatComfPrice.put(Long.valueOf(1586102785), 1500.00);

		seatOrdPrice = new TreeMap<>();
		seatOrdPrice.put(Long.valueOf(1578240385), 1000.00);
		seatOrdPrice.put(Long.valueOf(1586102785), 2000.00);

		seatRacingPrice = new TreeMap<>();
		seatRacingPrice.put(Long.valueOf(1578240385), 1000.00);
		seatRacingPrice.put(Long.valueOf(1586102785), 2000.00);

	}

	public Double getSeatPrice(String part, Long date) {
		Double price = Double.valueOf(0);

		if (part.equalsIgnoreCase(SeatType.ORDINARY.toString())) {

			for (Map.Entry<Long, Double> entry : seatComfPrice.entrySet()) {
				if (entry.getKey() > date)
					return price;
				price = entry.getValue();
			}
		} else if (part.equalsIgnoreCase(SeatType.COMFORT.toString())) {

			for (Map.Entry<Long, Double> entry : seatOrdPrice.entrySet()) {
				if (entry.getKey() > date)
					return price;
				price = entry.getValue();
			}
		} else if (part.equalsIgnoreCase(SeatType.RACING.toString())) {

			for (Map.Entry<Long, Double> entry : seatRacingPrice.entrySet()) {
				if (entry.getKey() > date)
					return price;
				price = entry.getValue();
			}
		}
		return price;
	}

}
