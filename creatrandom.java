package hiandblow;

import java.util.Random;

public class creatrandom {

	private static final int rsno = 0;

	/*---------------------------------------------------------------------
	要素数が４つの配列を作成して重複しないようにする仕組みを考える
	---------------------------------------------------------------------*/
	public int creatRandom() { //creatRandomメソッド

		int i, y, j; // forで使用する各変数の宣言
		int ransu1, ransu2, ransu3, ransu4; //生成する乱数を入れる箱
		int kakutei1 = 0;
		int kakutei2;
		int kakutei3;
		int kakutei4;

		Random random = new Random();
		int[] Array = new int[4];

		for (i = 0;; i++) { //繰り返し ループ
			ransu1 = random.nextInt(8);//randomメソッドで乱数作成して変数ransu1に代入する。0-7
			ransu1 = ransu1 + 1; //0-7に対して+1する。
			if (ransu1>0) {
			kakutei1 =ransu1;
			
			//System.out.println("乱数１="+ransu1);
			ransu2 = random.nextInt(8); //乱数生成２個目０-７
			ransu2 = ransu2 + 1; //乱数0-7に対して+1する。
			if (ransu1 != ransu2) { //条件ransu1とransu2が同じでない時
				kakutei2 = ransu2; //変数ransuu2の値を変数kakutei2に代入
			//System.out.println("乱数2="+ransu2);
				ransu3 = random.nextInt(8);//乱数生成２個目０-７
				ransu3 = ransu3 + 1; //乱数0-7に対して+1する。
				if (ransu3 != ransu2 && ransu3 != ransu1) {//条件ransu３とransu2が同じでない時かつransu３とransu１が同じでない時
					kakutei3 = ransu3; //変数ransuu2の値を変数kakutei2に代入
				//System.out.println("乱数3="+ransu3);
					ransu4 = random.nextInt(8);//乱数生成２個目０-７
					ransu4 = ransu4 + 1; //乱数0-7に対して+1する。
					if (ransu4 != ransu3 && ransu4 != ransu2 && ransu4 != ransu1) {//条件ransu３とransu2が同じでない時かつransu３とransu１が同じでない時
						kakutei4 = ransu4; //変数ransuu2の値を変数kakutei2に代入
					//System.out.println("乱数4="+ransu4);
						Array[0] = kakutei1;
						Array[1] = kakutei2;
						Array[2] = kakutei3;
						Array[3] = kakutei4;
                      System.out.println(Array.length);
						for ( y= 0; y<=Array.length;y++) {
							System.out.println("配列出力"+Array[y]);
						System.out.println("配列0  ;"+Array[0]);
						System.out.println("配列１  ;"+Array[1]);
						System.out.println("配列2  ;"+Array[2]);
						System.out.println("配列3  ;"+Array[3]);

						for (int  rsno : Array) {
//						for (int  j=0 ; j<Array.length; j++) {
							
			            System.out.println("一個前"+rsno);
							//System.out.println(Array[y]);
			    		return rsno;
						}					
						}
						
					}
					}
				}	
			}
		}

		//		for (i = 0; i < 4; i++) {
		//			int rno = random.nextInt(7);
		//			rno = rno + 1;
		//			Array[i] = rno;
		//			if (Array[0]!=Array[1]&&Array[0]!=Array[2]) {
		//			System.out.print(Array[i]);
		//		}
		//		}
	}
	}