package com.ruthvika.reddy;

import java.util.Comparator;

public class Sort implements Comparator<chocolate>{
int opt;
Sort(int n){
	this.opt = n;
}
public int compare(chocolate ch1, chocolate ch2) {
	switch(opt)
	{
	case 1:return ch1.ct-ch2.ct;
	case 2:return ch1.wt-ch2.wt;
	case 3:return ch1.n-ch2.n;
	}
	return 0;
}
}
