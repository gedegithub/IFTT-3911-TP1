/** Generated by YAKINDU Statechart Tools code generator. */
package microwave.microwave;


public class MicrowaveStatemachine implements IMicrowaveStatemachine {
	protected class SCInterfaceImpl implements SCInterface {
	
		private SCInterfaceOperationCallback operationCallback;
		
		public void setSCInterfaceOperationCallback(
				SCInterfaceOperationCallback operationCallback) {
			this.operationCallback = operationCallback;
		}
		private boolean high;
		
		
		public void raiseHigh() {
			high = true;
			runCycle();
		}
		
		private boolean low;
		
		
		public void raiseLow() {
			low = true;
			runCycle();
		}
		
		private boolean digit;
		
		private long digitValue;
		
		
		public void raiseDigit(final long value) {
			digitValue = value;
			digit = true;
			runCycle();
		}
		protected long getDigitValue() {
			if (! digit ) 
				throw new IllegalStateException("Illegal event value access. Event Digit is not raised!");
			return digitValue;
		}
		
		private boolean timer;
		
		
		public void raiseTimer() {
			timer = true;
			runCycle();
		}
		
		private boolean start;
		
		
		public void raiseStart() {
			start = true;
			runCycle();
		}
		
		private boolean stop;
		
		
		public void raiseStop() {
			stop = true;
			runCycle();
		}
		
		private boolean open;
		
		
		public void raiseOpen() {
			open = true;
			runCycle();
		}
		
		private boolean close;
		
		
		public void raiseClose() {
			close = true;
			runCycle();
		}
		
		private long power;
		
		public long getPower() {
			return power;
		}
		
		public void setPower(long value) {
			this.power = value;
		}
		
		protected void clearEvents() {
			high = false;
			low = false;
			digit = false;
			timer = false;
			start = false;
			stop = false;
			open = false;
			close = false;
		}
	}
	
	
	protected SCInterfaceImpl sCInterface;
	
	private boolean initialized = false;
	
	public enum State {
		microwave_Init,
		microwave_Operation,
		$NullState$
	};
	
	private final State[] stateVector = new State[1];
	
	private int nextStateIndex;
	
	public MicrowaveStatemachine() {
		sCInterface = new SCInterfaceImpl();
	}
	
	public void init() {
		this.initialized = true;
		if (this.sCInterface.operationCallback == null) {
			throw new IllegalStateException("Operation callback for interface sCInterface must be set.");
		}
		
		for (int i = 0; i < 1; i++) {
			stateVector[i] = State.$NullState$;
		}
		clearEvents();
		clearOutEvents();
		sCInterface.setPower(0);
	}
	
	public void enter() {
		if (!initialized) {
			throw new IllegalStateException(
				"The state machine needs to be initialized first by calling the init() function."
			);
		}
		enterSequence_Microwave_default();
	}
	
	public void runCycle() {
		if (!initialized)
			throw new IllegalStateException(
					"The state machine needs to be initialized first by calling the init() function.");
		clearOutEvents();
		for (nextStateIndex = 0; nextStateIndex < stateVector.length; nextStateIndex++) {
			switch (stateVector[nextStateIndex]) {
			case microwave_Init:
				microwave_Init_react(true);
				break;
			case microwave_Operation:
				microwave_Operation_react(true);
				break;
			default:
				// $NullState$
			}
		}
		clearEvents();
	}
	public void exit() {
		exitSequence_Microwave();
	}
	
	/**
	 * @see IStatemachine#isActive()
	 */
	public boolean isActive() {
		return stateVector[0] != State.$NullState$;
	}
	
	/** 
	* Always returns 'false' since this state machine can never become final.
	*
	* @see IStatemachine#isFinal()
	*/
	public boolean isFinal() {
		return false;
	}
	/**
	* This method resets the incoming events (time events included).
	*/
	protected void clearEvents() {
		sCInterface.clearEvents();
	}
	
	/**
	* This method resets the outgoing events.
	*/
	protected void clearOutEvents() {
	}
	
	/**
	* Returns true if the given state is currently active otherwise false.
	*/
	public boolean isStateActive(State state) {
	
		switch (state) {
		case microwave_Init:
			return stateVector[0] == State.microwave_Init;
		case microwave_Operation:
			return stateVector[0] == State.microwave_Operation;
		default:
			return false;
		}
	}
	
	public SCInterface getSCInterface() {
		return sCInterface;
	}
	
	public void raiseHigh() {
		sCInterface.raiseHigh();
	}
	
	public void raiseLow() {
		sCInterface.raiseLow();
	}
	
	public void raiseDigit(long value) {
		sCInterface.raiseDigit(value);
	}
	
	public void raiseTimer() {
		sCInterface.raiseTimer();
	}
	
	public void raiseStart() {
		sCInterface.raiseStart();
	}
	
	public void raiseStop() {
		sCInterface.raiseStop();
	}
	
	public void raiseOpen() {
		sCInterface.raiseOpen();
	}
	
	public void raiseClose() {
		sCInterface.raiseClose();
	}
	
	public long getPower() {
		return sCInterface.getPower();
	}
	
	public void setPower(long value) {
		sCInterface.setPower(value);
	}
	
	/* Entry action for state 'Init'. */
	private void entryAction_Microwave_Init() {
		sCInterface.operationCallback.clearDisplay();
		
		sCInterface.operationCallback.closeDoor();
	}
	
	/* Entry action for state 'Operation'. */
	private void entryAction_Microwave_Operation() {
		sCInterface.operationCallback.openDoor();
	}
	
	/* 'default' enter sequence for state Init */
	private void enterSequence_Microwave_Init_default() {
		entryAction_Microwave_Init();
		nextStateIndex = 0;
		stateVector[0] = State.microwave_Init;
	}
	
	/* 'default' enter sequence for state Operation */
	private void enterSequence_Microwave_Operation_default() {
		entryAction_Microwave_Operation();
		nextStateIndex = 0;
		stateVector[0] = State.microwave_Operation;
	}
	
	/* 'default' enter sequence for region Microwave */
	private void enterSequence_Microwave_default() {
		react_Microwave__entry_Default();
	}
	
	/* Default exit sequence for state Init */
	private void exitSequence_Microwave_Init() {
		nextStateIndex = 0;
		stateVector[0] = State.$NullState$;
	}
	
	/* Default exit sequence for state Operation */
	private void exitSequence_Microwave_Operation() {
		nextStateIndex = 0;
		stateVector[0] = State.$NullState$;
	}
	
	/* Default exit sequence for region Microwave */
	private void exitSequence_Microwave() {
		switch (stateVector[0]) {
		case microwave_Init:
			exitSequence_Microwave_Init();
			break;
		case microwave_Operation:
			exitSequence_Microwave_Operation();
			break;
		default:
			break;
		}
	}
	
	/* Default react sequence for initial entry  */
	private void react_Microwave__entry_Default() {
		enterSequence_Microwave_Init_default();
	}
	
	private boolean react() {
		return false;
	}
	
	private boolean microwave_Init_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (react()==false) {
				if (sCInterface.open) {
					exitSequence_Microwave_Init();
					enterSequence_Microwave_Operation_default();
				} else {
					did_transition = false;
				}
			}
		}
		return did_transition;
	}
	
	private boolean microwave_Operation_react(boolean try_transition) {
		boolean did_transition = try_transition;
		
		if (try_transition) {
			if (react()==false) {
				did_transition = false;
			}
		}
		return did_transition;
	}
	
}