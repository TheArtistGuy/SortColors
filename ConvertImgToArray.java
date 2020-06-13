import java.awt.*;
import java.awt.image.BufferedImage;


//Wandelt ein BufferedImage in einen Array aus Pixeln (Vergleichbaren Farben) um.
public class ConvertImgToArray {
    Pixel[] pictureArray;

            ConvertImgToArray(BufferedImage image) {
                this.pictureArray = new Pixel[image.getHeight() * image.getWidth()];
                int counter = 0;

                for (int i = 0; i < image.getWidth(); i++) {
                    for (int j = 0; j < image.getHeight(); j++) {

                        this.pictureArray[counter] = new Pixel(new Color(image.getRGB(i, j)));
                        counter++;
                    }
                }
            }

    public Pixel[] getPictureArray(){
                return pictureArray;
    }
}
