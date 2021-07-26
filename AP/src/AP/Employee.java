package AP;
import java.util.Date;
public abstract class Employee {

	private String id;
	private String name;
	private Date dob;
	private String address;
	private int phone;
	private Department department;

	public String getId() {
		return this.id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
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

	public Date getDob() {
		return this.dob;
	}

	/**
	 * 
	 * @param dob
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return this.address;
	}

	/**
	 * 
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhone() {
		return this.phone;
	}

	/**
	 * 
	 * @param phone
	 */
	public void setPhone(int phone) {
		this.phone = phone;
	}

	public Department getDepartment() {
		return this.department;
	}

	/**
	 * 
	 * @param department
	 */
	public void setDepartment(Department department) {
		this.department = department;
	}

	public abstract void showInfor();

}