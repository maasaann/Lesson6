
public class test {

    public static void main(String[] args) {

        //文字の長さ
        String s = "abc";
        System.out.println(s.length());

        //数字をも文字列に変換
        Integer i = 12345;
        String ss = i.toString();
        System.out.println(ss.length());

        //文字列を数字に変換
        System.out.println(123 + Integer.parseInt("456"));
        System.out.println(1.1 + Double.parseDouble("0.1"));
        
    }

}
