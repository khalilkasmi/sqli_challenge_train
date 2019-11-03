 package tp_sqli_challenge_train;

public class TrainHead extends TrainDecorator {

	public TrainHead(Wagon wagon) {
		super(wagon);
	}

	@Override
	public String print() {
		return "<HHHH";
	}

}
