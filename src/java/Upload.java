/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import static org.apache.struts2.ServletActionContext.getServletContext;


/**
 *
 * @author VGLukin
 */
public class Upload {

    private Random random = new Random();

    public String load(HttpServletRequest request) throws ServletException, IOException {
        String success = "";
        
        //проверяем является ли полученный запрос multipart/form-data
        boolean isMultipart = ServletFileUpload.isMultipartContent(request);
        if (!isMultipart) {
           // response.sendError(HttpServletResponse.SC_BAD_REQUEST);
            success = "SC_BAD_REQUEST";
            return success;
        }

        // Создаём класс фабрику 
        DiskFileItemFactory factory = new DiskFileItemFactory();

        // Максимальный буфера данных в байтах,
        // при его привышении данные начнут записываться на диск во временную директорию
        // устанавливаем один мегабайт
        factory.setSizeThreshold(1024 * 1024);

        // устанавливаем временную директорию 
        File tempDir = (File) getServletContext().getAttribute("javax.servlet.context.tempdir");
        factory.setRepository(tempDir);

        //Создаём сам загрузчик
        ServletFileUpload upload = new ServletFileUpload(factory);

        //максимальный размер данных который разрешено загружать в байтах
        //по умолчанию -1, без ограничений. Устанавливаем 5 мегабайт. 
        upload.setSizeMax(1024 * 1024 * 5);

        try {
            List items = upload.parseRequest(request);
            Iterator iter = items.iterator();

            while (iter.hasNext()) {
                FileItem item = (FileItem) iter.next();

                if (item.isFormField()) {
                    //если принимаемая часть данных является полем формы			    	
                    processFormField(item);
                } else {
                    //в противном случае рассматриваем как файл
                    processUploadedFile(item);
                }
            }
        } catch (Exception e) {
        //    response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);     
            success = "SC_INTERNAL_SERVER_ERROR";
        }
        return success;
    }

    /**
     * Сохраняет файл на сервере, в папке upload. Сама папка должна быть уже
     * создана.
     *
     * @param item
     * @throws Exception
     */
    private void processUploadedFile(FileItem item) throws Exception {
        File uploadetFile = null;
        //выбираем файлу имя пока не найдём свободное
        do {
           String path = getServletContext().getRealPath("/icons/" + random.nextInt() + item.getName());
           uploadetFile = new File(path);
        } while (uploadetFile.exists());

        //создаём файл
        uploadetFile.createNewFile();
        //записываем в него данные
        item.write(uploadetFile);
    }

    /**
     * Выводит на консоль имя параметра и значение
     *
     * @param item
     */
    private void processFormField(FileItem item) {
        System.out.println(item.getFieldName() + "=" + item.getString());
    }

}
