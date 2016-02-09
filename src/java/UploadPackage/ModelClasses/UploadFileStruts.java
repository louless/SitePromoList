/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UploadPackage.ModelClasses;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author VGLukin
 */
public class UploadFileStruts {
    
    public static String filesPath = "icons";
    public static String fullFilesPath = "/home/glassfish/icons";

    public String load(HttpServletRequest request, File file, String fileName) throws IOException {
        String success = "";       
        
        success = saveFile(file, fileName + "_", fullFilesPath);
        scaleImage(file);
        success = success + saveFile(file, fileName, fullFilesPath);
        return success;
    }

    private String saveFile(File fileTemp, String fileName, String filesDirectory) {
        String result = "";
        FileInputStream in = null;
        FileOutputStream out = null;

        File dir = new File(filesDirectory);     
        if (!dir.exists()) {
            dir.mkdirs();
        }
        try {
            String targetPath = dir.getPath() + File.separator + fileName + ".jpg";
            System.out.println("source file path is:" + fileTemp.getAbsolutePath());
            System.out.println("saving file is:" + targetPath);
            File destinationFile = new File(targetPath);
            try {
                in = new FileInputStream(fileTemp);
                out = new FileOutputStream(destinationFile);
                int c;

                while ((c = in.read()) != -1) {
                    out.write(c);
                }

            } finally {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            }
        } catch (IOException e) {
            result = e.getMessage();
            return result;
        }
        return result;
    }

    /**
     * Изменение размера рисунка
     * @param file изображение, которое меняется 
     * @return 
     */
    private String scaleImage(File file) {
        String result = "";

        BufferedImage originalImage;
        try {
            originalImage = ImageIO.read(file);

            int width = 200;
            double k = (double)width / (double)originalImage.getWidth();
            int height = (int) originalImage.getHeight();
            height = (int) Math.round(k * height);

            BufferedImage scaledImage = new BufferedImage(width, height, originalImage.getType());
            Image im = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);

            Graphics2D g = scaledImage.createGraphics();
            g.drawImage(im, null, null);
            ImageIO.write(scaledImage, "JPG", file);
        } catch (IOException e) {
            result = e.getMessage();
            return result;
        }
        return result;
    }


}
