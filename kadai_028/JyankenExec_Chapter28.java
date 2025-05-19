package kadai_028;

public class JyankenExec_Chapter28 {
	
	// じゃんけんを実行するクラス
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// rock-paper-scissors(じゃんけん)インスタンス佐生政
		Jyanken_Chapter28 rps = new Jyanken_Chapter28();
		
		// 自分の手を取得
		String myHand = rps.getMyChoice();

		// 対戦相手の手を取得
		String otherHand = rps.getRandom();
		
		// じゃんけんを行う
		rps.playGame(myHand, otherHand);
	}

}
