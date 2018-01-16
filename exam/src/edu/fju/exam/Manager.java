package edu.fju.exam;

public class Manager extends Employee {
public Manager(String name,int money){
	super(name,money);

}
@Override
	public void print() {
		money=money+5000;
	System.out.println(name+ "\t" +money);	
	}
	}


