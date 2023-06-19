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

        int totalSize = 0;
        while (bufferedInputStream.read() != -1){
            totalSize++;
        }

        Long endTime = System.currentTimeMillis();

        System.out.println("readSingleByte. Size : " + totalSize + " Total Time : " + (endTime-startTime));

    }

    public void readUsingByteArray(byte[] byteArray) throws Exception {

        Long startTime = System.currentTimeMillis();

        int byteLen;
        int totalSize = 0;
        while ((byteLen = bufferedInputStream.read(byteArray)) != -1){
            totalSize = totalSize + byteLen;
        }

        Long endTime = System.currentTimeMillis();
        System.out.println("readUsingByteArray. Size : " + totalSize + " Total Time : " + (endTime-startTime));

    }

    public void readFullFileUsingByteArray() throws Exception {

        Long startTime = System.currentTimeMillis();

        byte[] byteArray = new byte[bufferedInputStream.available()];

        int totalSize = bufferedInputStream.read(byteArray);

        Long endTime = System.currentTimeMillis();
        System.out.println("readFullFileUsingByteArray. Size : " + totalSize + " Total Time : " + (endTime-startTime));

    }

    public void readUsingByteArrayOffset() throws Exception {

        Long startTime = System.currentTimeMillis();

        byte[] byteArray = new byte[3];

        int byteLen;
        int totalSize = 0;
        while ((byteLen = bufferedInputStream.read(byteArray, 0, byteArray.length)) != -1){
           totalSize = totalSize + byteLen;
        }

        Long endTime = System.currentTimeMillis();
        System.out.println("readUsingByteArrayOffset. Size : " + totalSize + " Total Time : " + (endTime-startTime));
    }

    public void close() throws Exception {
        bufferedInputStream.close();
    }

}
