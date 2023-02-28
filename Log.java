package IO;

public class Log {

    private static final boolean IS_LOG_ENABLED = false;

    public static void printByte(byte data){
        if(!IS_LOG_ENABLED){
            return;
        }
        System.out.println(data + " : " + (char)data);
    }

    public static void printByte(int data){
        if(!IS_LOG_ENABLED){
            return;
        }
        System.out.println(data + " : " + (char)data);
    }

    public static void printByte(byte[] data, int len){
        if(!IS_LOG_ENABLED){
            return;
        }

        System.out.println("Data Length : " + len);
        for(int i = 0; i<len; i++){
            System.out.println(data[i] + " : " + (char)data[i]);
        }
    }

}
