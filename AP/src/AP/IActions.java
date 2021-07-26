package AP;

public abstract interface IActions {

	abstract Object add();

	/**
	 * 
	 * @param id
	 */
	abstract boolean edit(String id);

	/**
	 * 
	 * @param id
	 */
	abstract boolean delete(String id);

	/**
	 * 
	 * @param name
	 */
	abstract void searchByName(String name);

	abstract void viewAll();

}