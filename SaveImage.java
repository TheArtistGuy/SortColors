import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


//Class to Save a BufferedImage as jpg.
public class SaveImage {

    static void saveImage(BufferedImage image, File jpegFiletoSave, float quality) throws IOException {
        // save jpeg image with specific quality. "1f" corresponds to 100% , "0.7f" corresponds to 70%

        ImageWriter jpgWriter = ImageIO.getImageWritersByFormatName("jpg").next();
        ImageWriteParam jpgWriteParam = jpgWriter.getDefaultWriteParam();
        jpgWriteParam.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
        jpgWriteParam.setCompressionQuality(quality);

        jpgWriter.setOutput(ImageIO.createImageOutputStream(jpegFiletoSave));
        IIOImage outputImage = new IIOImage(image, null, null);
        jpgWriter.write(null, outputImage, jpgWriteParam);
        jpgWriter.dispose();

    }

    static void saveImage(BufferedImage image, String outputfile, float quality) throws IOException {
        // save jpeg image with specific quality. "1f" corresponds to 100% , "0.7f" corresponds to 70%
            File jpegFiletoSave = new File(outputfile);
            ImageWriter jpgWriter = ImageIO.getImageWritersByFormatName("jpg").next();
            ImageWriteParam jpgWriteParam = jpgWriter.getDefaultWriteParam();
            jpgWriteParam.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
            jpgWriteParam.setCompressionQuality(quality);

            jpgWriter.setOutput(ImageIO.createImageOutputStream(jpegFiletoSave));
            IIOImage outputImage = new IIOImage(image, null, null);
            jpgWriter.write(null, outputImage, jpgWriteParam);
            jpgWriter.dispose();
    }
}
