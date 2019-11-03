package tp_sqli_challenge_train;

public class main {

	public static void main(String[] args) {
		Train train = new Train("HCC");
		train.fill();
		System.out.println(train.print());
		train.fill();
		System.out.println(train.print());
		
	}

}
