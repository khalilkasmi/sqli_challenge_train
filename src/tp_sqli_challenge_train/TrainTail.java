package tp_sqli_challenge_train;

public class TrainTail extends TrainDecorator {

	public TrainTail(Wagon wagon) {
		super(wagon);
	}

	@Override
	public String print() {
		return "HHHH>";
	}

}
