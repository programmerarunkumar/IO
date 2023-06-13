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

        int totalSize = 0;
        while (fileInputStream.read() != -1){
            totalSize++;
        }

        Long endTime = System.currentTimeMillis();
        System.out.println("readUsingSingleByte. Size : " + totalSize + " Time : " + (endTime-startTime));

    }

    public void readUsingByteArray() throws Exception{

        byte[] byteArray = new byte[5];
        Long startTime = System.currentTimeMillis();

        int byteLen;
        int totalSize = 0;
        while ((byteLen = fileInputStream.read(byteArray)) != -1){
            totalSize = totalSize + byteLen;
        }

        Long endTime = System.currentTimeMillis();
        System.out.println("readUsingByteArray. Size : " + totalSize + " Time : " + (endTime-startTime));

    }

    public void readFullFileUsingByteArray() throws Exception {

        byte[] byteArray =  new byte[fileInputStream.available()];

        Long startTime = System.currentTimeMillis();

        int byteLen = fileInputStream.read(byteArray);

        Long endTime = System.currentTimeMillis();
        System.out.println("readFullFileUsingByteArray. Size : " + byteLen + " Total Time : " + (endTime-startTime));

    }

    public void readUsingByteArrayOffset() throws Exception{

        byte[] byteArray = new byte[5];

        Long startTime = System.currentTimeMillis();

        int bytesLen;
        int totalSize = 0;
        while ((bytesLen = fileInputStream.read(byteArray, 0 ,byteArray.length)) != -1){
           totalSize = totalSize + bytesLen;
        }

        Long endTime = System.currentTimeMillis();
        System.out.println("readUsingByteArrayOffset. Size : " + totalSize + " Time : " + (endTime-startTime));

    }

    public void close() throws Exception {
        fileInputStream.close();
    }

}
