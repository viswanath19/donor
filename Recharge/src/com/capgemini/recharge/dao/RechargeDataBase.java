package com.capgemini.recharge.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;  
	
public class RechargeDataBase implements IRechargeInterface{  
	@Override
	public String displayRechargePlans(){
	String planname = null;
	int amount=0;
	String msg = null;
	StringBuilder sb=new StringBuilder();
	try{  
	//step1 load the driver class  
	Class.forName("oracle.jdbc.driver.OracleDriver");  
	  
	//step2 create  the connection object  
	Connection con=DriverManager.getConnection(  
	"jdbc:oracle:thin:@localhost:1521:xe","sharma","admin");  
	  
	//step3 create the statement object  
	Statement stmt=con.createStatement();  
	  
	//step4 execute query  
	ResultSet rs=stmt.executeQuery("select * from rechargeplans"); 
	if(rs!=null){
		while(rs.next()){
			planname=rs.getString(1);
			amount=rs.getInt(2);
			sb.append(planname+"      "+Integer.toString(amount)+"\n");
			//System.out.println(details);
			
		}
	}
	//step5 close the connection object  
	con.close();  
	  
	}catch(Exception e){ 
		msg=e.getMessage();
	}
	return sb.toString();
	  
	}

	@Override
	public int getAmount(String planname) {
		int amount=0;
		try{  
			//step1 load the driver class  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			  
			//step2 create  the connection object  
			Connection con1=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:xe","sharma","admin");  
			  
			//step3 create the statement object  
			Statement stmt=con1.createStatement();  
			  
			//step4 execute query  
			ResultSet rs=stmt.executeQuery("select amount from rechargeplans where planename='"+planname+"'"); 
			if(rs!=null){
				while(rs.next()){
					amount = rs.getInt(1);
					//System.out.println(details);
					
				}
			}
			//step5 close the connection object  
			con1.close();  
			  
			}catch(Exception e){ 
				String msg = e.getMessage();
			}
		return amount;
	}
}
