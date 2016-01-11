package zad1;



import java.util.HashMap;


public class Customer {
    private ShoppingCart wozek;
    private String x;
    private int y;

    public Customer(String name, int money) {
        wozek = new ShoppingCart(this);
        x = name;
        y = money;
    }

    public void get(Flower flower) {
        wozek.addFlower(flower);
    }

    public ShoppingCart getShoppingCart() {
        return wozek;
    }

    public String getImie() {
        return x;
    }
    public int getCash() {
        return y;
    }

    public void pay() {
        wozek.usuwanieKwiat();
        y -= wozek.obliczCeneZakupow();
    }

   

    public void pack(Box pudelkoJanka) {
        pudelkoJanka.kwiatSet(wozek.getKwiaty());
        wozek.setKwiaty(new HashMap<Flower, Integer>());
    }
}