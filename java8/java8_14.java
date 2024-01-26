package test.java8;

import java.util.HashMap;
import java.util.Map;

class Sample8_14 {
    public static void main(String[] args){
        Map<String, String> vegetable_dict = new HashMap<String, String>() {
            {
                put("野菜　　" , "季節");
                put("キャベツ" , "春");
                put("スイカ　" , "夏");
                put("ナス　　" , "秋");
                put("ハクサイ" , "冬");
            }
        };
        for (Map.Entry<String, String> entry : vegetable_dict.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

