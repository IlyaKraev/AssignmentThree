package pseudofactory;

import java.util.ArrayList;
import java.util.List;
import models.Color;
import models.Fabric;
import models.Size;
import models.TShirt;

public class TShirtPseudoFactory {

    public List<TShirt> printShirts() {
        List<TShirt> tshirts = new ArrayList<>();
        int count = 1;
        for (Color color : Color.values()) {
            for (Size size : Size.values()) {
                for (Fabric fabric : Fabric.values()) {
                    TShirt tshirt = new TShirt();
                    tshirt.setName("Shirt " + count);
                    tshirt.setColor(color);
                    tshirt.setSize(size);
                    tshirt.setFabric(fabric);
                    count++;
                    tshirts.add(tshirt);
                }
            }
        }
        return (tshirts);
    }

}
