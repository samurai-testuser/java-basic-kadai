package kadai_018;

abstract public class KatoExec_Chapter18 extends Kato_Chapter18 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//各自のオブジェクトの生成
		KatoTaro_Chapter18 Taro = new KatoTaro_Chapter18();
		KatoHanako_Chapter18 Hanako = new KatoHanako_Chapter18();
		KatoIchiro_Chapter18 Ichiro = new KatoIchiro_Chapter18();
		
		//各自の名(givenName)をセット
		Taro.setGivenName();
		Hanako.setGivenName();
		Ichiro.setGivenName();
		
		//各自の紹介を実行
		Taro.execIntroduce();
		Hanako.execIntroduce();
		Ichiro.execIntroduce();
		
	}

}
