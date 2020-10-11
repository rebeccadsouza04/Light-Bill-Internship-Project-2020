package com.example.electricity;

public class LightBill 
{

	  private String name;
	  private int billAmount;
	  private String date;
	  private int billNo;
	  
	  public LightBill()
	  {
		  
	  }
	  
	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getBillAmount()
	{
		return billAmount;
	}
	
	public void setBillAmount(int billAmount)
	{
		this.billAmount = billAmount;
	}
	public String getDate() 
	{
		return date;
	}
	public void setDate(String date) 
	{
		this.date = date;
	}
	public int getBillNo() 
	{
		return billNo;
	}
	
	public void setBillNo(int billNo) 
	{
		this.billNo = billNo;
	}
	  
	  
	 

}