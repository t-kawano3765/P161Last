package hiandblow;

import java.util.Scanner;

public class Comparsiontest {
	int inputno[] = new int[4];
	int ransu[] = new int[4];

	@SuppressWarnings("unused")
	public int[] comParsion(int[] randomno) {
		int a, b, c, y, j, x, z;
		ransu = randomno;
		//	
		int count = 0;

		for (b = 0; b <= 10; b++) { //10回繰り返す
			//			System.out.println("ただいまのプレイ回数"+count);
			if (b != 11) {
            System.out.print("乱数は");
				for (y = 0; y < 4; y++) {
					System.out.print("    " + ransu[y]);
				}
				System.out.println("    です。");

				System.out.println("各4桁の数字を1~８の値を入力して下さい");

				for (j = 0; j < 4; j++) {
					Scanner scan = new Scanner(System.in);
					inputno[j] = scan.nextInt();
				}
				if (inputno[0] == 0 || inputno[1] == 0 || inputno[2] == 0 || inputno[3] == 0) {
					System.out.println("1~8の値を入力して下さい。");
					continue;
				} else if (inputno[0] > 9 || inputno[1] > 9 || inputno[2] > 9 || inputno[3] > 9) {
					System.out.println("各4桁の数字を1~８の値を入力して下さい");
					continue;

				}

				System.out.println("あなたが入力した値は");
				for (x = 0; x < 4; x++) {
					System.out.print("   " + inputno[x]);

				}
				System.out.println("   です。");

				System.out.println(b + "GamePlay中です。");

				if (b == 10) {
					System.out.println("Game Overです。");

				}

			}
			//System.out.println("1GamePlay+b+”です。");

			for (a = 1;; a++) {
				if (randomno[a] == inputno[a]) {
					count = a++;
					System.out.println(a);
					System.out.println("ゴールドは" + count + "です");
					break;
					}
				else if (randomno[a] == inputno[a]) {
					
				}
               if (a<6) {
            	   break;
               }


		
		

					
					
			
			for (a=0 ; ; a++) {
				if(randomno[a]==inputno[a]&& randomno[1]==inputno[1] && randomno[2]==inputno[2]&& randomno[3]==inputno[3]) {
					System.out.println("ゴールド4つです");
					break;
				}
				else if(randomno[0] == inputno[0] && randomno[1]==inputno[1] && randomno[3]==inputno[3] ) {
					System.out.println("ゴールド3つです");
					break;
				}
				else if(randomno[0] == inputno[0] && randomno[1]==inputno[1] && randomno[2]==inputno[2] ) {
					System.out.println("ゴールド3つです");
					break;
				}
				else if(randomno[0] == inputno[0] && randomno[2]==inputno[2] && randomno[3]==inputno[3] ) {
					System.out.println("ゴールド3つです");
					break;
				}

				else if(randomno[0] == inputno[0] && randomno[3]==inputno[3] ) {
					System.out.println("ゴールド2つです");
					break;
				}
				else if(randomno[0] == inputno[0] && randomno[2]==inputno[2]) {
					System.out.println("ゴールド2つです");
					break;
				}
				else if(randomno[0] == inputno[0] && randomno[1]==inputno[1]) {
					System.out.println("ゴールド2つです");
					break;
				}

				else if(randomno[0]==inputno[0] ) {
					System.out.println("ゴールド1つです");
					break;
				}
				else if( randomno[0]==inputno[1] || randomno[0]==inputno[2] ||  randomno[0]==inputno[3]) {
					System.out.println("シルバー1つです");	
					break;

				}
               
				else if( randomno[1]==inputno[1] && randomno[2]==inputno[2]&& randomno[3]==inputno[3]) {
					System.out.println("ゴールド3つです");	
					break;
				}
				else if( randomno[1]==inputno[1] && randomno[3]==inputno[3]) {
					System.out.println("ゴールド2つです");	
					break;
				}
				else if( randomno[1]==inputno[1] && randomno[2]==inputno[2]) {
					System.out.println("ゴールド2つです");	
					break;
				}

				else if( randomno[1]==inputno[1] ) {
					System.out.println("ゴールド1つです");	
					break;
				}

				else if( randomno[2]==inputno[2] && randomno[3]==inputno[3]) {
					System.out.println("ゴールド2つです");	
					break;

				}
				else if( randomno[2]==inputno[2] ) {
					System.out.println("ゴールド1つです");	
					break;

				}
				else if( randomno[3]==inputno[3] ) {
					System.out.println("ゴールド1つです");	
					break;
				}
			}


			}
		}
		return randomno;
	}	
}