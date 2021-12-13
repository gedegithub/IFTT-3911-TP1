import java.util.Collection;
import java.util.List;

public class DataStructureRoute implements SubjectDB {

	private List<AbstractRoute> routes;
	private SeatState state;

	public List<AbstractRoute> getRoutes() {
		// TODO - implement DataStructureRoute.getRoutes
		throw new UnsupportedOperationException();
	}

	public SeatState getState() {
		return this.state;
	}

	/**
	 * 
	 * @param state
	 */
	public void setState(int state) {
		// TODO - implement DataStructureRoute.setState
		throw new UnsupportedOperationException();
	}

	@Override
	public Collection<Observer> getObservers() {
		return null;
	}


	@Override
	public void attach(Observer o) {

	}

	@Override
	public void detach(Observer o) {

	}

	@Override
	public void notifyObservers() {

	}
}