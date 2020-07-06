/**
 * Default
 */
package com.benchire.priceengine.frame;

import java.util.Date;

/**
 * @author Nijesh
 *
 */
public class Ordinary implements Frame {
	
	private Date date = null;
	
	public Ordinary(Date onDate) {
		this.date = onDate;
	}

	/* (non-Javadoc)
	 * @see com.benchire.priceengine.frame.Frame#getPrice()
	 */
	@Override
	public double getPrice() throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return 0;
	}

}
