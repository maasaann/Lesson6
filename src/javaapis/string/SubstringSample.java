package javaapis.string;

public class SubstringSample {

    public static void main(String[] args) {
        String str = "あいうえお";
        String sub = str.substring(1, 3); //0から始まり、3の前＝2で停止なので、1い と 2う
        System.out.println(sub);
    }

}
