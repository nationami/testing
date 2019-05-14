package id.co.infoflow.model;

public class Shopping {

	public Customer customer;
	public Integer discount;
	public String buyType;
	public Integer bill;
	public Integer totalPay;
	
	
	public Shopping(Customer customer, String buyType, Integer bill) {
		super();
		Integer totalPayCount = bill;
		if(!"groceries".equals(buyType)){
			if("Employee".equals(customer.getType())){
				discount = 30;
				totalPayCount = bill-((bill/100) * 30);
			}else if("Affiliate".equals(customer.getType())){
				discount = 10;
				totalPayCount = bill-((bill/100) * 10);
			}else if(customer.getYear()!=null && customer.getYear() > 2){
				discount = 5;
				totalPayCount = bill-((bill/100) * 5);
			}else{
				if(bill>=100){
					discount = ((bill % 100) * 5);
					totalPayCount = bill-discount;
				}
			}
		}
		
		this.customer = customer;
		this.buyType = buyType;
		this.bill = bill;
		this.totalPay = totalPayCount;
	}
	
	public Integer getDiscount() {
		return discount;
	}
	public void setDiscount(Integer discount) {
		this.discount = discount;
	}
	public String getBuyType() {
		return buyType;
	}
	public void setBuyType(String buyType) {
		this.buyType = buyType;
	}
	public Integer getBill() {
		return bill;
	}
	public void setBill(Integer bill) {
		this.bill = bill;
	}

	public Integer getTotalPay() {
		return totalPay;
	}

	public void setTotalPay(Integer totalPay) {
		this.totalPay = totalPay;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
