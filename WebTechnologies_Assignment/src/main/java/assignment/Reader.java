package assignment;

import java.util.Set;

public class Reader {
    private int readerId;
    private String email;
    private String firstName;
    private String lastName;
    private Set<Subscription> subscriptions;
	public int getReaderId() {
		return readerId;
	}
	public void setReaderId(int readerId) {
		this.readerId = readerId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Set<Subscription> getSubscriptions() {
		return subscriptions;
	}
	public void setSubscriptions(Set<Subscription> subscriptions) {
		this.subscriptions = subscriptions;
	}
	@Override
	public String toString() {
		return "Reader [readerId=" + readerId + ", email=" + email + ", firstName=" + firstName + ", lastName="
				+ lastName + ", subscriptions=" + subscriptions + "]";
	}

}

