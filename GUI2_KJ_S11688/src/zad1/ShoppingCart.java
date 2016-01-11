package zad1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class ShoppingCart {
    private Map<Flower, Integer> kwiaty;
    private Customer wlasciciel;
    private PriceList cena = PriceList.getInstance();

    public ShoppingCart(Customer x) {
        kwiaty = new HashMap<Flower, Integer>();
        wlasciciel = x;
    }

    public void addFlower(Flower flower) {
        kwiaty.put(flower, cena.get(flower.imie()));
    }

    public void usuwanieKwiat() {
        Iterator<Map.Entry<Flower, Integer>> iterator = kwiaty.entrySet().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getValue() == null)
                iterator.remove();
        }
    }

    public int obliczCeneZakupow() {
        int price = 0;
        for (Flower flower : kwiaty.keySet()) {
            for (int i = 0; i < flower.ilosc(); i++) {
                if (price + kwiaty.get(flower) > wlasciciel.getCash())
                    break;
                else
                    price += kwiaty.get(flower);
            }
        }
        return price;
    }

    public String toString() {
        if (kwiaty.size() == 0)
            return "Wózek właściciel " + wlasciciel.getImie() + " -- pusto";
        else {
            StringBuilder builder = new StringBuilder();
            builder.append("Wozek właściciel " + wlasciciel.getImie() + "\n");
            for (Flower flower : kwiaty.keySet()) {
                builder.append(flower + "\n");
            }
            return builder.toString();
        }

    }

    public Map<Flower, Integer> getKwiaty() {
        return kwiaty;
    }

    public void setKwiaty(Map<Flower, Integer> kwiaty) {
        this.kwiaty = kwiaty;
    }
}