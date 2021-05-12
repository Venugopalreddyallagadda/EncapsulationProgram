package com.ojas.mar9;

public class CheckAccCust {

	public static void main(String[] args) {
		Account ac = new Account();
		Customer c  = new Customer("venu","gopal");
		
		ac.accountNo =1344;
		ac.interestRate=2.6f;
		ac.deposit(5000);
		ac.withDraw(3000);		
		
		System.out.println(c);
		System.out.println(ac);
		

	}

}
