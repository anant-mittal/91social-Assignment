/**
 * 
 */
package com.benchire.priceengine.service;

import com.benchire.priceengine.dao.ChainAssemblyDAO;
import com.benchire.priceengine.model.ChainAssembly;

/**
 * @author Apple
 *
 */
public class ChainAssemblyService {

	private Long date = null;

	private ChainAssembly chainAssembly = null;

	private ChainAssemblyDAO chainAssemblyDAO = null;

	public ChainAssemblyService(Long date, ChainAssembly chainAssembly) {
		this.date = date;
		this.chainAssembly = chainAssembly;
		chainAssemblyDAO = new ChainAssemblyDAO();
	}

	public double getPrice() {
		return chainAssembly.getPrice();
	}

	public void calculatePrice() {
		double sizePrice = chainAssemblyDAO.getChainSizePrice(chainAssembly.getChainSize(), date);
		System.out.println(" chain size type price : " + sizePrice);

		double speedPrice = chainAssemblyDAO.getChainSpeedPrice(chainAssembly.getSpeed(), date);
		System.out.println(" chain type price : " + speedPrice);

		double totalPrice = sizePrice + speedPrice;
		chainAssembly.setPrice(totalPrice);
	}

}
