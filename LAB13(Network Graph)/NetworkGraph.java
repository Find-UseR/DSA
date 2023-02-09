package LinkedList;

import java.util.LinkedList;


public class NetworkGraph {

	Network[] networks;
    int numNetworks;

    
    public NetworkGraph(int numNetworks) {
        this.numNetworks = numNetworks;
        networks = new Network[numNetworks];
        for (int i = 0; i < numNetworks; i++) {
            networks[i] = new Network(i);
        }
    }
    

    public void addLink(int source, int destination) {
        networks[source].addLinkedNetwork(destination);
    }
    
    

    public void setRateCharge(int networkId, double rateCharge) {
        networks[networkId].setRateCharge(rateCharge);
    }
    

    public double getRateCharge(int source, int destination) {
        double rateCharge = 0.0;
        LinkedList<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[numNetworks];
        queue.add(source);
        visited[source] = true;

        while (!queue.isEmpty()) {
            int currentNetwork = queue.poll();
            for (int networkId : networks[currentNetwork].linkedNetworks) {
                if (!visited[networkId]) {
                    visited[networkId] = true;
                    queue.add(networkId);
                    rateCharge += networks[networkId].getRateCharge();
                }
                if (networkId == destination) {
                    return rateCharge;
                }
            }
        }
        return rateCharge;
    }
}