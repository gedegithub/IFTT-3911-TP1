public class RouteFactory extends AbstractFactory {
	private static RouteFactory instance;

	private RouteFactory() {
		// TODO - implement RouteFactory.RouteFactory
		throw new UnsupportedOperationException();
	}

	public static RouteFactory getInstance() {
		if(instance == null) return new RouteFactory();
		return instance;
	}

	public AbstractRoute createFlight() {
		return new Flight();
	}

	public AbstractRoute createTrajectory() {
		return new Trajectory();
	}

	public AbstractRoute createItinerary() {
		return new Itinerary();
	}

}