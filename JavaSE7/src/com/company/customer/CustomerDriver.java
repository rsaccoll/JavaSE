package com.company.customer;



public class CustomerDriver 
{
	public static void main(String []args)
	{
		Customer customer;
		customer = new Customer();
		customer.setBalance(12506.45f);
		//customer.balance = new BigDecimal(12506.45f);
		System.out.println(customer.toString());
	}
}