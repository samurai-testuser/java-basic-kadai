package kadai_015;

public class Car_Chapter15 {
	// フィールド (内部データ)
	private int gear  = 1; // ギア
	private int speed = 1; // 速度
	private int beforeGear = gear; // ギアチェンジ前のギア  
	
	// コンストラクタ (初期化処理)
	public Car_Chapter15( int gear, int speed ) {
		this.gear  = gear;
		this.speed = speed; 
	}
	
	// 【メソッド】ギアの値により速度を変える
	// beforeGear ギアチェンジ前の値
	// afterGear ギアチェンジ後の値
	public void gearChange ( int afterGear ) {
		beforeGear = this.gear; // ギアチェンジ前に現在のギアを格納
		this.gear = afterGear;  // ギアチェンジ
		
		// ギアが1～5の場合、速度はギア*10、それ以外のギアは速度は10
		if( afterGear >= 1 && afterGear <= 5) {
			this.speed = afterGear * 10;
		} else {
			this.speed = 10;
		}
	}
	
	public void run () {
		System.out.println("ギア" + beforeGear + "から" + this.gear + "に切り替えました");
		System.out.println("速度は時速" + this.speed + "kmです");
	}

}