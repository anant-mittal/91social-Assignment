/**
 * 
 */
package com.priceengine.dao;

import java.util.Map;
import java.util.TreeMap;

import com.priceengine.enums.FrameType;


public class FrameDAO {

	private Map<Long, Double> frameOrdPrice;
	private Map<Long, Double> frameCantilverPrice;
	private Map<Long, Double> frameDiamondPrice;

	
	public FrameDAO() {
		setFramePrice();
	}

	private void setFramePrice() {
		frameOrdPrice = new TreeMap<>();
		frameOrdPrice.put(Long.valueOf(1578240385), 2000.00);
		frameOrdPrice.put(Long.valueOf(1586102785), 1500.00);

		frameCantilverPrice = new TreeMap<>();
		frameCantilverPrice.put(Long.valueOf(1578240385), 1000.00);
		frameCantilverPrice.put(Long.valueOf(1586102785), 2000.00);

		frameDiamondPrice = new TreeMap<>();
		frameDiamondPrice.put(Long.valueOf(1578240385), 1000.00);
		frameDiamondPrice.put(Long.valueOf(1586102785), 2000.00);

	}

	public Double getFramePrice(String part, Long date) {
		Double price = Double.valueOf(0);

		if (part.equalsIgnoreCase(FrameType.ORDINARY.toString())) {

			for (Map.Entry<Long, Double> entry : frameOrdPrice.entrySet()) {
				if (entry.getKey() > date)
					return price;
				price = entry.getValue();
			}
		} else if (part.equalsIgnoreCase(FrameType.CANTILEVER.toString())) {

			for (Map.Entry<Long, Double> entry : frameCantilverPrice.entrySet()) {
				if (entry.getKey() > date)
					return price;
				price = entry.getValue();
			}
		} else if (part.equalsIgnoreCase(FrameType.DIAMOND.toString())) {

			for (Map.Entry<Long, Double> entry : frameDiamondPrice.entrySet()) {
				if (entry.getKey() > date)
					return price;
				price = entry.getValue();
			}
		} 
		return price;
	}

}
