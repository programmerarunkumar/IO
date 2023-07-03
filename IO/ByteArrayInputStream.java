package IO.IO;

import java.io.FileInputStream;
import java.io.InputStream;

public class ByteArrayInputStream {

    private static byte[] byteArr;

    ByteArrayInputStream() throws Exception {
        InputStream inputStream = new FileInputStream(Constant.INPUT_IMAGE);
        byteArr = new byte[inputStream.available()];
        inputStream.close();
    }

    public void isMarkSupported() throws Exception {

        InputStream byteArrayInputStream = new java.io.ByteArrayInputStream(byteArr);

        boolean isMarkSupported = byteArrayInputStream.markSupported();
        System.out.println("isMarkSupported : " + isMarkSupported);

        byteArrayInputStream.close();

    }

    public void available() throws Exception {

        InputStream byteArrayInputStream = new java.io.ByteArrayInputStream(byteArr);

        int available = byteArrayInputStream.available();
        System.out.println("available : " + available);

        byteArrayInputStream.close();

    }

    public void readSingleByte() throws Exception {

        InputStream byteArrayInputStream = new java.io.ByteArrayInputStream(byteArr);

        long startTime = System.currentTimeMillis();

        int totalSize = 0;
        while (byteArrayInputStream.read() != -1){
            totalSize++;
        }

        long endTime = System.currentTimeMillis();
        System.out.println("readSingleByte.Size : " + totalSize + " Total Time : " + (endTime-startTime));

        byteArrayInputStream.close();

    }

    public void readUsingByteArray() throws Exception {

        InputStream byteArrayInputStream = new java.io.ByteArrayInputStream(byteArr);

        byte[] byteArray = new byte[5];

        long startTime = System.currentTimeMillis();

        int byteLen;
        int totalSize = 0;
        while ((byteLen = byteArrayInputStream.read(byteArray)) != -1){
            totalSize = totalSize + byteLen;
        }

        long endTime = System.currentTimeMillis();

        System.out.println("readUsingByteArray. Size : " + totalSize + " Total Time : " + (endTime-startTime));

        byteArrayInputStream.close();

    }

    public void readFullFileUsingByteArray() throws Exception {

        InputStream byteArrayInputStream = new java.io.ByteArrayInputStream(byteArr);
        byte[] byteArray = new byte[byteArrayInputStream.available()];

        long startTime = System.currentTimeMillis();
        int byteLen = byteArrayInputStream.read(byteArray);
        long endTime = System.currentTimeMillis();

        System.out.println("readFullFileUsingByteArray. Size : " + byteLen + " Total Time : " + (endTime-startTime));

        byteArrayInputStream.close();

    }

    public void readUsingByteArrayOffset() throws Exception {

        InputStream byteArrayInputStream = new java.io.ByteArrayInputStream(byteArr);

        byte[] byteArray = new byte[5];

        long startTime = System.currentTimeMillis();

        int byteLen;
        int totalSize = 0;
        while ((byteLen = byteArrayInputStream.read(byteArray, 0, byteArray.length)) != -1){
            totalSize = totalSize + byteLen;
        }

        long endTime = System.currentTimeMillis();

        System.out.println("readUsingByteArrayOffset. Size : " + totalSize + " Total Time : " + (endTime-startTime));

    }

}
