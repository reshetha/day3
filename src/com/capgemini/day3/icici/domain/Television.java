package com.capgemini.day3.icici.domain;

public class Television 
{
private int volume;
private int Channel;
private int currentChannel;
private int currentVolume;
boolean state;
public Television() {}
public Television(int volume,int chanel,boolean state)
{
	this.volume=volume;
	this.Channel=Channel;
	this.state=state;
}	
public int increaseVolume()
{
volume=volume++;
return volume;
}
public Object decreaseVolume() 
{
	volume=volume--;
	return volume;
}
public Object changeChannel(int channelNo) 
{
	
	return channelNo;
}
public static Object checkPower(boolean powerbutton)
{
	if(powerbutton==true)
	{
		return"on";
		
	}
	else
	{
		return "off";
	}

}
public Object currentVolume() 
{
return volume;
}
public boolean stateTest() {
	// TODO Auto-generated method stub
	state=!state;
		return state;
}

	
}

	