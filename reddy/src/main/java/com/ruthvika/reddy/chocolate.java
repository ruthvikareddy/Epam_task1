package com.ruthvika.reddy;

public class chocolate extends Sweets{
String type;
chocolate(int n, int ct, int wt, String type){
	super(n,ct,wt);
	this.type = type;
}
public String toString() {
	return "Cost: "+this.ct+" Weight: "+this.wt+" Total Number: "+this.n;
}
}
