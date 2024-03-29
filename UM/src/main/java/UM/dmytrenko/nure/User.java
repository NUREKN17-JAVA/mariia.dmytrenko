package UM.dmytrenko.nure;

import java.util.Calendar;
import java.util.Date;

public class User {
	private Long id;
	private String firstName;
	private String LastName;
	private String Phone;
	private String Email;
	private String Contry;
	private String Adress;
	

	public User(String firstName, String lastName, Date date) {
		this.firstName = firstName;	
		this.LastName = lastName;
		this.DateOfBirth = date;
		}

	public User(Long id, String firstName, String lastName, Date date) {
		this.id = id;
		this.firstName = firstName;	
		this.LastName = lastName;
		this.DateOfBirth = date;
	}

	public User() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getContry() {
		return Contry;
	}

	public void setContry(String contry) {
		Contry = contry;
	}

	public String getAdress() {
		return Adress;
	}

	public void setAdress(String adress) {
		Adress = adress;
	}

	public Date getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	private Date DateOfBirth;
	
	public String getFullName() {
		return getLastName()+ ", " + getFirstName();
	}

	public int getAge() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		int currentYear = calendar.get(Calendar.YEAR);
		calendar.setTime(getDateOfBirth());
		int year = calendar.get(Calendar.YEAR);
		return currentYear - year;
	}

	public String getFullInformation() {
		return getFirstName()+ ", " + getLastName() + " " + getContry() + " " + getAdress() + " " +  getPhone() + ", " + getEmail();
	}

	public String getContact() {
		return getFirstName()+ ", " + getLastName() + " " + getPhone() + ", " + getEmail();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (this == obj){
			return true;
		}
		if (this.getId() == null && ((User) obj).getId() == null) {
			return true;
		}
		return this.getId().equals(((User) obj).getId());
	}

	@Override
	public int hashCode() {
		if (this.getId() == null) {
			return 0;
		}
		return this.getId().hashCode();
	}

	
	
}
