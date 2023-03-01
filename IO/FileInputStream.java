package IO.IO;

import java.io.File;
import java.io.InputStream;

public class FileInputStream {

    private InputStream inputStream;

    FileInputStream(String filePath) throws Exception{
        this.inputStream = new java.io.FileInputStream(filePath);
    }

    FileInputStream(InputStream inputStream){
        this.inputStream = inputStream;
    }

    //read()
    public void readUsingSingleByte() throws Exception {

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
    public void readUsingByteArray(byte[] byteArray) throws Exception{

        Long startTime = System.currentTimeMillis();

        int byteLen;
        while ((byteLen = inputStream.read(byteArray)) != -1){
            Log.printByte(byteArray, byteLen);
        }
        inputStream.close();

        Long endTime = System.currentTimeMillis();
        System.out.println("readUsingByteArray. Total Time : " + (endTime-startTime));

    }

    //int read(byte[])
    public void readFullFileUsingByteArray() throws Exception {

        byte[] byteArray =  new byte[inputStream.available()];

        Long startTime = System.currentTimeMillis();

        int byteLen = inputStream.read(byteArray);

        for(int i = 0; i<byteLen; i++){
            Log.printByte(byteArray[i]);
        }
        inputStream.close();

        Long endTime = System.currentTimeMillis();
        System.out.println("readFullFileUsingByteArray. Total Time : " + (endTime-startTime));

    }

    //int read(byte[], int offset, int length)
    public void readUsingByteArrayOffset() throws Exception{

        byte[] byteArray = new byte[3];

        Long startTime = System.currentTimeMillis();

        int bytesRead;
        while ((bytesRead = inputStream.read(byteArray, 0 ,byteArray.length)) != -1){
            Log.printByte(byteArray, bytesRead);
        }
        inputStream.close();

        Long endTime = System.currentTimeMillis();
        System.out.println("readUsingByteArrayOffset. Total Time : " + (endTime-startTime));

    }

    public void isMarkSupported() throws Exception {

        boolean isMarkSupported = inputStream.markSupported();
        inputStream.close();

        System.out.println("isMarkSupported : " + isMarkSupported);

    }


}
