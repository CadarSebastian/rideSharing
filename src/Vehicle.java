
public abstract class Vehicle implements Mediator {

	protected Mediator mediator;

    public Vehicle(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void sendNotification(String event);

}
