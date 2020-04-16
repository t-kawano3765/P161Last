package hiandblow;

public class mainhiandblow {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		creatrandom cratrandom = new creatrandom();

		int [] rsno = cratrandom.creatRandom();

		System.out.println("");
		for ( int i : rsno) {	
			System.out.print(i);

		}
	}

}
