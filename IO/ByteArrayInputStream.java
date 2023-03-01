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
        byteArrayInputStream.close();

        System.out.println("isMarkSupported : " + isMarkSupported);

    }

    public void available() throws Exception {

        int available = byteArrayInputStream.available();
        byteArrayInputStream.close();

        System.out.println("available : " + available);

    }

    public void read() throws Exception{

        int data = byteArrayInputStream.read();
        while (data != -1){
            Log.printByte(data);
            data = byteArrayInputStream.read();
        }
        byteArrayInputStream.close();

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
        byteArrayInputStream.close();

    }

}
