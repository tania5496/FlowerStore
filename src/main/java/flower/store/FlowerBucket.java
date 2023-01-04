package flower.store;

import lombok.Getter;

import java.util.ArrayList;

public class FlowerBucket {
    private double price;
    @Getter
    private ArrayList<FlowerPack> packList = new ArrayList<FlowerPack>();
    FlowerBucket() {
        price = 0;
    }
    public double getPrice() {
        return price;
    }
    public void add(FlowerPack pack) {
        packList.add(pack);
        price += pack.getPrice();
    }

}
