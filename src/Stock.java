import java.util.ArrayList;

public class Stock {
    ArrayList<Product> stock;
    private final double volume = 50;

    void addShampooToStock(Shampoo shampoo){
        this.stock.add(shampoo);
    }
    void addJuiceToStock( Juice juice){
        this.stock.add(juice);
    }
    void  addSoapToStock(Soap soap){
        this.stock.add(soap);
    }
}
