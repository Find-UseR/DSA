package LinkedList;

import java.util.LinkedList;

public class Network {
	 int networkId;
	    LinkedList<Integer> linkedNetworks;
	    double rateCharge;

	    public Network(int id) {
	        this.networkId = id;
	        linkedNetworks = new LinkedList<>();
	    }

	    public void addLinkedNetwork(int networkId) {
	        linkedNetworks.add(networkId);
	    }

	    public void setRateCharge(double rateCharge) {
	        this.rateCharge = rateCharge;
	    }

	    public double getRateCharge() {
	        return rateCharge;
	    }
}
