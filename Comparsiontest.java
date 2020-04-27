package hiandblow;

import java.util.Scanner;

public class Comparsiontest {
	int inputno[] = new int[4];
	int ransu[] = new int[4];

	public int[] comParsion(int[] randomno) {
		int a, b, c, d,e,f,g,y, j, x, z;
		ransu = randomno;
		//	
		int Gcount = 0;
		int Scount = 0;

		for (a = 1; a <= 10; a++) { //繰り返しaは10回繰り返す
			//			System.out.println("ただいまのプレイ回数"+count);
			if (a > 0  && a <= 11) {   //条件 aは０より大きくかつ１１以下の正数の場合
				System.out.print("乱数は");  //左記の内容を出力する
				for (b = 0; b < 4; b++) {  //繰り返し 変数ｙを０~３の計4回繰り返す
					System.out.print("    " + ransu[b]);  //左記の変数ransuの配列の内容を出力する
				}
				System.out.println("    です。");  //左記の内容を出力する

				//System.out.println("各4桁の数字を1~８の値を入力して下さい");  //左記の内容を出力する

				for (c = 0;c < 4;c++) {  //繰り返しaは4回繰り返す
					Scanner scan = new Scanner(System.in); //スキャナクラスのインスタンス化
					inputno[c] = scan.nextInt();  //標準入力 配列変数inputno要素数はjを使用
				}
				if (inputno[0] == 0 || inputno[1] == 0 || inputno[2] == 0 || inputno[3] == 0) {   //条件：各桁の入力時どれかひとつでも０が入力された時
					System.out.println("対象外の値が入力されました。各4桁０以上、10以下の値を入力して下さい。");  //左記の内容を出力する
					continue; //条件に合致する場合は26行目に戻る
				} else if (inputno[0] > 9 || inputno[1] > 9 || inputno[2] > 9 || inputno[3] > 9) {  //条件：各桁の入力時どれかひとつでも9以上の値が入力された時
					System.out.println("対象外の値が入力されました。各4桁０以上、10以下の値を入力して下さい。");  //左記の内容を出力する
					continue; //条件に合致する場合は26行目に戻る

				}

				System.out.println("あなたが入力した値は");   //左記の内容を出力する
				for (x = 0; x < 4; x++) {  //繰り返し4回実施
					System.out.print("   " + inputno[x]);  //左記の変数inputno[x]の配列の内容を出力する

				}
				System.out.println("   です。");  //左記の内容を出力する

				System.out.println("GamePlay"+a+"回目です。");  //左記の内容を出力する

//				if (a == 10) { //条件 変数aが１０の時
//					System.out.println("Game Overです。");//左記の内容を出力する 
//					break;  //条件48行の条件に合致する場合は繰り返しから抜ける
//				}

			}
			//System.out.println("1GamePlay+b+”です。");

			//ゴールドの一致判定
			Gcount=0;  //変数countの初期値０で定義
			Scount=0;  //変数countの初期値０で定義
			for (f = 0;f<inputno.length; f++) {   //０~inputnoの要素数と同じ回数を繰り返す
				if (randomno[f] == inputno[f]) {//条件  randomno[f]==inputno[f]両方の配列の変数と変数が一致する場合
					Gcount++;  //変数カウントは1ずつ繰り返い毎に足していく
					//                    System.out.println(randomno[a]);
					//                    System.out.println (inputno[a]);
					//                    System.out.println("モニター"+count);
				}
              //シルバーの一致判定
				else if (randomno[0]==inputno[f]) {  //条件randomno[0]の値と、inputno[f]の内のどれかの要素数の値が一致する時
                     Scount++;  //
				}	
				else if (randomno[1]==inputno[f]) {
                     Scount=Scount+1;
			    }
				else if (randomno[2]==inputno[f]) {
                    Scount=Scount+1;
                }
				else if (randomno[3]==inputno[f]) {
                    Scount=Scount+1;
				}
				}
		System.out.println("<<ゴールドは" + Gcount + "です>>"); //左記の内容を出力する
	    System.out.println("<<シルバー  " + Scount + "です>>"); //左記の内容を出力する
		if(Gcount==4) {
	    System.out.println("おめでとうございます。");
		System.out.println("4つの数字全てゴールドとなった為GameEndとなります。");//左記の内容を出力する
		//break;  //65行目の条件に合致する場合は繰り返しから抜ける
		if (a == 10) { //条件 変数aが１０の時
			System.out.println("Game Overです。");//左記の内容を出力する 
			break;  //条件48行の条件に合致する場合は繰り返しから抜ける
		}

		}
		}
	//			for () {
	//			 for () {
	//			}
	//			}
	return randomno;
}	
}

			
//			for (a=0 ; ; a++) {
//				if(randomno[a]==inputno[a]&& randomno[1]==inputno[1] && randomno[2]==inputno[2]&& randomno[3]==inputno[3]) {
//					System.out.println("ゴールド4つです");
//					break;
//				}
//				else if(randomno[0] == inputno[0] && randomno[1]==inputno[1] && randomno[3]==inputno[3] ) {
//					System.out.println("ゴールド3つです");
//					break;
//				}
//				else if(randomno[0] == inputno[0] && randomno[1]==inputno[1] && randomno[2]==inputno[2] ) {
//					System.out.println("ゴールド3つです");
//					break;
//				}
//				else if(randomno[0] == inputno[0] && randomno[2]==inputno[2] && randomno[3]==inputno[3] ) {
//					System.out.println("ゴールド3つです");
//					break;
//				}
//
//				else if(randomno[0] == inputno[0] && randomno[3]==inputno[3] ) {
//					System.out.println("ゴールド2つです");
//					break;
//				}
//				else if(randomno[0] == inputno[0] && randomno[2]==inputno[2]) {
//					System.out.println("ゴールド2つです");
//					break;
//				}
//				else if(randomno[0] == inputno[0] && randomno[1]==inputno[1]) {
//					System.out.println("ゴールド2つです");
//					break;
//				}
//
//				else if(randomno[0]==inputno[0] ) {
//					System.out.println("ゴールド1つです");
//					break;
//				}
//				else if( randomno[0]==inputno[1] || randomno[0]==inputno[2] ||  randomno[0]==inputno[3]) {
//					System.out.println("シルバー1つです");	
//					break;
//
//				}
//               
//				else if( randomno[1]==inputno[1] && randomno[2]==inputno[2]&& randomno[3]==inputno[3]) {
//					System.out.println("ゴールド3つです");	
//					break;
//				}
//				else if( randomno[1]==inputno[1] && randomno[3]==inputno[3]) {
//					System.out.println("ゴールド2つです");	
//					break;
//				}
//				else if( randomno[1]==inputno[1] && randomno[2]==inputno[2]) {
//					System.out.println("ゴールド2つです");	
//					break;
//				}
//
//				else if( randomno[1]==inputno[1] ) {
//					System.out.println("ゴールド1つです");	
//					break;
//				}
//
//				else if( randomno[2]==inputno[2] && randomno[3]==inputno[3]) {
//					System.out.println("ゴールド2つです");	
//					break;
//
//				}
//				else if( randomno[2]==inputno[2] ) {
//					System.out.println("ゴールド1つです");	
//					break;
//
//				}
//				else if( randomno[3]==inputno[3] ) {
//					System.out.println("ゴールド1つです");	
//					break;
////				}
//			}


			
