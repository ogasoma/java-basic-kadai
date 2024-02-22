package kadai_020;
import java.util.HashMap;

public class Dictionary_Chapter20 {
	HashMap<String,String>  dictionary = new HashMap<String,String>();
	
    public Dictionary_Chapter20() {
	dictionary.put("apple","りんご");
	dictionary.put("peach","桃");
	dictionary.put("banana","バナナ");
	dictionary.put("lemon","レモン");
	dictionary.put("strabery","いちご");
	dictionary.put("grape","ぶどう");
	dictionary.put("muscat","マスカット");
	dictionary.put("kiwi","キウイ");
	dictionary.put("cherry","さくらんぼ");
	dictionary.put("pear","梨");
    }
    public void searchword(String word) {
    	String fruit = dictionary.get(word);
    	if (fruit  == null) {
            System.out.println(word + "は辞書に存在しません");
        } else {
            System.out.println(word + "の意味は" + fruit  );
        }
    }
}