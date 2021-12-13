public class CompanyFactory extends AbstractFactory {
	private static CompanyFactory instance;

	private CompanyFactory() {
		// TODO - implement CompanyFactory.CompanyFactory
		throw new UnsupportedOperationException();
	}

	public static CompanyFactory getInstance() {
		if(instance == null) return new CompanyFactory();
		return instance;
	}

	public AbstractCompany createShipLine() {
		return new ShipLine();
	}

	public AbstractCompany createAirline() {
		return new Airline();
	}

	public AbstractCompany createTrainLine() {
		return new TrainLine();
	}
}