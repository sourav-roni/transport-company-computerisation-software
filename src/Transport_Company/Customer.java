package Transport_Company;

public class Customer {
	
	private String CustomerName;
	private String CustomerAddress;
	private String CustomerMobile;
	private String CustomerEmailId;
	private String CustomerId;
	private String CustomerConsignmentId;
	
	public Customer(String customerName, String customerAddress, String customerMobile, String customerEmailId,
			String customerId, String customerConsignmentId) {
		super();
		CustomerName = customerName;
		CustomerAddress = customerAddress;
		CustomerMobile = customerMobile;
		CustomerEmailId = customerEmailId;
		CustomerId = customerId;
		CustomerConsignmentId = customerConsignmentId;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getCustomerAddress() {
		return CustomerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		CustomerAddress = customerAddress;
	}
	public String getCustomerMobile() {
		return CustomerMobile;
	}
	public void setCustomerMobile(String customerMobile) {
		CustomerMobile = customerMobile;
	}
	public String getCustomerEmailId() {
		return CustomerEmailId;
	}
	public void setCustomerEmailId(String customerEmailId) {
		CustomerEmailId = customerEmailId;
	}
	public String getCustomerId() {
		return CustomerId;
	}
	public void setCustomerId(String customerId) {
		CustomerId = customerId;
	}
	public String getCustomerConsignmentId() {
		return CustomerConsignmentId;
	}
	public void setCustomerConsignmentId(String customerConsignmentId) {
		CustomerConsignmentId = customerConsignmentId;
	}
	@Override
	public String toString() {
		return "Customer [CustomerName=" + CustomerName + ", CustomerAddress=" + CustomerAddress + ", CustomerMobile="
				+ CustomerMobile + ", CustomerEmailId=" + CustomerEmailId + ", CustomerId=" + CustomerId
				+ ", CustomerConsignmentId=" + CustomerConsignmentId + "]";
	}
	
}
