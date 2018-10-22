package org.java.data;

public class Name implements Cloneable {
	private String firstName;
	private char mi;
	private String lastName;

	/** Construct a name with default properties */
	public Name() {
		this("Jill", 'S', "Barr");
	}

	/** Construct a name with firstName, mi, and lastName */
	public Name(String firstName, char mi, String lastName) {
		this.firstName = firstName;
		this.mi = mi;
		this.lastName = lastName;
	}

	/** Return firstName */
	public String getFirstName() {
		return firstName;
	}

	/** Set a new firstName */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/** Return middle name initial */
	public char getMi() {
		return mi;
	}

	/** Set a new middlename initial */
	public void setMi(char mi) {
		this.mi = mi;
	}

	/** Return lastName */
	public String getLastname() {
		return lastName;
	}

	/** Set a new lastName */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/** Obtain full name */
	public String getFullName() {
		return firstName + ' ' + mi + ' ' + lastName;
	}
}
