/**
 * 
 */
package com.benchire.priceengine.wheels;

import java.util.Date;

/**
 * @author Apple
 *
 */
public class Ordinary implements Wheel {
	
	private Date date = null;
	
	public  Ordinary(Date onDate) {
		// TODO Auto-generated method stub
		this.date = onDate;

	}

	/* (non-Javadoc)
	 * @see com.benchire.priceengine.wheels.Wheel#getPrice()
	 */
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

}
