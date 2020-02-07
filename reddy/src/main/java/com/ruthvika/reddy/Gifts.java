package com.ruthvika.reddy;

import java.util.*;
public class Gifts {
String cname;
int tsweets, tchoco;
Gifts(String cname, int tsweets, int tchoco){
	this.cname = cname;
	this.tsweets = tsweets;
	this.tchoco = tchoco;
}
public static int Count(chocolate[] ch, int min, int max) {
	int c1=0;
	for(int i=0;i<ch.length;i++) {
		if(ch[i].ct>=min && ch[i].ct<=max) {
			c1+=ch[i].n;
		}
	}
	return c1;
}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter no.of children");
	int n = sc.nextInt();
	int tsweets, tchoco;
	Gifts[] g = new Gifts[n];
	Sweets[] s;
	chocolate[] choco;
	String cname;
	for(int i=0;i<n;i++) {
		System.out.println("Child Name:");
		cname = sc.next();
		System.out.println("No.of sweets:");
		tsweets = sc.nextInt();
		System.out.println("No.of chocolates");
		tchoco = sc.nextInt();
		s = new Sweets[tsweets];
		choco = new chocolate[tchoco];
		g[i] = new Gifts(cname, tsweets, tchoco);
		int c,w,tw=0;
		System.out.println("Cost and weight of sweets: ");
		for(int j=0;j<g[i].tsweets;j++) {
			c = sc.nextInt();
			w = sc.nextInt();
			s[j]=new Sweets(tsweets,c,w);
			tw += w*tsweets;
		}
		String type="";
		System.out.println("Cost,weight and type of choclates:");
		for(int j=0;j<g[i].tchoco;j++) {
			c = sc.nextInt();
			w = sc.nextInt();
			type = sc.next();
			choco[j]=new chocolate(tchoco,c,w,type);
			tw += w*tsweets;
		}
		System.out.println("Total weight of sweets and chocolates of "+g[i].cname+": "+tw);
		System.out.println("Sort the chocolates by one of the option\n1.Cost\n2.Weight\n3.No.of chocolates");
		int opt = sc.nextInt();
		Arrays.sort(choco, new Sort(opt));
		System.out.println("After sorting: ");
		for(int j=0;j<tchoco;j++) {
			System.out.println(choco[j]);
		}
		System.out.println("Cost range: ");
		int start = sc.nextInt();
		int end = sc.nextInt();
		System.out.println("No.of chocoaltes within the given range of price: "+Count(choco, start, end));
	}
}
}
