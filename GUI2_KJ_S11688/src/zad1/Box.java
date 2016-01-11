package zad1;

import java.util.ArrayList;
import java.util.Map;


public class Box {
    private Map<Flower, Integer> kwiaty;
    private Customer customer;

    public Box(Customer x) {
        this.customer = x;
        kwiaty = x.getShoppingCart().getKwiaty();
    }
    public void kwiatSet(Map<Flower, Integer> y) {
        kwiaty = y;
    }
	public final void flowSet(ArrayList<Flower> value)
	{
		ArrayList<Flower> Flowers = value;
	}
  
    public String toString() {
        if (kwiaty.size() == 0)
            return "Wózek właściciel " + customer.getImie() + " -- pusto";
        else {
            StringBuilder builder = new StringBuilder();
            builder.append("Wozek właściciel " + customer.getImie() + "\n");
            for (Flower flower : kwiaty.keySet()) {
                builder.append(flower + "\n");
            }
            return builder.toString();
        }

    }
}