package kadai_021;

import java.util.Objects;

public class DictionaryExec_Chapter21 extends Dictionary_Chapter21 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ		
		
		//検索する英単語を配列にセット
		String[] searchWordArray = {"apple", "banana", "grape", "orange"};
		
		//検索した結果の戻り値を格納
		String returnWord;
		
		//辞書のインスタンスを作成
		Dictionary_Chapter21 dictionaryIndex = new Dictionary_Chapter21();
		
		//辞書登録
		dictionaryIndex.setHashMap();
		
		//辞書検索ループ
		for (int i = 0; i < searchWordArray.length; i++) {

			//英単語を検索して、returnWordに戻り値を格納
			returnWord = dictionaryIndex.getHashMap(searchWordArray[i]);
			
			//戻り値がnullかどうかを判定
			if (Objects.equals(returnWord, null)) {
				System.out.println(searchWordArray[i]+"は辞書に存在しません");
			} else {
				System.out.println(searchWordArray[i]+"の意味は"+returnWord);
			}
		}
	}

}
