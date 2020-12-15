import java.util.*;
public class T10 {
    public static void main(String[] args){
      ArrayList<String> list = new ArrayList<String>();
        try {
            int i=0;
            while(true) {
                list.add(String.valueOf(i++).intern());
                System.out.println(i);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


