package com.ty.oneToOneBi.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pan {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	private String panNumber;
	private String fatherName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	@Override
	public String toString() {
		return "Pan [\nid=" + id + ", \npanNumber=" + panNumber + ", \nfatherName=" + fatherName + "]";
	}

}
