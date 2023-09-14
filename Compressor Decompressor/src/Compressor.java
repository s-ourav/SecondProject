
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author souravmazumdar
 */
public class Compressor {

    /**
     *
     * @param file
     * @throws java.io.IOException
     * @throws IO
     */
    public static void method (File file) throws IOException {
        String filedirectory=file.getParent(); 
        FileInputStream fis=new FileInputStream(file);
        FileOutputStream fos=new FileOutputStream(filedirectory+"/compressed.gz");
        GZIPOutputStream gzip=new GZIPOutputStream(fos);
        
        byte buffer[]=new byte[1024];
        int len;
        while((len=fis.read(buffer))!=-1) {
            gzip.write(buffer,0,len);
        }
        gzip.close();
        fis.close();
        fos.close();
           
    }
    public static void main(String[] args) throws IOException{
        File path=new File("/Users/souravmazumdar/Desktop/DEMO FILE");//"" just to satisfy syntax 
        method(path);
    }

   
}
