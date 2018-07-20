package demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity
public class Country {
	@Id
	@GeneratedValue
	Long id;
	String name;
	String i18nName;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getI18nName() {
		return i18nName;
	}
	public void setI18nName(String i18nName) {
		this.i18nName = i18nName;
	}
	
}
