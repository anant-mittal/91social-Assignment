/**
 * Historically, women's bicycle frames had a top tube that connected in the middle of the seat tube instead of the top, resulting in a lower standover height.
 */
package com.benchire.priceengine.frame;

import java.util.Date;

/**
 * @author Nijesh
 *
 */
public class StepThrough implements Frame {
	
	private Date date=null;
	
	public StepThrough(Date onDate) {
		this.date = onDate;
	}

	@Override
	public double getPrice() throws IllegalArgumentException {
		// TODO Auto-generated method stub
		return 0;
	}

}
