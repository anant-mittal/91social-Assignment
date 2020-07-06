/**
 * 
 */
package com.benchire.priceengine.service;

import com.benchire.priceengine.dao.WheelDAO;
import com.benchire.priceengine.enums.Spoke;
import com.benchire.priceengine.model.Wheel;

/**
 * @author Apple
 *
 */
public class WheelService {

	private Long date = null;

	private Wheel wheel = null;

	private WheelDAO wheelDAO = null;

	public WheelService(Long date, Wheel wheel) {
		this.date = date;
		this.wheel = wheel;
		wheelDAO = new WheelDAO();
	}

	public double getPrice() {

		double spokePrice = wheelDAO.getSpokePrice(wheel.getSpoke(), date);
		System.out.println(" spoke price : " + spokePrice);

		double rimPrice = wheelDAO.getRimPrice(wheel.getRim(), date);
		System.out.println(" rim price : " + rimPrice);

		double tubePrice = wheelDAO.getTubePrice(wheel.getRim(), date);
		System.out.println(" tube price : " + tubePrice);

		double tyrePrice = wheelDAO.getTyrePrice(wheel.getRim(), date);
		System.out.println(" tyre price : " + tyrePrice);

		double totalPrice = spokePrice + rimPrice + tubePrice + tyrePrice;

		wheel.setPrice(totalPrice);

		return totalPrice;
	}

	public void calculatePrice() {

		double spokePrice = wheelDAO.getSpokePrice(wheel.getSpoke(), date);
		System.out.println(" spoke price : " + spokePrice);

		double rimPrice = wheelDAO.getRimPrice(wheel.getRim(), date);
		System.out.println(" rim price : " + rimPrice);

		double tubePrice = wheelDAO.getTubePrice(wheel.getRim(), date);
		System.out.println(" tube price : " + tubePrice);

		double tyrePrice = wheelDAO.getTyrePrice(wheel.getRim(), date);
		System.out.println(" tyre price : " + tyrePrice);

		double totalPrice = spokePrice + rimPrice + tubePrice + tyrePrice;

		wheel.setPrice(totalPrice);

	}

}
