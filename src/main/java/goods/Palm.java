package goods;

import abstractPac.Flower;
import enums.Color;
import enums.PalmType;

public class Palm extends Flower {
    private PalmType palmType;

    public Palm(PalmType palmType, String name, double price, Color color) {
        super(name, price,color);
        this.palmType = palmType;
    }

    @Override
    public String toString() {
        return "Palm{" +
                "palmType=" + palmType +
                "} " + super.toString();
    }
}
