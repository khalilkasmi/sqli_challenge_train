package tp_sqli_challenge_train;

public class FilledCargoTrain extends TrainDecorator {

	public FilledCargoTrain(Wagon wagon) {
		super(wagon);
	}

	@Override
	public String print() {
		return "|^^^^|";
	}

}
