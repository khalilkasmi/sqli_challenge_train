package tp_sqli_challenge_train;

public class RestaurantTrain extends TrainDecorator {

	public RestaurantTrain(Wagon wagon) {
		super(wagon);
	}

	@Override
	public String print() {
		return "|hThT|";
	}

}
