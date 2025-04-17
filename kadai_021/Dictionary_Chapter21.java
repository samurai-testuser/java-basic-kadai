package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	//HashMapの宣言
	HashMap<String, String> dictionary;

	//辞書(dictionary)にwordを登録する
	public void setHashMap() {
		dictionary = new HashMap<>();;
		dictionary.put("apple", "りんご");
		dictionary.put("peach", "桃");
		dictionary.put("banana", "バナナ");
		dictionary.put("lemon", "レモン");
		dictionary.put("pear", "梨");
		dictionary.put("kiwi", "キウィ");
		dictionary.put("strawberry", "いちご");
		dictionary.put("grape", "ぶどう");
		dictionary.put("muscat", "マスカット");
		dictionary.put("cherry", "さくらんぼ");
	}
	
	public String getHashMap(String key) {
		//呼出し元に辞書の値を返す
		return dictionary.get(key);
	}
	
}
