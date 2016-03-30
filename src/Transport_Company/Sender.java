package Transport_Company;

public class Sender extends Customer{
	
	private boolean DespatchStatus;

	public Sender(String customerName, String customerAddress, String customerMobile, String customerEmailId,
			String customerId, String customerConsignmentId) {
		super(customerName, customerAddress, customerMobile, customerEmailId, customerId, customerConsignmentId);
	}

	public boolean isDespatchStatus() {
		return DespatchStatus;
	}

	public void setDespatchStatus(boolean despatchStatus) {
		DespatchStatus = despatchStatus;
	}

}
