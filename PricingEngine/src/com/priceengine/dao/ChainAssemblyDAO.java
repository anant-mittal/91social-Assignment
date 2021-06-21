/**
 * 
 */
package com.priceengine.dao;

import java.util.Map;
import java.util.TreeMap;

public class ChainAssemblyDAO {

	private Map<Long, Double> chainSizeTenPrice;
	private Map<Long, Double> chainSizeEigntPrice;
	private Map<Long, Double> chainSizeSixPrice;

	private Map<Long, Double> chainSpeedTenPrice;
	private Map<Long, Double> chainSpeedEightPrice;
	private Map<Long, Double> chainSpeedSixPrice;

	public ChainAssemblyDAO() {
		setChainPrice();
	}

	private void setChainPrice() {
		chainSizeTenPrice = new TreeMap<>();
		chainSizeTenPrice.put(Long.valueOf(1578240385), 2222.00);
		chainSizeTenPrice.put(Long.valueOf(1586102785), 1111.00);

		chainSizeEigntPrice = new TreeMap<>();
		chainSizeEigntPrice.put(Long.valueOf(1578240385), 1000.00);
		chainSizeEigntPrice.put(Long.valueOf(1586102785), 2000.00);

		chainSizeSixPrice = new TreeMap<>();
		chainSizeSixPrice.put(Long.valueOf(1578240385), 1000.00);
		chainSizeSixPrice.put(Long.valueOf(1586102785), 2000.00);

		chainSpeedTenPrice = new TreeMap<>();
		chainSpeedTenPrice.put(Long.valueOf(1578240385), 1000.00);
		chainSpeedTenPrice.put(Long.valueOf(1586102785), 2000.00);

		chainSpeedEightPrice = new TreeMap<>();
		chainSpeedEightPrice.put(Long.valueOf(1578240385), 1000.00);
		chainSpeedEightPrice.put(Long.valueOf(1586102785), 2000.00);

		chainSpeedSixPrice = new TreeMap<>();
		chainSpeedSixPrice.put(Long.valueOf(1578240385), 100.00);
		chainSpeedSixPrice.put(Long.valueOf(1586102785), 200.00);
		chainSpeedSixPrice.put(Long.valueOf(1586132785), 250.00);

	}

	public Double getChainSizePrice(int part, Long date) {
		Double price = Double.valueOf(0);

		if (part == 10) {

			for (Map.Entry<Long, Double> entry : chainSizeTenPrice.entrySet()) {
				if (entry.getKey() > date)
					return price;
				price = entry.getValue();
			}
		} else if (part == 8) {

			for (Map.Entry<Long, Double> entry : chainSizeEigntPrice.entrySet()) {
				if (entry.getKey() > date)
					return price;
				price = entry.getValue();
			}
		} else if (6 == part) {

			for (Map.Entry<Long, Double> entry : chainSizeSixPrice.entrySet()) {
				if (entry.getKey() > date)
					return price;
				price = entry.getValue();
			}
		}
		return price;
	}

	public Double getChainSpeedPrice(int part, Long date) {
		Double price = Double.valueOf(0);

		if (part == 10) {

			for (Map.Entry<Long, Double> entry : chainSpeedTenPrice.entrySet()) {
				if (entry.getKey() > date)
					return price;
				price = entry.getValue();
			}
		} else if (part == 8) {

			for (Map.Entry<Long, Double> entry : chainSpeedEightPrice.entrySet()) {
				if (entry.getKey() > date)
					return price;
				price = entry.getValue();
			}
		} else if (part == 6) {

			for (Map.Entry<Long, Double> entry : chainSpeedSixPrice.entrySet()) {
				if (entry.getKey() > date)
					return price;
				price = entry.getValue();
			}
		}
		return price;
	}

}
