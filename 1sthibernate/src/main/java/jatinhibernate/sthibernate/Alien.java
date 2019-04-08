package jatinhibernate.sthibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
//@Table(name="alien_new")//it is used to add new table in a database
public class Alien {

	@Id
	private int aid;
	//@Transient//it is used to no data store in a sqecific column
	private String aname;
	//@Column(name="diff_color")//it is used to add new column and replace old column value to new column value 
	private String color;
	public int getAid() {
		
	
		return aid;
		
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", color=" + color + "]";
	}
	
	
}
