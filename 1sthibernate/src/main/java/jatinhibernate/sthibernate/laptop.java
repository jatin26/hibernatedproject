package jatinhibernate.sthibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class laptop {
@Id	
	private int id;
	private String names;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	@Override
	public String toString() {
		return "laptop [id=" + id + ", names=" + names + "]";
	}
	
	
	
}
