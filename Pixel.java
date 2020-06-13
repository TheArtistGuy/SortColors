import java.awt.*;

public class Pixel extends Color implements Comparable<Pixel> {

    Pixel (Color c){
        super(c.getRGB());
    }

    Pixel(int r, int g, int b){
        super(r, g, b);
    }

    @Override
    public int compareTo(Pixel p) {
        return (this.getRed() + this.getGreen() + this.getBlue()) - (p.getRed() + p.getGreen() + p.getBlue());
    }
}
