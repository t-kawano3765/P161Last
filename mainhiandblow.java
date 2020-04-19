package hiandblow;

public class mainhiandblow {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		creatrandom cratrandom = new creatrandom(); //クリエートランダムのインスタンス化

		int [] rsno = cratrandom.creatRandom(); //creatRandom();メソッドへのメッセージと戻り値（戻り値）を入れる変数rsnoの宣言


		for ( int i : rsno) {	 //creatRandom();メソッドからの戻り値、変数iに配列rsnoの値を順番に代入
			System.out.print(i+"   ");	  //変数iの値をっ出力する。
		}
	}
}
