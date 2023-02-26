package hello.spring_core_basic.singleton;

public class StatefulService {

    private int price;

    public void order(String name, int price) {
        System.out.println("name = " + name);
        System.out.printf("price = " + price);
    }

    public int getPrice() {
        return price;
    }
}
