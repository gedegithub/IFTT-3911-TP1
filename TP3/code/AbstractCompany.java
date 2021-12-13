public abstract class AbstractCompany {

	private String name;
	private String line_id;

	/**
	 * 
	 * @param name
	 */
	public void updateCompany(String name) {
		// TODO - implement AbstractCompany.updateCompany
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param line_id
	 */
	public void deleteCompany(String line_id) {
		// TODO - implement AbstractCompany.deleteCompany
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

}