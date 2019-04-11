package jatinhibernate.sthibernate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
//@Table(name="alien_new")//it is used to add new table in a database
public class Alien {

	@Id
	private int aid;

	private String aname;
	
	private String color;
//
	//@Temporal(TemporalType.DATE)//it is used to insert only date
	@Temporal(TemporalType.TIME)//it is used to insert only time
	private Date currentdate;
	//@OneToOne
	//private laptop Laptop;
//	@OneToMany
//	private List<laptop> Laptop=new ArrayList<laptop>();
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
	
	
//	public List<laptop> getLaptop() {
//		return Laptop;
//	}
//	public void setLaptop(List<laptop> laptop) {
//		Laptop = laptop;
//	}
	
	
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + aname + ", color=" + color + "]";
	}
	public Date getCurrentdate() {
		return currentdate;
	}
	public void setCurrentdate(Date currentdate) {
		this.currentdate = currentdate;
	}
	
	
}
