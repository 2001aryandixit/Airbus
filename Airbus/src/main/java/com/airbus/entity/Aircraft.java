package com.airbus.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Aircraft {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long aircraft_id;
    private String part_name;
    private String material_composition;
    private String aircraft_model;
    private String manufacturer;
    private String potential_use_cases;
    private int age_years;
    private String condition;
    private String location;
	public Long getAircraft_id() {
		return aircraft_id;
	}
	public void setAircraft_id(Long aircraft_id) {
		this.aircraft_id = aircraft_id;
	}
	public String getPart_name() {
		return part_name;
	}
	public void setPart_name(String part_name) {
		this.part_name = part_name;
	}
	public String getMaterial_composition() {
		return material_composition;
	}
	public void setMaterial_composition(String material_composition) {
		this.material_composition = material_composition;
	}
	public String getAircraft_model() {
		return aircraft_model;
	}
	public void setAircraft_model(String aircraft_model) {
		this.aircraft_model = aircraft_model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getPotential_use_cases() {
		return potential_use_cases;
	}
	public void setPotential_use_cases(String potential_use_cases) {
		this.potential_use_cases = potential_use_cases;
	}
	public int getAge_years() {
		return age_years;
	}
	public void setAge_years(int age_years) {
		this.age_years = age_years;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Aircraft(Long aircraft_id, String part_name, String material_composition, String aircraft_model,
			String manufacturer, String potential_use_cases, int age_years, String condition, String location) {
		super();
		this.aircraft_id = aircraft_id;
		this.part_name = part_name;
		this.material_composition = material_composition;
		this.aircraft_model = aircraft_model;
		this.manufacturer = manufacturer;
		this.potential_use_cases = potential_use_cases;
		this.age_years = age_years;
		this.condition = condition;
		this.location = location;
	}
	public Aircraft() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
