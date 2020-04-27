package hiandblow;

import java.util.Random;

public class creatrandom {

	/*---------------------------------------------------------------------
	要素数が４つの配列を作成して重複しないようにする仕組みを考える
	---------------------------------------------------------------------*/
	public int[] creatRandom() { //creatRandomメソッド  戻り値が配列の為単位をあわせて指定

		int i, y, j; // forで使用する各変数の宣言
		int ransu1, ransu2, ransu3, ransu4; //生成する乱数を入れる箱
		int kakutei1 = 0; //生成した乱数を確定させる箱１
		int kakutei2; //生成した乱数を確定させる箱２
		int kakutei3; //生成した乱数を確定させる箱３
		int kakutei4; //生成した乱数を確定させる箱4

		Random random = new Random(); //ランダムメソッドのインスタンス化
		int[] Array = new int[4]; //要素を４つ持つ配列を変数Arrayで宣言

		for (i = 0;; i++) { //繰り返し ループ
			ransu1 = random.nextInt(8);//randomメソッドで乱数作成して変数ransu1に代入する。0-7
			ransu1 = ransu1 + 1; //0-7に対して+1して1-8にする。
			if (ransu1 != 0) { //条件ransu1が0以外なら
				Array[0] = ransu1; //配列Arrayの0にransu1の値を代入
			}

			ransu2 = random.nextInt(8);//0-7に対して+1するして1-8にする。
			ransu2 = ransu2 + 1; // //0-7に対して+1して1-8にする。
			if (ransu1 == ransu2) {//条件ransu1がransu2が異なる状態なら35行目の条件に進む
				continue;//条件ransu1がransu2と同じ時は２９行目戻り乱数の再生成、
			} else if (ransu2 != 0) { //条件ransu2の値が0以外なら
				Array[1] = ransu2; //ransu2の値をArray[1]に値を代入する
			}

			ransu3 = random.nextInt(8);//randomメソッドで乱数作成して変数ransu1に代入する。0-7
			ransu3 = ransu3 + 1; // //0-7に対して+1して1-8にする。
			if (ransu1 == ransu2 || ransu2 == ransu3 || ransu1 == ransu3) { //左記３パターンの内1パターンでも該当しない場合43行目に進む
				continue; //左記３パターンのどれか該当する場合46行目を実行する
			} else if (ransu3 != 0) { //条件ransu3の値が0以外なら
				Array[2] = ransu3; //ransu3の値をArray[2]に代入する
			}

			ransu4 = random.nextInt(8);//randomメソッドで乱数作成して変数ransu1に代入する。0-7
			ransu4 = ransu4 + 1; //0-7に対して+1する。
			if (ransu1 == ransu2 || ransu1 == ransu3 || ransu1 == ransu4 || ransu2 == ransu3 || ransu2 == ransu4
					|| ransu3 == ransu4) {//左記パターンの内1パターンでも該当しなければ52行目進む
				continue;
			} else if (ransu4 != 0) { //ransu4の値が0以外なら
				Array[3] = ransu4; //ransu4の値をArray[3]に代入する
				break; //ここまでの処理が進んできたら繰り返しを抜ける
			}
		}
		return Array; //配列をそのまま戻り値としてメインメソッドに戻す
	}
}