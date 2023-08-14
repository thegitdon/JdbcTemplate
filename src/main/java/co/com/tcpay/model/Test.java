package co.com.tcpay.model;

public class Test {

	private long id;
	private String uname;
	private int weight;
	private boolean published;

	public Test() {
	}

	public Test(long id, String uname, int weight, boolean published) {
		this.id = id;
		this.uname = uname;
		this.weight = weight;
		this.published = published;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public boolean isPublished() {
		return published;
	}

	public void setPublished(boolean published) {
		this.published = published;
	}

	@Override
	public String toString() {
		return "Test [id=" + id + ", uname=" + uname + ", weight=" + weight + ", published=" + published + "]";
	}

}
