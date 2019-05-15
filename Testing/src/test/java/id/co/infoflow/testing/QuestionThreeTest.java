package id.co.infoflow.testing;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import id.co.infoflow.model.Affiliate;
import id.co.infoflow.model.Customer;
import id.co.infoflow.model.Employee;
import id.co.infoflow.model.Shopping;


public class QuestionThreeTest {
	@Test
	public void testCaseEmployeeBuyGroceriesTotal1000(){
		Customer customer = new Employee();
		Shopping shopping = new Shopping(customer, "groceries", 1000);
		System.out.println("Total must be pay test testCaseEmployeeBuyGroceriesTotal1000 : " + shopping.getTotalPay());
		Assert.assertEquals(shopping.getTotalPay().toString(), "1000");
	}
	@Test
	public void testCaseEmployeeBuyNotGroceriesTotal1000(){
		Customer customer = new Employee();
		Shopping shopping = new Shopping(customer, "", 1000);
		System.out.println("Total must be pay testCaseEmployeeBuyNotGroceriesTotal1000 : " + shopping.getTotalPay());
		Assert.assertEquals(shopping.getTotalPay().toString(), "700");
	}
	@Test
	public void testCaseAffiliateBuyGroceriesTotal1000(){
		Customer customer = new Affiliate();
		Shopping shopping = new Shopping(customer, "groceries", 1000);
		System.out.println("Total must be pay testCaseAffiliateBuyGroceriesTotal1000 : " + shopping.getTotalPay());
		Assert.assertEquals(shopping.getTotalPay().toString(), "1000");
	}
	@Test
	public void testCaseAffiliateBuyNotGroceriesTotal1000(){
		Customer customer = new Affiliate();
		Shopping shopping = new Shopping(customer, "", 1000);
		System.out.println("Total must be pay testCaseAffiliateBuyNotGroceriesTotal1000 : " + shopping.getTotalPay());
		Assert.assertEquals(shopping.getTotalPay().toString(), "900");
	}
	@Test
	public void testCaseCustomerBuyGroceriesTotal1000(){
		Customer customer = new Customer();
		Shopping shopping = new Shopping(customer, "groceries", 1000);
		System.out.println("Total must be pay testCaseCustomerBuyGroceriesTotal1000 : " + shopping.getTotalPay());
		Assert.assertEquals(shopping.getTotalPay().toString(), "1000");
	}
	@Test
	public void testCaseCustomerBuyNotGroceriesOver2YearTotal1000(){
		Customer customer = new Customer();
		customer.setYear(3);
		Shopping shopping = new Shopping(customer, "", 1000);
		System.out.println("Total must be pay testCaseCustomerBuyNotGroceriesOver2YearTotal1000 : " + shopping.getTotalPay());
		Assert.assertEquals(shopping.getTotalPay().toString(), "950");
	}
	@Test
	public void testCaseCustomerBuyNotGroceriesTotal1000(){
		Customer customer = new Customer();
		customer.setYear(3);
		customer.setType("");
		Shopping shopping = new Shopping(customer, "", 1000);
		System.out.println("Total must be pay testCaseCustomerBuyNotGroceriesTotal1000 : " + shopping.getTotalPay());
		Assert.assertEquals(shopping.getTotalPay().toString(), "950");
	}
	
	@Test
	public void testAllCase(){
		QuestionThree three = new QuestionThree();
		three.testCaseEmployeeBuyGroceriesTotal1000();
		three.testCaseEmployeeBuyNotGroceriesTotal1000();
		three.testCaseAffiliateBuyGroceriesTotal1000();
		three.testCaseAffiliateBuyNotGroceriesTotal1000();
		three.testCaseCustomerBuyGroceriesTotal1000();
		three.testCaseCustomerBuyNotGroceriesOver2YearTotal1000();
		three.testCaseCustomerBuyNotGroceriesTotal1000();
	}

	@Test
	public void testMain() throws IOException {
	    String[] args = null;
	    QuestionThree.main(args);
	}
}
