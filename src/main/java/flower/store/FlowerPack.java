package flower.store;

public class FlowerPack {
    private Flower flower;
    private int quantity;
    public double getPrice(){
        return quantity*flower.getPrice();
    }
}
