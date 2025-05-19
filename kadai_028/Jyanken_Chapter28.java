package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {

	// 自分のじゃんけんの手を入力するクラス
	public String getMyChoice() {
		
		// 自分の出すじゃんけんの手の初期化
		String myHand = "";

		// Scannerクラスのオブジェクトを生成
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		
		do {
		// 入力した内容を取得する
		myHand = scanner.next();
		
			// 正しいじゃんけんの手であるか判定する
			if (!(myHand.equals("r")) && !(myHand.equals("s")) && !(myHand.equals("p"))) {
				// r, s, p 以外の入力の場合、エラーメッセージを表示する。
				System.out.println("Error: じゃんけんの手は、g(グー),s(チョキ),p(パー)を入力してください");
			}
			
		// 正しいじゃんけんの手であればループ終了
		} while (!(myHand.equals("r")) && !(myHand.equals("s")) && !(myHand.equals("p")));
		
		// scannerクラスのクローズ
		scanner.close();
		
		// 入力した値を返す
		return myHand;
	}
	
	// 対戦相手のじゃんけんを取得するクラス
	public String getRandom() {
		// じゃんけんのグー(r)、チョキ(s)、パー(p)を配列に格納
		String[] handArray = {"r", "s", "p"};
		
		// 乱数で対戦相手のじゃんけんの手を選ぶ
		int num = (int)Math.floor(Math.random() * 3);
		
		// じゃんけんクラスを実行するクラスに、対戦相手のじゃんけんの手を返す
		return handArray[num];
	}
	
	// じゃんけんを行うクラス
	public void playGame(String myHand, String otherHand) {
		// playGameメソッドのキー
		HashMap<String,String> hashMap = new HashMap<String,String>();
		hashMap.put("r", "グー");
		hashMap.put("s", "チョキ");
		hashMap.put("p", "パー");
		
		// 自分と対戦相手の手を出力
		System.out.println("自分の手は" + hashMap.get(myHand) + ",対戦相手の手は" + hashMap.get(otherHand));
		// 自分と相手のじゃんけんの手の比較
		if (myHand.equals(otherHand)) {
			// 自分と対戦相手の手が同じ場合
			System.out.println("あいこです");
		} else
			// 自分の勝ちのパt－ン
			if (myHand.equals("r") && otherHand.equals("s") ||
				   myHand.equals("s") && otherHand.equals("p") ||
				   myHand.equals("p") && otherHand.equals("r")) {
				   System.out.println("自分の勝ちです");
		} else {
			// 上記以外であれば、自分の負け
			System.out.println("自分の負けです");
		}
		
	}
}
