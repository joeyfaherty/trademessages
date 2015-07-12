package com.home.trademessages.trademessages.framework.model;

import java.util.Date;

public class Message {

private String userId;
	
	private String currencyFrom;
	
	private String currencyTo;
	
	private Double amountSell;
	
	private Double amountBuy;
	
	private long rate;
	
	private Date timePlaced;
	
	private String originatingCountry;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCurrencyFrom() {
		return currencyFrom;
	}

	public void setCurrencyFrom(String currencyFrom) {
		this.currencyFrom = currencyFrom;
	}

	public String getCurrencyTo() {
		return currencyTo;
	}

	public void setCurrencyTo(String currencyTo) {
		this.currencyTo = currencyTo;
	}

	public Double getAmountSell() {
		return amountSell;
	}

	public void setAmountSell(Double amountSell) {
		this.amountSell = amountSell;
	}

	public Double getAmountBuy() {
		return amountBuy;
	}

	public void setAmountBuy(Double amountBuy) {
		this.amountBuy = amountBuy;
	}

	public long getRate() {
		return rate;
	}

	public void setRate(long rate) {
		this.rate = rate;
	}

	public Date getTimePlaced() {
		return timePlaced;
	}

	public void setTimePlaced(Date timePlaced) {
		this.timePlaced = timePlaced;
	}

	public String getOriginatingCountry() {
		return originatingCountry;
	}

	public void setOriginatingCountry(String originatingCountry) {
		this.originatingCountry = originatingCountry;
	}
}
