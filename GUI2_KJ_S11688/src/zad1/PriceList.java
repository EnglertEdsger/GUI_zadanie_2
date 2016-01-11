package zad1;

import java.util.HashMap;
import java.util.Map;



public class PriceList {
    private static PriceList ourInstance = new PriceList();
    private Map<String, Integer> cennik;

    public static PriceList getInstance() {
        return ourInstance;
    }

    private PriceList() {
        cennik = new HashMap<String, Integer>();
    }
    public Integer get(String x) {
        return cennik.get(x);
    }

    public void put(String x, double y) {
        cennik.put(x, (int) y);
    }

 

	
	}
