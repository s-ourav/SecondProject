
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.IOException;
import java.util.zip.GZIPInputStream;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author souravmazumdar
 */
public class Decompressor {
    public static void method(File file) throws IOException{
        String path=file.getParent();
        
        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos=new FileOutputStream (path+"/decompressed_file");
        GZIPInputStream gzip=new GZIPInputStream(fis);
        
        byte[] buffer=new byte[1024];
        int len;
        while((len=gzip.read(buffer))!=-1) {
            fos.write(buffer,0,len);
        }
        fis.close();
        fos.close();
        gzip.close();
        
        
    }
    public static void main (String[] args) throws IOException {
        File file=new File("/Users/souravmazumdar/Desktop/CompressedFile.gz");
        
    }
}
