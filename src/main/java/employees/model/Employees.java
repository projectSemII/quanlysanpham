package employees.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employees")
public class Employees {
	@Id
	@Column(name = "empl_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int emplId;
	@Column(name = "empl_name")
	private String emplName;
	@Column(name = "gender")
	private boolean gender;
	@Column(name = "birthday")
	private Date birthday;
	@Column(name = "address")
	private String address;
	@Column(name = "department")
	private String department;
	@Column(name = "position")
	private String position;
	@Column(name = "salary")
	private float salary;
	public int getEmplId() {
		return emplId;
	}
	public void setEmplId(int emplId) {
		this.emplId = emplId;
	}
	public String getEmplName() {
		return emplName;
	}
	public void setEmplName(String emplName) {
		this.emplName = emplName;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public Employees() {
		// TODO Auto-generated constructor stub
	}
	public Employees(int emplId, String emplName, boolean gender, Date birthday, String address, String department,
			String position, float salary) {
		super();
		this.emplId = emplId;
		this.emplName = emplName;
		this.gender = gender;
		this.birthday = birthday;
		this.address = address;
		this.department = department;
		this.position = position;
		this.salary = salary;
	}
	
	
}
