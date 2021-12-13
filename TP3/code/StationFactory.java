public class StationFactory extends AbstractFactory {
	private static StationFactory instance;

	private StationFactory() {
		// TODO - implement StationFactory.StationFactory
		throw new UnsupportedOperationException();
	}

	public static StationFactory getInstance() {
		if(instance == null) return new StationFactory();
		return instance;
	}

	public AbstractStation createPort() {
		return new Port();
	}

	public AbstractStation createAirport() {
		return new Airport();
	}

	public AbstractStation createTrainStation() {
		return new TrainStation();
	}
}