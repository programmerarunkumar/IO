package IO.IO;

import java.io.File;
import java.io.InputStream;

public class FileInputStream {

    private String filePath;

    FileInputStream(String filePath){
        this.filePath = filePath;
    }

    //read()
    public void readUsingSingleByte() throws Exception {

        InputStream inputStream = new java.io.FileInputStream(filePath);

        Long startTime = System.currentTimeMillis();

        int data = inputStream.read();
        while (data != -1){
            Log.printByte(data);
            data = inputStream.read();
        }
        inputStream.close();

        Long endTime = System.currentTimeMillis();
        System.out.println("readUsingSingleByte. Total Time : " + (endTime-startTime));

    }

    //int read(byte[])
    public void readFullFileUsingByteArray() throws Exception {

        File file = new File(filePath);
        byte[] byteArray =  new byte[(int) file.length()];

        InputStream inputStream = new java.io.FileInputStream(filePath);

        Long startTime = System.currentTimeMillis();

        int byteLen = inputStream.read(byteArray);

        for(int i = 0; i<byteLen; i++){
            Log.printByte(byteArray[i]);
        }
        inputStream.close();

        Long endTime = System.currentTimeMillis();
        System.out.println("readFullFileUsingByteArray. Total Time : " + (endTime-startTime));

    }

    //int read(byte[])
    public void readUsingByteArray(byte[] byteArray) throws Exception{

        InputStream inputStream = new java.io.FileInputStream(filePath);

        Long startTime = System.currentTimeMillis();

        int byteLen;
        while ((byteLen = inputStream.read(byteArray)) != -1){
            Log.printByte(byteArray, byteLen);
        }
        inputStream.close();

        Long endTime = System.currentTimeMillis();
        System.out.println("readUsingByteArray. Total Time : " + (endTime-startTime));

    }

    //int read(byte[], int offset, int length)
    public void readUsingByteArrayOffset() throws Exception{

        InputStream inputStream = new java.io.FileInputStream(filePath);

        byte[] byteArray = new byte[3];

        Long startTime = System.currentTimeMillis();

        int bytesRead;
        while ((bytesRead = inputStream.read(byteArray, 0 ,byteArray.length)) != -1){
            Log.printByte(byteArray, bytesRead);
        }

        Long endTime = System.currentTimeMillis();
        System.out.println("readUsingByteArrayOffset. Total Time : " + (endTime-startTime));

    }

    public void isMarkSupported() throws Exception {

        InputStream inputStream = new java.io.FileInputStream(filePath);
        boolean isMarkSupported = inputStream.markSupported();
        inputStream.close();
        System.out.println("isMarkSupported : " + isMarkSupported);

    }


}
