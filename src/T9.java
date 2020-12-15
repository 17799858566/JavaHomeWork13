import java.util.Scanner;

public class T9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String bin=in.nextLine();
        System.out.println(bin2Dec(bin));
    }
    public class BinaryFormatException extends Exception{
        public BinaryFormatException(){}
        public BinaryFormatException(String msg){
            super(msg);
        }
    }
    public static String bin2Dec(String bin){
        int num=0;
        try{
            for(int i=0;i<bin.length();i++){
                if(bin.charAt(i)=='0'||bin.charAt(i)=='1')
                    num+=(bin.charAt(i)-48)*Math.pow(2,bin.length()-1-i);
                else
                    throw new Exception("BinaryFormatException");
            }
        }
        catch (Exception e){
            return e.getMessage();
        }
        return Integer.toString(num);
    }
}
