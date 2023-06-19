package IO.IO;

import java.io.FileInputStream;

public class BufferedInputStream {

    public void isMarkSupported() throws Exception {

        FileInputStream fileInputStream = new FileInputStream(Constant.INPUT_IMAGE);
        java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(fileInputStream);

        boolean isMarkSupported = bufferedInputStream.markSupported();
        System.out.println("isMarkSupported : " + isMarkSupported);

        bufferedInputStream.close();

    }

    public void available() throws Exception{

        FileInputStream fileInputStream = new FileInputStream(Constant.INPUT_IMAGE);
        java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(fileInputStream);

        int available = bufferedInputStream.available();
        System.out.println("available : " + available);

        bufferedInputStream.close();

    }

    public void readSingleByte() throws Exception {

        FileInputStream fileInputStream = new FileInputStream(Constant.INPUT_IMAGE);
        java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(fileInputStream);

        Long startTime = System.currentTimeMillis();

        int totalSize = 0;
        while (bufferedInputStream.read() != -1){
            totalSize++;
        }

        Long endTime = System.currentTimeMillis();

        System.out.println("readSingleByte. Size : " + totalSize + " Total Time : " + (endTime-startTime));

        bufferedInputStream.close();

    }

    public void readUsingByteArray() throws Exception {

        FileInputStream fileInputStream = new FileInputStream(Constant.INPUT_IMAGE);
        java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(fileInputStream);

        byte[] byteArray = new byte[3];
        Long startTime = System.currentTimeMillis();

        int byteLen;
        int totalSize = 0;
        while ((byteLen = bufferedInputStream.read(byteArray)) != -1){
            totalSize = totalSize + byteLen;
        }

        Long endTime = System.currentTimeMillis();
        System.out.println("readUsingByteArray. Size : " + totalSize + " Total Time : " + (endTime-startTime));

        bufferedInputStream.close();

    }

    public void readFullFileUsingByteArray() throws Exception {

        FileInputStream fileInputStream = new FileInputStream(Constant.INPUT_IMAGE);
        java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(fileInputStream);

        Long startTime = System.currentTimeMillis();

        byte[] byteArray = new byte[bufferedInputStream.available()];

        int totalSize = bufferedInputStream.read(byteArray);

        Long endTime = System.currentTimeMillis();
        System.out.println("readFullFileUsingByteArray. Size : " + totalSize + " Total Time : " + (endTime-startTime));

        bufferedInputStream.close();

    }

    public void readUsingByteArrayOffset() throws Exception {

        FileInputStream fileInputStream = new FileInputStream(Constant.INPUT_IMAGE);
        java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(fileInputStream);

        Long startTime = System.currentTimeMillis();

        byte[] byteArray = new byte[3];

        int byteLen;
        int totalSize = 0;
        while ((byteLen = bufferedInputStream.read(byteArray, 0, byteArray.length)) != -1){
           totalSize = totalSize + byteLen;
        }

        Long endTime = System.currentTimeMillis();
        System.out.println("readUsingByteArrayOffset. Size : " + totalSize + " Total Time : " + (endTime-startTime));

        bufferedInputStream.close();

    }

}
