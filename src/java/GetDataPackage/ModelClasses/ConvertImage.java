/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GetDataPackage.ModelClasses;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

/**
 *
 * @author VGLukin
 */
public class ConvertImage {

    /**
     * convert an image file to byte array
     *
     * @param imagePath
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static byte[] convertImageToByte(String imagePath) throws FileNotFoundException, IOException {
      //  String result;

        File file = new File(imagePath);
        FileInputStream fis = new FileInputStream(file);
        //create FileInputStream which obtains input bytes from a file in a file system
        //FileInputStream is meant for reading streams of raw bytes such as image data.
        //For reading streams of characters, consider using FileReader.

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] buf = new byte[1024];
        try {
            for (int readNum; (readNum = fis.read(buf)) != -1;) {
                //Writes to this byte array output stream
                bos.write(buf, 0, readNum);
                System.out.println("read " + readNum + " bytes,");
            }
        } catch (IOException ex) {
            ////   result = ex.getMessage();
            Logger.getLogger(ConvertImage.class.getName()).log(Level.SEVERE, null, ex);
        }

        byte[] bytes = bos.toByteArray();
        return bytes;
    }

    /**
     * convert byte array back to an image file
     * @param bytes
     * @param fileName
     * @return
     * @throws IOException 
     */
    public static File convertByteToImage(byte[] bytes, String fileName) throws IOException {
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        Iterator<?> readers = ImageIO.getImageReadersByFormatName("jpg");

        //ImageIO is a class containing static methods for locating ImageReaders
        //and ImageWriters, and performing simple encoding and decoding. 
        ImageReader reader = (ImageReader) readers.next();
        Object source = bis;
        ImageInputStream iis = ImageIO.createImageInputStream(source);
        reader.setInput(iis, true);
        ImageReadParam param = reader.getDefaultReadParam();

        //got an image file
        Image image = reader.read(0, param);

        //bufferedImage is the RenderedImage to be written
        BufferedImage bufferedImage = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_RGB);

        Graphics2D g2 = bufferedImage.createGraphics();
        g2.drawImage(image, null, null);

        File imageFile = new File(fileName);
        ImageIO.write(bufferedImage, "jpg", imageFile);

        System.out.println(imageFile.getPath());
        return imageFile;
    }
}
