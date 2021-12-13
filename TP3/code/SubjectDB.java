import java.util.*;

public interface SubjectDB {

	Collection<Observer> getObservers();

	/**
	 * 
	 * @param o
	 */
	void attach(Ovserver o);

	/**
	 * 
	 * @param o
	 */
	void detach(Observer o);

	void notify();

}