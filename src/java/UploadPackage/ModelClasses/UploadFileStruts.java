/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UploadPackage.ModelClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author VGLukin
 */
public class UploadFileStruts {
    public static String filesPath = "icons";

    public String load(HttpServletRequest request, File file, String fileName) throws IOException {
        String success = "";
        String directory = request.getContextPath() + File.separator + filesPath;  // windows: c:\Plist\icons\

        saveFile(file, fileName, directory);
        return success;
    }

    private void saveFile(File file, String fileName, String filesDirectory) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

   //     System.out.println("as dir:" + filesDirectory);
        File dir = new File(filesDirectory);
   //     System.out.println("as FilePath" + dir.getPath());
    //    System.out.println("as absolute FilePath" + dir.getAbsolutePath());
        if (!dir.exists()) {
            dir.mkdirs();
        }

        String targetPath = dir.getPath() + File.separator + fileName + ".jpg";
        System.out.println("source file path is:" + file.getAbsolutePath());
        System.out.println("saving file is:" + targetPath);
        File destinationFile = new File(targetPath);
        try {
            in = new FileInputStream(file);
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

    }

    public String getFilesPath() {
        return filesPath;
    }

    public void setFilesPath(String filesPath) {
        this.filesPath = filesPath;
    }

}
