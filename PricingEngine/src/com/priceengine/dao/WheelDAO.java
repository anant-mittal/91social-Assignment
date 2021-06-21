/**
 * 
 */
package com.priceengine.dao;

import java.util.Map;
import java.util.TreeMap;

import com.priceengine.enums.Rim;
import com.priceengine.enums.Spoke;
import com.priceengine.enums.Tube;
import com.priceengine.enums.Tyre;

public class WheelDAO {

	private Map<Long, Double> rimSteelPrice;
	private Map<Long, Double> rimAlloyPrice;
	private Map<Long, Double> rimChromePrice;

	private Map<Long, Double> tangentSpokePrice;
	private Map<Long, Double> wheelSpokePrice;

	private Map<Long, Double> tubePrice;
	private Map<Long, Double> tubelessTubePrice;

	private Map<Long, Double> clincherTyrePrice;
	private Map<Long, Double> tubularTyrePrice;

	public WheelDAO() {
		setRimPrice();
		setSpokePrice();
		setTubePrice();
		setTyrePrice();
	}

	private void setTyrePrice() {
		clincherTyrePrice = new TreeMap<>();
		clincherTyrePrice.put(Long.valueOf(1578240385), 2000.00);
		clincherTyrePrice.put(Long.valueOf(1586102785), 1500.00);

		tubularTyrePrice = new TreeMap<>();
		tubularTyrePrice.put(Long.valueOf(1578240385), 1000.00);
		tubularTyrePrice.put(Long.valueOf(1586102785), 2000.00);

	}

	private void setTubePrice() {

		tubePrice = new TreeMap<>();
		tubePrice.put(Long.valueOf(1578240385), 2000.00);
		tubePrice.put(Long.valueOf(1586102785), 1500.00);

		tubelessTubePrice = new TreeMap<>();
		tubelessTubePrice.put(Long.valueOf(1578240385), 1000.00);
		tubelessTubePrice.put(Long.valueOf(1586102785), 2000.00);

	}

	private void setSpokePrice() {
		tangentSpokePrice = new TreeMap<>();
		tangentSpokePrice.put(Long.valueOf(1578240385), 2000.00);
		tangentSpokePrice.put(Long.valueOf(1586102785), 1500.00);

		wheelSpokePrice = new TreeMap<>();
		wheelSpokePrice.put(Long.valueOf(1578240385), 1000.00);
		wheelSpokePrice.put(Long.valueOf(1586102785), 2000.00);

	}

	private void setRimPrice() {

		rimSteelPrice = new TreeMap<>();
		rimSteelPrice.put(Long.valueOf(1578240385), 2000.00);
		rimSteelPrice.put(Long.valueOf(1586102785), 1500.00);

		rimAlloyPrice = new TreeMap<>();
		rimAlloyPrice.put(Long.valueOf(1578240385), 1000.00);
		rimAlloyPrice.put(Long.valueOf(1586102785), 2000.00);

		rimChromePrice = new TreeMap<>();
		rimChromePrice.put(Long.valueOf(1578240385), 3000.00);
		rimChromePrice.put(Long.valueOf(1586102785), 4000.00);

	}

	public Double getRimPrice(String part, Long date) {
		Double price = Double.valueOf(0);

		if (part.equalsIgnoreCase(Rim.ALLOY.toString())) {

			for (Map.Entry<Long, Double> entry : rimAlloyPrice.entrySet()) {
				if (entry.getKey() > date)
					return price;
				price = entry.getValue();
			}
		} else if (part.equalsIgnoreCase(Rim.CHROME.toString())) {

			for (Map.Entry<Long, Double> entry : rimChromePrice.entrySet()) {
				if (entry.getKey() > date)
					return price;
				price = entry.getValue();
			}
		} else if (part.equalsIgnoreCase(Rim.STEEL.toString())) {

			for (Map.Entry<Long, Double> entry : rimSteelPrice.entrySet()) {
				if (entry.getKey() > date)
					return price;
				price = entry.getValue();
			}
		}
		return price;
	}

	public Double getSpokePrice(String spoke, Long date) {
		Double price = Double.valueOf(0);
		if (spoke.equalsIgnoreCase(Spoke.TANGENT.toString())) {
			for (Map.Entry<Long, Double> entry : tangentSpokePrice.entrySet()) {
				if (entry.getKey() > date)
					return price;
				price = entry.getValue();
			}
		} else if (spoke.equalsIgnoreCase(Spoke.WHEEL.toString())) {
			for (Map.Entry<Long, Double> entry : wheelSpokePrice.entrySet()) {
				if (entry.getKey() > date)
					return price;
				price = entry.getValue();
			}

		}
		return price;
	}

	public Double getTubePrice(String parts, Long date) {
		Double price = Double.valueOf(0);
		if (parts.equalsIgnoreCase(Tube.TUBE.toString())) {
			for (Map.Entry<Long, Double> entry : tubePrice.entrySet()) {
				if (entry.getKey() > date)
					return price;
				price = entry.getValue();
			}
		} else if (parts.equalsIgnoreCase(Tube.TUBELESS.toString())) {
			for (Map.Entry<Long, Double> entry : tubelessTubePrice.entrySet()) {
				if (entry.getKey() > date)
					return price;
				price = entry.getValue();
			}

		}
		return price;
	}

	public Double getTyrePrice(String parts, Long date) {
		Double price = Double.valueOf(0);
		if (parts.equalsIgnoreCase(Tyre.CLINCHER.toString())) {
			for (Map.Entry<Long, Double> entry : clincherTyrePrice.entrySet()) {
				if (entry.getKey() > date)
					return price;
				price = entry.getValue();
			}
		} else if (parts.equalsIgnoreCase(Tyre.TUBULAR.toString())) {
			for (Map.Entry<Long, Double> entry : tubularTyrePrice.entrySet()) {
				if (entry.getKey() > date)
					return price;
				price = entry.getValue();
			}

		}
		return price;
	}

}
