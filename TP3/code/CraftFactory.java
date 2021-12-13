public class CraftFactory extends AbstractFactory {
	private static CraftFactory instance;

	private CraftFactory() {
		// TODO - implement CraftFactory.CraftFactory
		throw new UnsupportedOperationException();
	}
	public static CraftFactory getInstance() {
		if(instance == null) return new CraftFactory();
		return instance;
	}

	/**
	 * 
	 * @param builder
	 */
	public AbstractCraft createCraft(CraftBuilder builder) {
		// TODO - implement CraftFactory.createCraft
		throw new UnsupportedOperationException();
	}
	public AbstractCraft createPlane() {
		PlaneBuilder builder = new PlaneBuilder();
		return builder.getCraft();
	}

	public AbstractCraft createShip() {
		TrainBuilder builder = new TrainBuilder();
		return builder.getCraft();
	}

	public AbstractCraft createTrain() {
		ShipBuilder builder = new ShipBuilder();
		return builder.getCraft();
	}
}