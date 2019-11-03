package tp_sqli_challenge_train;

public class PassengerTrain extends TrainDecorator {

	public PassengerTrain(Wagon wagon) {
		super(wagon);
	}

	@Override
	public String print() {
		return "|OOOO|";
	}

}
