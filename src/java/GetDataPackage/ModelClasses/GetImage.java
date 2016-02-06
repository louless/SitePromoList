/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GetDataPackage.ModelClasses;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author VGLukin
 */
public class GetImage {

    private InputStream inputStream;
    private String contentType;
    private String contentDisposition;
    private String imagePath;

    public String execute() throws IOException {
        String result = "";
        byte[] byteArray = ConvertImage.convertImageToByte(imagePath);
        inputStream = new ByteArrayInputStream(byteArray);
        return "success";
    }

    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getContentDisposition() {
        return contentDisposition;
    }

    public void setContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

}
