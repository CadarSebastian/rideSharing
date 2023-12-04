
public class Scooter extends Vehicle {

	 private int chargeLevel;

	    public Scooter(Mediator mediator, int chargeLevel) {
	        super(mediator);
	        this.chargeLevel = chargeLevel;
	    }

	    @Override
	    public void sendNotification(String event) {
	        mediator.notify(this);
	    }

	    
	public int getChargeLevel() {
			return chargeLevel;
		}

	@Override
	public void notify(Vehicle vehicle) {
		// TODO Auto-generated method stub

	}

	

}
