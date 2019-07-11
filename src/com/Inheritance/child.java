package com.Inheritance;

import javaConcepts.superkeyword;

class parent
{
	int x,y;
	parent(int a,int b)
	{
		this.x=a;
		this.y=b;
		int sum=x+y;
		System.out.println("sum="+sum);
		
	}
	
}
public class child extends parent 
{
child(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

public static void main(String[] args) {
child c=new child(12, 85);	
}
}
