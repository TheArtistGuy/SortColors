import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

//Klasse zum Sortieren von Pixeln in Bildern nach Sättigung
public class SortPicture {
    private BufferedImage img;
    private Pixel[] pixelArray;
    private String outputFile;

    public SortPicture(String filename, String outputFile){
        try

    {
        File dat = new File(filename);
        this.img = ImageIO.read(dat);
    }catch(
    IOException e)

    {
        System.out.println("Konnte Datei nicht öffnen.");
        System.exit(0);
    }
        this.outputFile = outputFile;
}




public void execute(){
        //Sortieren und in Liste speichern
        ConvertImgToArray converter = new ConvertImgToArray(img);
        this.pixelArray = converter.getPictureArray();
        //Sortieren der Liste
         Arrays.sort(pixelArray);
        //Änderungen zurück in Buffered image schreiben
        int color;
        int pixelArrayCounter = 0;
        for (int i = 0; i< img.getWidth(); i++){
            for (int j=0; j < img.getHeight(); j++){
                color = ( pixelArray[pixelArrayCounter].getAlpha() << 24
                        | pixelArray[pixelArrayCounter].getRed() << 16
                        | pixelArray[pixelArrayCounter].getGreen() << 8
                        | pixelArray[pixelArrayCounter].getBlue() );
                img.setRGB(i, j, color);
                pixelArrayCounter++;
            }
        }
        //Speichern in outputFile
        try {
            SaveImage.saveImage(img, outputFile, 1f);
        }catch (IOException e){System.out.println("Konnte nicht in Ausgabedatei schreiben");}



}



}
