package kadai_018;

abstract public class Kato_Chapter18 {
	
	public String familyName; //姓を表す
	public String givenName;  //名を表す
	public String address;    //住所を表す
	
	
	public void commonIntroduce() {
		//familyName と address の情報を出力(変数に格納)
		familyName = "加藤";
		address = "東京都中野区〇×";
		
		
		//共通の紹介を出力
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
	}
	
	//個別の紹介を出力(抽象メソッド)
	abstract public void eachIntroduce();
	
	//紹介を実行する
	public void execIntroduce() {
		//共通の紹介を実行
		commonIntroduce();
		
		//個別の紹介を実行
		eachIntroduce();
		
		//改行
		System.out.println();
	}

}
