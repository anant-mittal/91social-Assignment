/**
 * In a cantilever bicycle frame the seat stays continue past the seat post and curve downwards to meet with the down tube
 */
package com.benchire.priceengine.frame;

import java.util.Date;

/**
 * @author Apple
 *
 */
public class Cantilever implements Frame {
	
	private Date date = null;
	
	public Cantilever(Date onDate) {
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
