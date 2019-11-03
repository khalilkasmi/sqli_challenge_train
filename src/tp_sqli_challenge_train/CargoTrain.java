package tp_sqli_challenge_train;

public class CargoTrain extends TrainDecorator {

	public CargoTrain(Wagon wagon) {
		super(wagon);
	}

	@Override
	public String print() {
		return "|____|";
	}

}
