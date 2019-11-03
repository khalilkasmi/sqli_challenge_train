package tp_sqli_challenge_train;

import java.util.ArrayList;

public class Train {

	private ArrayList<Wagon> wagons;

	public Train(String wagons) {
		super();
		this.wagons = new ArrayList<Wagon>();
		for (int i = 0; i < wagons.length(); i++) {
			if (wagons.charAt(i) == 'H') {
				if (i == 0) {
					this.wagons.add(new TrainHead(new EmptyWagon()));
				} else {
					this.wagons.add(new TrainTail((new EmptyWagon())));
				}
			} else if (wagons.charAt(i) == 'P') {
				this.wagons.add(new PassengerTrain(new EmptyWagon()));
			} else if (wagons.charAt(i) == 'R') {
				this.wagons.add(new RestaurantTrain(new EmptyWagon()));
			} else if (wagons.charAt(i) == 'C') {
				this.wagons.add(new CargoTrain(new EmptyWagon()));
			}
		}
	}

	public String print() {
		String finalShape = "";
		for (int i = 0; i < wagons.size(); i++) {
			if (i == wagons.size() - 1)
				finalShape = finalShape + wagons.get(i).print();
			else
				finalShape = finalShape + wagons.get(i).print() + "::";
		}
		return finalShape;
	}

	public void detachEnd() {
		wagons.remove(wagons.size() - 1);
	}

	public void detachHead() {
		wagons.remove(0);
	}

	public boolean fill() {
		int i = 0 ; 
		boolean isFilled = false;
		for (Wagon wagon : wagons) {
			if (wagon instanceof CargoTrain) {
				wagons.set(i,new FilledCargoTrain(new EmptyWagon()));
				isFilled = true;
				break;
			}
			i++;
		}
		return isFilled;
	}

	public ArrayList<Wagon> getWagons() {
		return wagons;
	}

	public void setWagons(ArrayList<Wagon> wagons) {
		this.wagons = wagons;
	}

}

