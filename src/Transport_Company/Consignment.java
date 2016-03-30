package Transport_Company;

public class Consignment {
	
	private long volume;
	private Sender sender;
	private Receiver receiver;
	private long revenueGenerated;
	private boolean isTruckAssigned;
	private String truckAssigned;
	private boolean dispatechedAndReceived;
	private BranchOffice sourcebranch;
	private BranchOffice destinationBranch;
	private String consignmentId;
	public Consignment(long volume, Sender sender, Receiver receiver, long revenueGenerated, boolean isTruckAssigned,
			String truckAssigned, boolean dispatechedAndReceived, BranchOffice sourcebranch,
			BranchOffice destinationBranch, String consignmentId) {
		super();
		this.volume = volume;
		this.sender = sender;
		this.receiver = receiver;
		this.revenueGenerated = revenueGenerated;
		this.isTruckAssigned = isTruckAssigned;
		this.truckAssigned = truckAssigned;
		this.dispatechedAndReceived = dispatechedAndReceived;
		this.sourcebranch = sourcebranch;
		this.destinationBranch = destinationBranch;
		this.consignmentId = consignmentId;
	}
	public long getVolume() {
		return volume;
	}
	public void setVolume(long volume) {
		this.volume = volume;
	}
	public Sender getSender() {
		return sender;
	}
	public void setSender(Sender sender) {
		this.sender = sender;
	}
	public Receiver getReceiver() {
		return receiver;
	}
	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}
	public long getRevenueGenerated() {
		return revenueGenerated;
	}
	public void setRevenueGenerated(long revenueGenerated) {
		this.revenueGenerated = revenueGenerated;
	}
	public boolean isTruckAssigned() {
		return isTruckAssigned;
	}
	public void setTruckAssigned(boolean isTruckAssigned) {
		this.isTruckAssigned = isTruckAssigned;
	}
	public String getTruckAssigned() {
		return truckAssigned;
	}
	public void setTruckAssigned(String truckAssigned) {
		this.truckAssigned = truckAssigned;
	}
	public boolean isDispatechedAndReceived() {
		return dispatechedAndReceived;
	}
	public void setDispatechedAndReceived(boolean dispatechedAndReceived) {
		this.dispatechedAndReceived = dispatechedAndReceived;
	}
	public BranchOffice getSourcebranch() {
		return sourcebranch;
	}
	public void setSourcebranch(BranchOffice sourcebranch) {
		this.sourcebranch = sourcebranch;
	}
	public BranchOffice getDestinationBranch() {
		return destinationBranch;
	}
	public void setDestinationBranch(BranchOffice destinationBranch) {
		this.destinationBranch = destinationBranch;
	}
	public String getConsignmentId() {
		return consignmentId;
	}
	public void setConsignmentId(String consignmentId) {
		this.consignmentId = consignmentId;
	}
	@Override
	public String toString() {
		return "Consignment [volume=" + volume + ", sender=" + sender + ", receiver=" + receiver + ", revenueGenerated="
				+ revenueGenerated + ", isTruckAssigned=" + isTruckAssigned + ", truckAssigned=" + truckAssigned
				+ ", dispatechedAndReceived=" + dispatechedAndReceived + ", sourcebranch=" + sourcebranch
				+ ", destinationBranch=" + destinationBranch + ", consignmentId=" + consignmentId + "]";
	}
	

}
