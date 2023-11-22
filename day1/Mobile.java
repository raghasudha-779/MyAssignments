package week1.day1;

import sun.security.tools.keytool.Main;

public class Mobile {
public static void MakeCall() 
{
	String mobileModel = "iphone";
	float mobileWeight = 12f;
	}
public static void SendMsg()
{
	boolean isFullCharged = true;
	int mobileCost = 50000;	
	}
public static void main(String[] args) {
	Mobile myphone = new Mobile();
	myphone.MakeCall();
	myphone.SendMsg();
	System.out.println("This is my mobile");
}

}
