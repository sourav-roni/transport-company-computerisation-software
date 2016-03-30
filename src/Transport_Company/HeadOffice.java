package Transport_Company;

public class HeadOffice extends Office{

	private boolean isHead;
	
	public boolean isHead() {
		return isHead;
	}

	public void setHead(boolean isHead) {
		this.isHead = isHead;
	}

	public HeadOffice(String branchId, String branchAddress, String branchPhone, int numberOfTrucks,
			int numberOfEmployees, long volumeHandled, long revenueGenerated, long idleWaitingTime, long rate) {
		super(branchId, branchAddress, branchPhone, numberOfTrucks, numberOfEmployees, volumeHandled, revenueGenerated,
				idleWaitingTime, rate);
	}

}
