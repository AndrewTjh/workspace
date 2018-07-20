package demo.vo;

import demo.model.User;

public class UserVo {
	Long id;
	String email;
	String phone;
	String password;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void merge(User user) {
		if (email != null) {
			user.setEmail(email);
		}
		if (phone != null) {
			user.setPhone(phone);
		}
		if (password != null) {
			user.setPassword(password);
		}
	}
}
