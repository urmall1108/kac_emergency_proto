package com.example.sh_house.kac_emergency;

public class DayInfo
{
	private String day;
	private String month;
	private boolean inMonth;
	

	public String getDay()
	{
		return day;
	}

	public String getmonth()
	{
		return month;
	}

	public void setmonth(String month)
	{
		this.month = month;
	}

	public void setDay(String day)
	{
		this.day = day;
	}


	public boolean isInMonth()
	{
		return inMonth;
	}


	public void setInMonth(boolean inMonth)
	{
		this.inMonth = inMonth;
	}

}