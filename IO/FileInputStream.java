package IO.IO;

import java.io.InputStream;

public class FileInputStream {

    private InputStream fileInputStream;

    FileInputStream(String filePath) throws Exception{
        this.fileInputStream = new java.io.FileInputStream(filePath);
    }

    public void isMarkSupported() throws Exception {

        boolean isMarkSupported = fileInputStream.markSupported();
        fileInputStream.close();

        System.out.println("isMarkSupported : " + isMarkSupported);

    }

    //read()
    public void readSingleByte() throws Exception {

        Long startTime = System.currentTimeMillis();

        int data = fileInputStream.read();
        while (data != -1){
            Log.printByte(data);
            data = fileInputStream.read();
        }
        fileInputStream.close();

        Long endTime = System.currentTimeMillis();
        System.out.println("readUsingSingleByte. Total Time : " + (endTime-startTime));

    }

    //int read(byte[])
    public void readUsingByteArray(byte[] byteArray) throws Exception{

        Long startTime = System.currentTimeMillis();

        int byteLen;
        while ((byteLen = fileInputStream.read(byteArray)) != -1){
            Log.printByte(byteArray, byteLen);
        }
        fileInputStream.close();

        Long endTime = System.currentTimeMillis();
        System.out.println("readUsingByteArray. Total Time : " + (endTime-startTime));

    }

    //int read(byte[])
    public void readFullFileUsingByteArray() throws Exception {

        byte[] byteArray =  new byte[fileInputStream.available()];

        Long startTime = System.currentTimeMillis();

        int byteLen = fileInputStream.read(byteArray);

        for(int i = 0; i<byteLen; i++){
            Log.printByte(byteArray[i]);
        }
        fileInputStream.close();

        Long endTime = System.currentTimeMillis();
        System.out.println("readFullFileUsingByteArray. Total Time : " + (endTime-startTime));

    }

    //int read(byte[], int offset, int length)
    public void readUsingByteArrayOffset() throws Exception{

        byte[] byteArray = new byte[3];

        Long startTime = System.currentTimeMillis();

        int bytesRead;
        while ((bytesRead = fileInputStream.read(byteArray, 0 ,byteArray.length)) != -1){
            Log.printByte(byteArray, bytesRead);
        }
        fileInputStream.close();

        Long endTime = System.currentTimeMillis();
        System.out.println("readUsingByteArrayOffset. Total Time : " + (endTime-startTime));

    }

}
