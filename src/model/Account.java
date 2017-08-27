package model;

public class Account {
	private String name;
	private String password;
	/**
	 * @return the name
	 */
	public final String getName() {
		return name;
	}
	/**
	 * @param name 
	 *           the name to set
	 */
	public final void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the password
	 */
	public final String getPassword() {
		return password;
	}
	/**
	 * @param password 
	 *           the password to set
	 */
	public final void setPassword(String password) {
		this.password = password;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Account [name=" + name + ", password=" + password + "]";
	}
	

}
