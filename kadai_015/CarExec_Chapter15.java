package kadai_015;

public class CarExec_Chapter15 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// ギアと速度を生成
		Car_Chapter15 gear = new Car_Chapter15(1, 10);
		
		// ギア3に変更
		gear.gearChange(3);
		
		// コンソールにギアと速度を出力
		gear.run();
	}

}
