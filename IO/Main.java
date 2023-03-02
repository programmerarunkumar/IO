package IO.IO;

public class Main {

    private static void fileInputStream() throws Exception{

        String filePath = "/Users/arun-zt455/GitHub/JAVA/IO/sampleInput.txt";

        FileInputStream fileInputStream = new FileInputStream(filePath);
        fileInputStream.isMarkSupported();

        fileInputStream = new FileInputStream(filePath);
        fileInputStream.readSingleByte();

        fileInputStream = new FileInputStream(filePath);
        fileInputStream.readUsingByteArray(new byte[3]);

        fileInputStream = new FileInputStream(filePath);
        fileInputStream.readFullFileUsingByteArray();

        fileInputStream = new FileInputStream(filePath);
        fileInputStream.readUsingByteArrayOffset();

    }

    private static void fileOutputStream() throws Exception {

        String filePath = "/Users/arun-zt455/GitHub/JAVA/IO/sampleOutput.txt";

        FileOutputStream fileOutputStream = new FileOutputStream(filePath);

        fileOutputStream.writeUsingSingleByte();

        fileOutputStream.writeUsingByteArray();

        fileOutputStream.writeUsingByteArrayOffset();

    }

    private static void byteArrayInputStream() throws Exception {

        String input = "Hi Hello Im ArunKumar MP";

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(input);
        byteArrayInputStream.isMarkSupported();
        byteArrayInputStream.close();

        byteArrayInputStream = new ByteArrayInputStream(input);
        byteArrayInputStream.available();
        byteArrayInputStream.close();

        byteArrayInputStream = new ByteArrayInputStream(input);
        byteArrayInputStream.readSingleByte();
        byteArrayInputStream.close();

        byteArrayInputStream = new ByteArrayInputStream(input);
        byteArrayInputStream.markAndReset();
        byteArrayInputStream.close();

        byteArrayInputStream = new ByteArrayInputStream(input);
        byteArrayInputStream.readUsingByteArray(new byte[3]);
        byteArrayInputStream.close();

        byteArrayInputStream = new ByteArrayInputStream(input);
        byteArrayInputStream.readFullFileUsingByteArray();
        byteArrayInputStream.close();

        byteArrayInputStream = new ByteArrayInputStream(input);
        byteArrayInputStream.readUsingByteArrayOffset();
        byteArrayInputStream.close();

    }

    public static void main(String[] args) throws Exception {

        fileInputStream();

        fileOutputStream();

        byteArrayInputStream();

        return;

    }

}
