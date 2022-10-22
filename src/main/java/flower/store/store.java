package flower.store;
import java.util.ArrayList;
public class store {
    private ArrayList<FlowerPack> listOfPacks = new ArrayList<>();
    public void addPack(FlowerPack flowerPack){
        listOfPacks.add(flowerPack);
    }
    public double getPrice(){
        int totalPrice = 0;
        for(int i=0; i< listOfPacks.size(); i++){
            totalPrice+= listOfPacks.get(i).getPrice();
        }
        return totalPrice;
    }
}
