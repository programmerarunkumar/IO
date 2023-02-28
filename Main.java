package IO;

public class Main {

    private static void fileInputStream() throws Exception{

        String filePath = "/Users/arun-zt455/GitHub/JAVA/sample.txt";

        FileInputStream fileInputStream = new FileInputStream(filePath);

        fileInputStream.isMarkSupported();

        fileInputStream.readUsingSingleByte();

        fileInputStream.readFullFileUsingByteArray();

        fileInputStream.readUsingByteArray(new byte[3]);

        fileInputStream.readUsingByteArrayOffset();

    }

    public static void main(String[] args) throws Exception {

        fileInputStream();

        return;

    }

}
