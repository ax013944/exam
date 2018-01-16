package edu.fju.exam;

public class Director extends Employee {
	int bouns;
	public Director(String name,int money, int bouns){
		super(name,money);
		this.bouns =bouns;
		
	}
	@Override
	public void print() {
		if(money==50000){
			money=money+5000;
			System.out.println(name+"\t"+money+"\t"+"3000");	
		}else{
			money=money+5000;
			System.out.println(name+"\t"+money+"\t"+"9000");
		}
		}
	}	
	
