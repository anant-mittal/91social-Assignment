/**
 * 
 */
package com.benchire.priceengine.handlebar;

import java.util.Date;

/**
 * @author Apple
 *
 */
public class Randonneur implements HandleBar {
	
	private Date date =null;
	
	public Randonneur(Date onDate) {
		this.date = onDate;
	}

	/* (non-Javadoc)
	 * @see com.benchire.priceengine.handlebar.HandleBar#getPrice()
	 */
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

}
