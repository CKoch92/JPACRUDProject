package com.skilldistillery.jpamenu.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Winebottle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="label_name")
	private String labelName;
	private String vineyard;
	private int vintage;
	private String varietal;
	private String type;
	private String country;
	private String state;
	private String region;
	private double price;
	
	public Winebottle() {}

	

	public Winebottle(String labelName, String vineyard, int vintage, String varietal, String type, String country,
			String state, String region, double price) {
		super();
		this.labelName = labelName;
		this.vineyard = vineyard;
		this.vintage = vintage;
		this.varietal = varietal;
		this.type = type;
		this.country = country;
		this.state = state;
		this.region = region;
		this.price = price;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLabelName() {
		return labelName;
	}

	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}

	public String getVineyard() {
		return vineyard;
	}

	public void setVineyard(String vineyard) {
		this.vineyard = vineyard;
	}

	public int getVintage() {
		return vintage;
	}

	public void setVintage(int vintage) {
		this.vintage = vintage;
	}

	public String getVarietal() {
		return varietal;
	}

	public void setVarietal(String varietal) {
		this.varietal = varietal;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	
	}

	@Override
	public String toString() {
		return "Winebottle [id=" + id + ", labelName=" + labelName + ", vineyard=" + vineyard + ", vintage=" + vintage
				+ ", varietal=" + varietal + ", type=" + type + ", country=" + country + ", state=" + state
				+ ", region=" + region + ", price=" + price + "]";
	}


	
	
	
	
	

}
