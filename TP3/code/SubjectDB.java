import java.util.*;

public interface SubjectDB {

	Collection<Observer> getObservers();

	/**
	 * 
	 * @param o
	 */
	void attach(Observer o);

	/**
	 * 
	 * @param o
	 */
	void detach(Observer o);

	void notifyObservers();

}