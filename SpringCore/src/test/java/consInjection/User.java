package consInjection;

public class User {
	private int id;
	private long contact;
	private String name;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(int id, long contact, String name) {
		super();
		this.id = id;
		this.contact = contact;
		this.name = name;
	}


	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		System.out.println("setting contact");
		this.contact = contact;
	}

	public int getId() {
		System.out.println("getting id");
		return id;
	}

	public void setId(int id) {
		System.out.println("setting id");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("setting adderss");
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", contact=" + contact + "]";
	}

}
