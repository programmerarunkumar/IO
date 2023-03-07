package IO.IO;

import java.io.FileInputStream;

public class BufferedInputStream {

    private java.io.BufferedInputStream bufferedInputStream;

    BufferedInputStream(String filePath) throws Exception {
        FileInputStream fileInputStream = new FileInputStream(filePath);
        bufferedInputStream = new java.io.BufferedInputStream(fileInputStream);
    }

    public void isMarkSupported(){

        boolean isMarkSupported = bufferedInputStream.markSupported();
        System.out.println("isMarkSupported : " + isMarkSupported);

    }

    public void available() throws Exception{

        int available = bufferedInputStream.available();
        System.out.println("available : " + available);

    }

    public void readSingleByte() throws Exception {

        Long startTime = System.currentTimeMillis();

        int data;
        while ((data = bufferedInputStream.read()) != -1){
            Log.printByte(data);
        }

        Long endTime = System.currentTimeMillis();
        System.out.println("readUsingSingleByte. Total Time : " + (endTime-startTime));

    }

    public void readUsingByteArray(byte[] byteArray) throws Exception {

        Long startTime = System.currentTimeMillis();

        int byteLen;
        while ((byteLen = bufferedInputStream.read(byteArray)) != -1){
            Log.printByte(byteArray, byteLen);
        }

        Long endTime = System.currentTimeMillis();
        System.out.println("readUsingByteArray. Total Time : " + (endTime-startTime));

    }

    public void readFullFileUsingByteArray() throws Exception {

        Long startTime = System.currentTimeMillis();

        byte[] byteArray = new byte[bufferedInputStream.available()];

        int byteLen = bufferedInputStream.read(byteArray);
        Log.printByte(byteArray, byteLen);

        Long endTime = System.currentTimeMillis();
        System.out.println("readFullFileUsingByteArray. Total Time : " + (endTime-startTime));

    }

    public void readUsingByteArrayOffset() throws Exception {

        Long startTime = System.currentTimeMillis();

        byte[] byteArray = new byte[3];

        int byteLen;
        while ((byteLen = bufferedInputStream.read(byteArray, 0, byteArray.length)) != -1){
            Log.printByte(byteArray, byteLen);
        }

        Long endTime = System.currentTimeMillis();
        System.out.println("readUsingByteArrayOffset. Total Time : " + (endTime-startTime));
    }

    public void close() throws Exception {
        bufferedInputStream.close();
    }

}
