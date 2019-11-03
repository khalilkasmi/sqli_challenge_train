package tp_sqli_challenge_train;

public abstract class TrainDecorator extends Wagon {

	protected Wagon wagon;

	public TrainDecorator(Wagon wagon) {
		super();
		this.wagon = wagon;
	}

	
	
	public void setWagon(Wagon wagon) {
		this.wagon = wagon;
	}



	public Wagon getWagon() {
		return (Wagon) this.wagon;
	}
	
	public String print(){
		return "";
	}
}
