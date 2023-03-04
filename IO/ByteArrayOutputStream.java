package IO.IO;

import java.io.FileOutputStream;

public class ByteArrayOutputStream {

    private java.io.ByteArrayOutputStream byteArrayOutputStream;

    ByteArrayOutputStream(){
        byteArrayOutputStream = new java.io.ByteArrayOutputStream();
    }

    public void writeSingeByte() throws Exception {

        String data = "Hi Hello Im ArunKumar MP.";
        byte[] byteArray = data.getBytes();

        for(int i=0; i<byteArray.length; i++){
            byteArrayOutputStream.write(byteArray[i]);
        }

        byte[] output = byteArrayOutputStream.toByteArray();
        Log.printByte(output);

    }

    public void writeUsingByteArray() throws Exception {

        String data = "Hi Hello Im ArunKumar MP.";
        byte[] byteArray = data.getBytes();

        byteArrayOutputStream.write(byteArray);

        byte[] output = byteArrayOutputStream.toByteArray();
        Log.printByte(output);

    }

    public void writeUsingByteArrayOffset() throws Exception {

        String data = "Hi Hello Im ArunKumar MP.";
        byte[] byteArray = data.getBytes();

        for(int i=0; i<byteArray.length; i++){
            byteArrayOutputStream.write(byteArray, i, 1);
        }

        byte[] output = byteArrayOutputStream.toByteArray();
        Log.printByte(output);

    }

    public void writeTo() throws Exception {

        FileOutputStream fileOutputStream1 = new FileOutputStream("/Users/arun-zt455/GitHub/JAVA/IO/sample1.txt");
        FileOutputStream fileOutputStream2 = new FileOutputStream("/Users/arun-zt455/GitHub/JAVA/IO/sample2.txt");

        String data = "Hi Hello Im ArunKumar MP";
        byte[] byteArray = data.getBytes();

        byteArrayOutputStream.write(byteArray);

        byteArrayOutputStream.writeTo(fileOutputStream1);
        byteArrayOutputStream.writeTo(fileOutputStream2);

        fileOutputStream1.close();
        fileOutputStream2.close();

    }

    public void close() throws Exception {
        this.byteArrayOutputStream.close();
    }

}
