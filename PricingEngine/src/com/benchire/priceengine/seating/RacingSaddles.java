/**
 * 
 */
package com.benchire.priceengine.seating;

import java.util.Date;

/**
 * @author Apple
 *
 */
public class RacingSaddles implements Seating {
	
	private Date date = null;
	
	public RacingSaddles(Date onDate) {
		this.date = onDate;
	}

	/* (non-Javadoc)
	 * @see com.benchire.priceengine.seating.Seating#getPrice()
	 */
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

}
