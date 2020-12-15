import java.util.Scanner;

public class T8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String hex=in.nextLine();
        System.out.println(hexToDec(hex.toUpperCase()));
    }
    public class HexFormatException extends Exception{
        public HexFormatException(){}
        public HexFormatException(String msg){
            super(msg);
        }
    }
    public static String hexToDec(String x){
        int num=0;
        try{
            for(int i=0;i<x.length();i++){
                if(!((x.charAt(i)<='F'&&x.charAt(i)>='A')||(x.charAt(i)<='9'&&x.charAt(i)>='0'))){
                    throw new Exception("HexFormatException");
                }
                else{
                    if(x.charAt(i)<='9'&&x.charAt(i)>='0')
                        num+=(x.charAt(i)-48)*Math.pow(16,x.length()-1-i);
                    else if(x.charAt(i)<='F'&&x.charAt(i)>='A')
                        num+=(x.charAt(i)-55)*Math.pow(16,x.length()-1-i);
                }
            }
        }
        catch(Exception e){
            return e.getMessage();
        }
        return Integer.toString(num);
    }
}
