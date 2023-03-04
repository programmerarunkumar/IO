package IO.IO;

import java.io.InputStream;

public class ByteArrayInputStream {

    private InputStream byteArrayInputStream;

    ByteArrayInputStream(String input){
        byte[] byteArray = input.getBytes();
        byteArrayInputStream = new java.io.ByteArrayInputStream(byteArray);
    }

    public void isMarkSupported() throws Exception {

        boolean isMarkSupported = byteArrayInputStream.markSupported();
        System.out.println("isMarkSupported : " + isMarkSupported);

    }

    public void available() throws Exception {

        int available = byteArrayInputStream.available();
        System.out.println("available : " + available);

    }

    public void readSingleByte() throws Exception {

        int data = byteArrayInputStream.read();
        while (data != -1){
            Log.printByte(data);
            data = byteArrayInputStream.read();
        }

    }

    public void readUsingByteArray(byte[] byteArray) throws Exception {

        int readLen;
        while ((readLen = byteArrayInputStream.read(byteArray)) != -1){
            Log.printByte(byteArray, readLen);
        }

    }

    public void readFullFileUsingByteArray() throws Exception {

        byte[] byteArray = new byte[byteArrayInputStream.available()];

        int byteLen = byteArrayInputStream.read(byteArray);
        Log.printByte(byteArray, byteLen);

    }

    public void readUsingByteArrayOffset() throws Exception {

        byte[] byteArray = new byte[3];

        int byteLen;
        while ((byteLen = byteArrayInputStream.read(byteArray, 0, byteArray.length)) != -1){
            Log.printByte(byteArray, byteLen);
        }

    }

    public void markAndReset() throws Exception {

        int value;
        int count = 0;

        System.out.println("Before Reset");
        while ((value = byteArrayInputStream.read()) != -1){
            Log.printByte(value);

            if (count == 1){
                byteArrayInputStream.mark(0);
            }
            count ++;
        }
        byteArrayInputStream.reset();

        System.out.println("After Reset");

        while ((value = byteArrayInputStream.read()) != -1){
            Log.printByte(value);
        }

    }

    public void close() throws Exception {
        this.byteArrayInputStream.close();
    }

}
