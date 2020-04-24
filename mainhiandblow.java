package hiandblow;

public class mainhiandblow {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int x;
		System.out.println("数当てゲームを始めます。");
		
		creatrandom cratrandom = new creatrandom(); //クリエートランダムのインスタンス化

		int [] rsno = cratrandom.creatRandom(); //creatRandom();メソッドへのメッセージと戻り値（戻り値）を入れる変数rsnoの宣言


		//for (int  i : rsno) {	 //creatRandom();メソッドからの戻り値、変数iに配列rsnoの値を順番に代入
			
		//System.out.print(i+"   ");	  //変数iの値をっ出力する。

//               for (int i=0; i<rsno.length; i++) {
//			   System.out.print(rsno[i]);
		    	
		Comparsiontest  comparsion =new Comparsiontest();  //Comparsionクラスのインスタンス化
			
			  int [] hikaku =  comparsion.comParsion(rsno); //comParsionのメッセージと引数の設定

			  for ( x=0; x<hikaku.length; x++) {
            //System.out.println(hikaku[x]);
//            for (int i=0; i<rsno.length; i++) { //条件  戻り値の要素数繰り返し
//			   System.out.print("最後戻り値"+rsno[i]); //変数rsnoの要素数を順番に出力する
//            }
			  }
//            for (int i=0; i<rsno.length; i++) {
//			   System.out.print(rsno[i]);
//	


}
}