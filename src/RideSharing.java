import java.util.ArrayList;
import java.util.List;

import javax.tools.JavaFileManager.Location;

public class RideSharing implements Mediator {
	public	 int  distance;
	private List<Car> availableCars = new ArrayList<>();
    private List<Scooter> availableScooters = new ArrayList<>();
    
    public void addCar(Car car) {
        availableCars.add(car);
    }

    public void addScooter(Scooter scooter) {
        availableScooters.add(scooter);
    }
	

    public List<Car> findAvailableCars(Location distanceToCurrentLocation) {
    	for (Car car : availableCars) {
            if (!car.isInAnotherTrip()) {
                availableCars.add(car);
            }
        }

       
    	 return availableCars.subList(0, Math.min(3, availableCars.size()));
    }
    
    public List<Scooter> findAvailableScooters(int chargeLevel) {
    	//100%=10 000m 			50%= 5 000m
    	for (Scooter scooter : availableScooters) {
            if (scooter.getChargeLevel()>(distance/100)/2) {
                availableScooters.add(scooter);
            }
        }

      
        return availableScooters.subList(0, Math.min(3, availableScooters.size()));
    }
	

	
	@Override
	public void notify(Vehicle vehicle) {
		
		System.out.println("Thank you for using our Services");

	}
	
}
