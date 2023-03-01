package IO.IO;

public class Main {

    private static void fileInputStream() throws Exception{

        String filePath = "/Users/arun-zt455/GitHub/JAVA/IO/sampleInput.txt";

        FileInputStream fileInputStream = new FileInputStream(filePath);

        fileInputStream.isMarkSupported();

        fileInputStream.readUsingSingleByte();

        fileInputStream.readFullFileUsingByteArray();

        fileInputStream.readUsingByteArray(new byte[3]);

        fileInputStream.readUsingByteArrayOffset();

    }

    private static void fileOutputStream() throws Exception {

        String filePath = "/Users/arun-zt455/GitHub/JAVA/IO/sampleOutput.txt";

        FileOutputStream fileOutputStream = new FileOutputStream(filePath);

        fileOutputStream.writeUsingSingleByte();

        fileOutputStream.writeUsingByteArray();

        fileOutputStream.writeUsingByteArrayOffset();

    }

    public static void main(String[] args) throws Exception {

        fileInputStream();

        fileOutputStream();

        return;

    }

}
