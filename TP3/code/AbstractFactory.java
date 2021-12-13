public abstract class AbstractFactory {

	private AbstractFactory factoryInstance;

	public AbstractSatation createSation() {
		// TODO - implement AbstractFactory.createSation
		throw new UnsupportedOperationException();
	}

	public AbstractCompany createCompany() {
		// TODO - implement AbstractFactory.createCompany
		throw new UnsupportedOperationException();
	}

	public AbstractRoute createRoute() {
		// TODO - implement AbstractFactory.createRoute
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param builder
	 */
	public AbstractCraft createCraft(CraftBuilder builder) {
		// TODO - implement AbstractFactory.createCraft
		throw new UnsupportedOperationException();
	}

	public AbstractFactory getInstance() {
		// TODO - implement AbstractFactory.getInstance
		throw new UnsupportedOperationException();
	}

}