package Transport_Company;

public class Receiver extends Customer{
	
	private boolean ReceivedStatus;

	public Receiver(String customerName, String customerAddress, String customerMobile, String customerEmailId,
			String customerId, String customerConsignmentId) {
		super(customerName, customerAddress, customerMobile, customerEmailId, customerId, customerConsignmentId);
	}

	public boolean isReceivedStatus() {
		return ReceivedStatus;
	}

	public void setReceivedStatus(boolean receivedStatus) {
		ReceivedStatus = receivedStatus;
	}

}
