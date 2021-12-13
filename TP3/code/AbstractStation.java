public abstract class AbstractStation {

	private String name;
	private String id;
	private String ville;

	/**
	 * 
	 * @param name
	 */
	public void updateStation(String name) {
		// TODO - implement AbstractStation.updateStation
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param station_id
	 */
	public void deleteStation(int station_id) {
		// TODO - implement AbstractStation.deleteStation
		throw new UnsupportedOperationException();
	}

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public String getID() {
		// TODO - implement AbstractStation.getID
		throw new UnsupportedOperationException();
	}

	public void setID() {
		// TODO - implement AbstractStation.setID
		throw new UnsupportedOperationException();
	}

	public String getVille() {
		return this.ville;
	}

	public void setVille() {
		// TODO - implement AbstractStation.setVille
		throw new UnsupportedOperationException();
	}

}