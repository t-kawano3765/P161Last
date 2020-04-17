package hiandblow;

import java.util.Random;

public class creatrandom {

/*---------------------------------------------------------------------
	要素数が４つの配列を作成して重複しないようにする仕組みを考える
	---------------------------------------------------------------------*/
	public int[] creatRandom() { //creatRandomメソッド  戻り値が配列の為単位をあわせて指定

		int i, y, j; // forで使用する各変数の宣言
		int ransu1, ransu2, ransu3, ransu4; //生成する乱数を入れる箱
		int kakutei1=0; //生成した乱数を確定させる箱１
		int kakutei2;  //生成した乱数を確定させる箱２
		int kakutei3;  //生成した乱数を確定させる箱３
		int kakutei4;  //生成した乱数を確定させる箱4

		Random random = new Random();
		int[] Array = new int[4]; //要素を４つ持つ配列を変数Arrayで宣言

		for (i = 0;; i++) { //繰り返し ループ
			ransu1 = random.nextInt(8);//randomメソッドで乱数作成して変数ransu1に代入する。0-7
			ransu1 = ransu1 + 1; //0-7に対して+1する。
			if (ransu1!=0) { //条件ransu1が０以外なら
				Array[0]  =ransu1; //配列Arrayの０にransu1の値を代入
			}
			//System.out.println("乱数１="+ransu1);
			ransu2 = random.nextInt(8); //乱数生成２個目０-７
			ransu2 = ransu2 + 1; //乱数0-7に対して+1する。
			if ( ransu2!=0||ransu1 != ransu2) { //条件ransu1とransu2が同じでない時
				Array[1] = ransu2; //変数ransuu2の値を変数kakutei2に代入
			}

			//System.out.println("乱数2="+ransu2);
			ransu3 = random.nextInt(8);//乱数生成２個目０-７
			ransu3 = ransu3 + 1; //乱数0-7に対して+1する。
			//if (ransu3 != ransu2 && ransu3 != ransu1&& ransu3!=0) {//条件ransu３とransu2が同じでない時かつransu３とransu１が同じでない時
			if (ransu3 != ransu2 && ransu3 != ransu1|| ransu3!=0) {//条件ransu３とransu2が同じでない時かつransu３とransu１が同じでない時	
			Array[2] = ransu3; //変数ransuu2の値を変数kakutei2に代入		 
			}	
			//System.out.println("乱数3="+ransu3);
			ransu4 = random.nextInt(8);//乱数生成２個目０-７
			ransu4 = ransu4 + 1; //乱数0-7に対して+1する。
			if (ransu4!=0 || ransu4 != ransu3 && ransu4 != ransu2 && ransu4 != ransu1) {//条件ransu３とransu2が同じでない時かつransu３とransu１が同じでない時
				Array[3] = ransu4; //変数ransuu2の値を変数kakutei2に代入
			}	


			return Array;  //配列をそのまま戻り値として指定
		}

	}
}