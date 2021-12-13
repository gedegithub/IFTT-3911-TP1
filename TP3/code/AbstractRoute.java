public abstract class AbstractRoute {

	protected String route_id;
	protected float price;
	private Date departureDate;
	private Date arrivalDate;
	private Time departureTime;
	private Time arrivalTime;

	public String getRoute_id() {
		return this.route_id;
	}

	public float getPrice() {
		return this.price;
	}

	public Date getDepartureDate() {
		return this.departureDate;
	}

	public Date getArrivalDate() {
		return this.arrivalDate;
	}

	public Time getDepartureTime() {
		return this.departureTime;
	}

	public Time getArrivalTime() {
		return this.arrivalTime;
	}

	/**
	 * 
	 * @param v
	 */
	public void accept(AbstractRoute v) {
		// TODO - implement AbstractRoute.accept
		throw new UnsupportedOperationException();
	}

}