package hiandblow;
import java.util.Scanner;
public class Comparsion {
	int inputno[]=new int[4];
	int ransu[]=new int[4];
	public int[]  comParsion(int []randomno){
		int a,b,y,j,x,z;
		ransu = randomno;
		//	
		for (y=0; y<4; y++) {
			System.out.print("    "+ransu[y]);
		}
		System.out.println("");

		System.out.println("各4桁の数字を1~８の値を入力して下さい");


		for (j=0; ; j++) { 
			Scanner scan = new Scanner(System.in);
			inputno [j] = scan.nextInt();
			if (inputno[0]==0||inputno[1]==0||inputno[2]==0||inputno[3]==0) {
				System.out.println("1~8の値を入力して下さい。");
				continue;
			}
			else if (inputno[0]>9||inputno[1]>9||inputno[2]>9||inputno[3]>9) {
				System.out.println("各4桁の数字を1~８の値を入力して下さい");
				continue;
			}
			//			else
			//
			//				break;
			//		}
			System.out.print("あなたが入力した値は");
			for(x=0; x<inputno.length; x++) {
				System.out.print("   "+inputno[x]);

			}
			System.out.println("   です。");   

			for (a=0 ; ; a++) {
				if(randomno[0]==inputno[0]&& randomno[1]==inputno[1] && randomno[2]==inputno[2]&& randomno[3]==inputno[3]) {
					System.out.println("ゴールド4つです");
					break;					
				}
				
				else if(randomno[0]==inputno[1] || randomno[0]==inputno[2]|| randomno[0]==inputno[3]) {
					System.out.println("シルバー1つです");
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
			return ransu;
		}

	
	}
}