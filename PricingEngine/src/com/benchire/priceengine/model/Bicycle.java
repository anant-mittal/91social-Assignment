/**
 * 
 */
package com.benchire.priceengine.model;

/**
 * @author Apple
 *
 */
public class Bicycle {
	
	private int order;
	
	private String date;

	private Frame frame;

	private Handle handle;

	private Seat seat;

	private Wheel wheel;
	
	private Double price;

	private ChainAssembly chainAssembly;

	public Frame getFrame() {
		return frame;
	}

	public void setFrame(Frame frame) {
		this.frame = frame;
	}

	public Handle getHandle() {
		return handle;
	}

	public void setHandle(Handle handle) {
		this.handle = handle;
	}



	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}

  



	public ChainAssembly getChainAssembly() {
		return chainAssembly;
	}

	public void setChainAssembly(ChainAssembly chainAssembly) {
		this.chainAssembly = chainAssembly;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public Double getPrice() {
		
		Double totalPrice = Double.valueOf(0);
		
		if(null!=this.wheel) {
			totalPrice = totalPrice + wheel.getPrice();
		}
		if(null!=this.frame) {
			totalPrice = totalPrice + frame.getPrice();
		}
		if(null!=this.handle) {
			totalPrice = totalPrice + handle.getPrice();
		}
		if(null!=this.seat) {
			totalPrice = totalPrice + seat.getPrice();
		}
		if(null!=this.chainAssembly) {
			totalPrice = totalPrice + chainAssembly.getPrice();
		}
		return totalPrice;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	

}
