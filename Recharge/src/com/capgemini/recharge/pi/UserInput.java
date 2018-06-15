package com.capgemini.recharge.pi;

import java.util.Scanner;

import com.capgemini.recharge.bean.RechargeBean;
import com.capgemini.recharge.dao.IRechargeInterface;
import com.capgemini.recharge.dao.RechargeDataBase;
import com.capgemini.recharge.service.Details;
import com.capgemini.recharge.service.IRechargingInterface;

public class UserInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.next();
		System.out.println("Enter the mobile number");
		long mobile=sc.nextLong();
		RechargeBean rb=new RechargeBean();
		rb.setName(name);
		rb.setMobileno(mobile);
		IRechargingInterface ie=new Details();
		String details=ie.displayRechargePlans();
		System.out.println(details);
		System.out.println("Enter the plan Name From above Plans");
		String planname=sc.next();
		rb.setPlanname(planname);
		int money=ie.getAmount(planname);
		System.out.println(money);
		rb.setAmount(money);
		rb.setStatus("success");
		
		
		
		
		
	}

}
