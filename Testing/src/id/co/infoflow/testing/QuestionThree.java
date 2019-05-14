package id.co.infoflow.testing;

import id.co.infoflow.model.Affiliate;
import id.co.infoflow.model.Customer;
import id.co.infoflow.model.Employee;
import id.co.infoflow.model.Shopping;

public class QuestionThree {
	
	public static void testCaseEmployeeBuyGroceriesTotal1000(){
		Customer customer = new Employee();
		Shopping shopping = new Shopping(customer, "groceries", 1000);
		System.out.println("Total must be pay test testCaseEmployeeBuyGroceriesTotal1000 : " + shopping.getTotalPay());
	}
	
	public static void testCaseEmployeeBuyNotGroceriesTotal1000(){
		Customer customer = new Employee();
		Shopping shopping = new Shopping(customer, "", 1000);
		System.out.println("Total must be pay testCaseEmployeeBuyNotGroceriesTotal1000 : " + shopping.getTotalPay());
	}
	
	public static void testCaseAffiliateBuyGroceriesTotal1000(){
		Customer customer = new Affiliate();
		Shopping shopping = new Shopping(customer, "groceries", 1000);
		System.out.println("Total must be pay testCaseAffiliateBuyGroceriesTotal1000 : " + shopping.getTotalPay());
	}
	
	public static void testCaseAffiliateBuyNotGroceriesTotal1000(){
		Customer customer = new Affiliate();
		Shopping shopping = new Shopping(customer, "", 1000);
		System.out.println("Total must be pay testCaseAffiliateBuyNotGroceriesTotal1000 : " + shopping.getTotalPay());
	}
	
	public static void testCaseCustomerBuyGroceriesTotal1000(){
		Customer customer = new Customer();
		Shopping shopping = new Shopping(customer, "groceries", 1000);
		System.out.println("Total must be pay testCaseCustomerBuyGroceriesTotal1000 : " + shopping.getTotalPay());
	}
	
	public static void testCaseCustomerBuyNotGroceriesOver2YearTotal1000(){
		Customer customer = new Customer();
		customer.setYear(3);
		Shopping shopping = new Shopping(customer, "", 1000);
		System.out.println("Total must be pay testCaseCustomerBuyNotGroceriesOver2YearTotal1000 : " + shopping.getTotalPay());
	}
	
	public static void testCaseCustomerBuyNotGroceriesTotal1000(){
		Customer customer = new Customer();
		customer.setYear(3);
		Shopping shopping = new Shopping(customer, "", 1000);
		System.out.println("Total must be pay testCaseCustomerBuyNotGroceriesTotal1000 : " + shopping.getTotalPay());
	}
	
	public static void main(String[] args) {
		testCaseEmployeeBuyGroceriesTotal1000();
		testCaseEmployeeBuyNotGroceriesTotal1000();
		testCaseAffiliateBuyGroceriesTotal1000();
		testCaseAffiliateBuyNotGroceriesTotal1000();
		testCaseCustomerBuyGroceriesTotal1000();
		testCaseCustomerBuyNotGroceriesOver2YearTotal1000();
		testCaseCustomerBuyNotGroceriesTotal1000();
	}
}
