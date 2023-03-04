package IO.IO;

import java.io.InputStream;

public class FileInputStream {

    private InputStream fileInputStream;

    FileInputStream(String filePath) throws Exception{
        this.fileInputStream = new java.io.FileInputStream(filePath);
    }

    public void isMarkSupported() throws Exception {

        boolean isMarkSupported = fileInputStream.markSupported();
        System.out.println("isMarkSupported : " + isMarkSupported);

    }

    public void available() throws Exception {

        int available = fileInputStream.available();
        System.out.println("available : " + available);

    }

    public void readSingleByte() throws Exception {

        Long startTime = System.currentTimeMillis();

        int data = fileInputStream.read();
        while (data != -1){
            Log.printByte(data);
            data = fileInputStream.read();
        }

        Long endTime = System.currentTimeMillis();
        System.out.println("readUsingSingleByte. Total Time : " + (endTime-startTime));

    }

    public void readUsingByteArray(byte[] byteArray) throws Exception{

        Long startTime = System.currentTimeMillis();

        int byteLen;
        while ((byteLen = fileInputStream.read(byteArray)) != -1){
            Log.printByte(byteArray, byteLen);
        }

        Long endTime = System.currentTimeMillis();
        System.out.println("readUsingByteArray. Total Time : " + (endTime-startTime));

    }

    public void readFullFileUsingByteArray() throws Exception {

        byte[] byteArray =  new byte[fileInputStream.available()];

        Long startTime = System.currentTimeMillis();

        int byteLen = fileInputStream.read(byteArray);

        Log.printByte(byteArray, byteLen);

        Long endTime = System.currentTimeMillis();
        System.out.println("readFullFileUsingByteArray. Total Time : " + (endTime-startTime));

    }

    public void readUsingByteArrayOffset() throws Exception{

        byte[] byteArray = new byte[3];

        Long startTime = System.currentTimeMillis();

        int bytesLen;
        while ((bytesLen = fileInputStream.read(byteArray, 0 ,byteArray.length)) != -1){
            Log.printByte(byteArray, bytesLen);
        }

        Long endTime = System.currentTimeMillis();
        System.out.println("readUsingByteArrayOffset. Total Time : " + (endTime-startTime));

    }

    public void close() throws Exception {
        fileInputStream.close();
    }

}
