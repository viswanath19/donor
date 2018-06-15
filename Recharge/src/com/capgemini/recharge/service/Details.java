package com.capgemini.recharge.service;

import com.capgemini.recharge.dao.IRechargeInterface;
import com.capgemini.recharge.dao.RechargeDataBase;

public class Details implements IRechargingInterface{

	@Override
	public String displayRechargePlans() {
		IRechargeInterface ie=new RechargeDataBase();
		String details=ie.displayRechargePlans();
		return details;
	}

	@Override
	public int getAmount(String planname) {
		IRechargeInterface ie=new RechargeDataBase();
		int amount=ie.getAmount(planname);
	
		return amount;
	}

}
