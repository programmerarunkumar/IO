package IO.IO;

import java.io.InputStream;

public class FileInputStream {

    public void isMarkSupported() throws Exception {

        InputStream fileInputStream = new java.io.FileInputStream(Constant.INPUT_IMAGE);

        boolean isMarkSupported = fileInputStream.markSupported();
        System.out.println("isMarkSupported : " + isMarkSupported);

        fileInputStream.close();

    }

    public void available() throws Exception {

        InputStream fileInputStream = new java.io.FileInputStream(Constant.INPUT_IMAGE);

        int available = fileInputStream.available();
        System.out.println("available : " + available);

        fileInputStream.close();

    }

    public void readSingleByte() throws Exception {

        InputStream fileInputStream = new java.io.FileInputStream(Constant.INPUT_IMAGE);

        Long startTime = System.currentTimeMillis();

        int totalSize = 0;
        while (fileInputStream.read() != -1){
            totalSize++;
        }

        Long endTime = System.currentTimeMillis();
        System.out.println("readSingleByte. Size : " + totalSize + " Time : " + (endTime-startTime));

        fileInputStream.close();

    }

    public void readUsingByteArray() throws Exception{

        InputStream fileInputStream = new java.io.FileInputStream(Constant.INPUT_IMAGE);

        byte[] byteArray = new byte[5];
        Long startTime = System.currentTimeMillis();

        int byteLen;
        int totalSize = 0;
        while ((byteLen = fileInputStream.read(byteArray)) != -1){
            totalSize = totalSize + byteLen;
        }

        Long endTime = System.currentTimeMillis();
        System.out.println("readUsingByteArray. Size : " + totalSize + " Time : " + (endTime-startTime));

        fileInputStream.close();

    }

    public void readFullFileUsingByteArray() throws Exception {

        InputStream fileInputStream = new java.io.FileInputStream(Constant.INPUT_IMAGE);

        byte[] byteArray =  new byte[fileInputStream.available()];

        Long startTime = System.currentTimeMillis();

        int byteLen = fileInputStream.read(byteArray);

        Long endTime = System.currentTimeMillis();
        System.out.println("readFullFileUsingByteArray. Size : " + byteLen + " Total Time : " + (endTime-startTime));

        fileInputStream.close();

    }

    public void readUsingByteArrayOffset() throws Exception{

        InputStream fileInputStream = new java.io.FileInputStream(Constant.INPUT_IMAGE);

        byte[] byteArray = new byte[5];

        Long startTime = System.currentTimeMillis();

        int bytesLen;
        int totalSize = 0;
        while ((bytesLen = fileInputStream.read(byteArray, 0 ,byteArray.length)) != -1){
           totalSize = totalSize + bytesLen;
        }

        Long endTime = System.currentTimeMillis();
        System.out.println("readUsingByteArrayOffset. Size : " + totalSize + " Time : " + (endTime-startTime));

        fileInputStream.close();

    }

}
