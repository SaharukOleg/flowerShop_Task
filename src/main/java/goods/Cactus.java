package goods;

import abstractPac.Flower;
import enums.CactusType;
import enums.Color;

public class Cactus extends Flower {
    private CactusType cactusType;

    public CactusType getCactusType() {
        return cactusType;
    }

    public void setCactusType(CactusType cactusType) {
        this.cactusType = cactusType;
    }

    public Cactus(CactusType cactusType, String name, double price, Color color) {
        super(name, price, color);
        this.cactusType = cactusType;
    }

    @Override
    public String toString() {
        return "Cactus{" +
                "cactusType=" + cactusType +
                "} " + super.toString();
    }
}
