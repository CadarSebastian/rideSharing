
public class Car extends Vehicle {

	
		private int distanceToCurrentLocation;
	    private boolean inAnotherTrip;

	    public Car(Mediator mediator, int distanceToCurrentLocation,boolean inAnotherTrip) {
	        super(mediator);
	        this.distanceToCurrentLocation = distanceToCurrentLocation;
	        this.inAnotherTrip = false; 
	    }

	    public void setInAnotherTrip(boolean inAnotherTrip) {
	        this.inAnotherTrip = inAnotherTrip;
	    }

	    @Override
	    public void sendNotification(String event) {
	        mediator.notify(this);
	    }

		@Override
		public void notify(Vehicle vehicle) {
			// TODO Auto-generated method stub
			
		}

		public int getDistanceToCurrentLocation() {
			return distanceToCurrentLocation;
		}

		public void setDistanceToCurrentLocation(int distanceToCurrentLocation) {
			this.distanceToCurrentLocation = distanceToCurrentLocation;
		}

		public boolean isInAnotherTrip() {
			return inAnotherTrip;
		}


	}
