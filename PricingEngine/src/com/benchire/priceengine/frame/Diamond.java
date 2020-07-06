/**
 * 
 * In the diamond frame, the main "triangle" is not actually a triangle because it consists of four tubes: the head tube, top tube, down tube and seat tube. The rear triangle consists of the seat tube joined by paired chain stays and seat stays
 */
package com.benchire.priceengine.frame;

import java.util.Date;

/**
 * @author Nijesh
 *
 */
public class Diamond implements Frame {

	private Date date= null;
	
	public Diamond(Date onDate) {
		this.date = onDate;
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.benchire.priceengine.frame.Frame#getPrice()
	 */
	@Override
	public double getPrice() throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return 20;
	}

}
