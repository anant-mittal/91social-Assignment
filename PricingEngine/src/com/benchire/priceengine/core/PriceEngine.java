/**
 * 
 */
package com.benchire.priceengine.core;

import java.util.Date;

import com.benchire.priceengine.frame.AbstractFrame;
import com.benchire.priceengine.frame.Diamond;
import com.benchire.priceengine.frame.Frame;

/**
 * @author Apple
 *
 */
public class PriceEngine extends AbstractFrame {
	
	
	
	public static void main(String[] args) {
		
		
		PriceEngine p = new PriceEngine();
		
		
		Date onDate = null;
		
		Frame frame = new Diamond(onDate);
		System.out.println(p.getPrice(frame));
		
		
	}

}
