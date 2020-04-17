package hiandblow;

public class mainhiandblow {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		creatrandom cratrandom = new creatrandom();

		int [] rsno = cratrandom.creatRandom();
	
//		if(rsno[1]==rsno[2]&&rsno[2]==rsno[3]&&rsno[3]==rsno[4]) {

			for ( int i : rsno) {	
				System.out.print(i);		
			}
	}
}
