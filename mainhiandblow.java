package hiandblow;

public class mainhiandblow {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
/*---------------------------------------------------------------------------------------------------------
1.	要素数が４つの配列を作成して重複しないようにするコードを作成する。
２．入力された数と、配列の中の数と場所とが一致しているかどうかを判断する
     コードを作成する。
---------------------------------------------------------------------------------------------------------*/
		System.out.println("数当てゲームを始めます。");
		System.out.println("各4桁の数字が重複しないように1~８の値を入力して下さい");

		creatrandom cratrandom = new creatrandom(); //クリエートランダムのインスタンス化

		int[] rsno = cratrandom.creatRandom(); //creatRandom();メソッドへのメッセージと戻り値（戻り値）を入れる変数rsnoの宣言

		Comparsiontest comparsion = new Comparsiontest(); //Comparsionクラスのインスタンス化

		int[] hikaku = comparsion.comParsion(rsno); //comParsionのメッセージと引数の設定

	}
}