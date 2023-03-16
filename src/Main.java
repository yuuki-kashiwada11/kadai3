import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, String> gymleader = new HashMap<>();
        gymleader.put("カエデ", "むし");
        gymleader.put("ナンジャモ", "でんき");
        gymleader.put("アオキ", "ノーマル");
        gymleader.put("グルーシャ", "こおり");

        System.out.println("アオキは" + gymleader.get("アオキ") + "タイプのジムリーダーです。");

        try {
            if(gymleader.get("チリ") != null) {
                System.out.println("チリは" + gymleader.get("チリ") + "タイプのジムリーダーです。");
            } else {
                throw new NullPointerException();
            }
        } catch (NullPointerException e) {
            System.out.println("チリはジムリーダーではありません。");
        }
    }
}