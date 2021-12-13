public interface VisitorRoute {

	/**
	 * 
	 * @param flight
	 */
	void visiFlight(Flight flight);

	/**
	 * 
	 * @param trajectory
	 */
	void visitTrajectory(Trajectory trajectory);

	/**
	 * 
	 * @param itinerary
	 */
	void visitItineray(Itinerary itinerary);

}