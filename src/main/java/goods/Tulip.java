package goods;

import abstractPac.Flower;
import enums.Color;
import enums.TulipType;

public class Tulip extends Flower {
    private TulipType tulipType;

    public Tulip(TulipType tulipType, String name, double price, Color color) {
        super(name, price, color);
        this.tulipType = tulipType;
    }

    @Override
    public String toString() {
        return "Tulip{" +
                "tulipType=" + tulipType +
                "} " + super.toString();
    }
}
