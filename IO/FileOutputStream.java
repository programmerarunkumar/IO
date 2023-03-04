package IO.IO;

import java.io.FileNotFoundException;
import java.io.OutputStream;

public class FileOutputStream {

    private String filePath;
    private OutputStream fileOutputStream;

    FileOutputStream(String filePath) throws Exception {
        this.filePath = filePath;
        this.fileOutputStream = new java.io.FileOutputStream(filePath);
    }

    public void writeSingleByte() throws Exception {

        String data = "Hi Hello Im ArunKumar MP. writeUsingSingleByte";
        byte[] byteArray = data.getBytes();

        Long startTime = System.currentTimeMillis();
        for(byte value : byteArray){
            fileOutputStream.write(value);
        }
        Long endTime = System.currentTimeMillis();

        System.out.println("writeUsingSingleByte. Total Time : " + (endTime-startTime));

    }

    public void writeUsingByteArray() throws Exception {

        String data = "Hi Hello Im ArunKumar MP. writeUsingByteArray";
        byte[] byteArray = data.getBytes();

        Long startTime = System.currentTimeMillis();
        fileOutputStream.write(byteArray);
        Long endTime = System.currentTimeMillis();

        System.out.println("writeUsingByteArray. Total Time : " + (endTime-startTime));

    }

    public void writeUsingByteArrayOffset() throws Exception {

        String data = "Hi Hello Im ArunKumar MP. writeUsingByteArrayOffset";
        byte[] byteArray = data.getBytes();

        OutputStream fileOutputStream = new java.io.FileOutputStream(filePath);

        Long startTime = System.currentTimeMillis();
        for(int i=0; i< byteArray.length; i++){
            fileOutputStream.write(byteArray, i, 1);
        }
        Long endTime = System.currentTimeMillis();

        System.out.println("writeUsingByteArrayOffset. Total Time : " + (endTime-startTime));

    }

    public void close() throws Exception {
        this.fileOutputStream.close();
    }

}
