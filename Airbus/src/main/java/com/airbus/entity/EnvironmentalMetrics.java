package com.airbus.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class EnvironmentalMetrics {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long metric_id;
    @ManyToOne
    @JoinColumn(name = "aircraft_id")
    private Aircraft aircraft;
    private double new_parts_carbon_footprint_kgCO2e;
    private double recycled_parts_carbon_footprint_kgCO2e;
    private double carbon_footprint_saved_kgCO2e;
    private double new_parts_water_usage_liters;
    private double recycled_parts_water_usage_liters;
    private double water_usage_saved_liters;
    private double new_parts_landfill_waste_kg;
    private double recycled_parts_landfill_waste_kg;
    private double landfill_waste_saved_kg;
    private double new_parts_energy_consumption_kWh;
    private double recycled_parts_energy_consumption_kWh;
    private double energy_consumption_saved_kWh;
    private double recycling_rate_percent;
    private double toxicity_score_new_parts;
    private double toxicity_score_recycled_parts;
    private double remanufacturing_potential;
    private double life_cycle_assessment_score;
    private double renewable_material_content_percent;
	public Long getMetric_id() {
		return metric_id;
	}
	public void setMetric_id(Long metric_id) {
		this.metric_id = metric_id;
	}
	public Aircraft getAircraft() {
		return aircraft;
	}
	public void setAircraft(Aircraft aircraft) {
		this.aircraft = aircraft;
	}
	public double getNew_parts_carbon_footprint_kgCO2e() {
		return new_parts_carbon_footprint_kgCO2e;
	}
	public void setNew_parts_carbon_footprint_kgCO2e(double new_parts_carbon_footprint_kgCO2e) {
		this.new_parts_carbon_footprint_kgCO2e = new_parts_carbon_footprint_kgCO2e;
	}
	public double getRecycled_parts_carbon_footprint_kgCO2e() {
		return recycled_parts_carbon_footprint_kgCO2e;
	}
	public void setRecycled_parts_carbon_footprint_kgCO2e(double recycled_parts_carbon_footprint_kgCO2e) {
		this.recycled_parts_carbon_footprint_kgCO2e = recycled_parts_carbon_footprint_kgCO2e;
	}
	public double getCarbon_footprint_saved_kgCO2e() {
		return carbon_footprint_saved_kgCO2e;
	}
	public void setCarbon_footprint_saved_kgCO2e(double carbon_footprint_saved_kgCO2e) {
		this.carbon_footprint_saved_kgCO2e = carbon_footprint_saved_kgCO2e;
	}
	public double getNew_parts_water_usage_liters() {
		return new_parts_water_usage_liters;
	}
	public void setNew_parts_water_usage_liters(double new_parts_water_usage_liters) {
		this.new_parts_water_usage_liters = new_parts_water_usage_liters;
	}
	public double getRecycled_parts_water_usage_liters() {
		return recycled_parts_water_usage_liters;
	}
	public void setRecycled_parts_water_usage_liters(double recycled_parts_water_usage_liters) {
		this.recycled_parts_water_usage_liters = recycled_parts_water_usage_liters;
	}
	public double getWater_usage_saved_liters() {
		return water_usage_saved_liters;
	}
	public void setWater_usage_saved_liters(double water_usage_saved_liters) {
		this.water_usage_saved_liters = water_usage_saved_liters;
	}
	public double getNew_parts_landfill_waste_kg() {
		return new_parts_landfill_waste_kg;
	}
	public void setNew_parts_landfill_waste_kg(double new_parts_landfill_waste_kg) {
		this.new_parts_landfill_waste_kg = new_parts_landfill_waste_kg;
	}
	public double getRecycled_parts_landfill_waste_kg() {
		return recycled_parts_landfill_waste_kg;
	}
	public void setRecycled_parts_landfill_waste_kg(double recycled_parts_landfill_waste_kg) {
		this.recycled_parts_landfill_waste_kg = recycled_parts_landfill_waste_kg;
	}
	public double getLandfill_waste_saved_kg() {
		return landfill_waste_saved_kg;
	}
	public void setLandfill_waste_saved_kg(double landfill_waste_saved_kg) {
		this.landfill_waste_saved_kg = landfill_waste_saved_kg;
	}
	public double getNew_parts_energy_consumption_kWh() {
		return new_parts_energy_consumption_kWh;
	}
	public void setNew_parts_energy_consumption_kWh(double new_parts_energy_consumption_kWh) {
		this.new_parts_energy_consumption_kWh = new_parts_energy_consumption_kWh;
	}
	public double getRecycled_parts_energy_consumption_kWh() {
		return recycled_parts_energy_consumption_kWh;
	}
	public void setRecycled_parts_energy_consumption_kWh(double recycled_parts_energy_consumption_kWh) {
		this.recycled_parts_energy_consumption_kWh = recycled_parts_energy_consumption_kWh;
	}
	public double getEnergy_consumption_saved_kWh() {
		return energy_consumption_saved_kWh;
	}
	public void setEnergy_consumption_saved_kWh(double energy_consumption_saved_kWh) {
		this.energy_consumption_saved_kWh = energy_consumption_saved_kWh;
	}
	public double getRecycling_rate_percent() {
		return recycling_rate_percent;
	}
	public void setRecycling_rate_percent(double recycling_rate_percent) {
		this.recycling_rate_percent = recycling_rate_percent;
	}
	public double getToxicity_score_new_parts() {
		return toxicity_score_new_parts;
	}
	public void setToxicity_score_new_parts(double toxicity_score_new_parts) {
		this.toxicity_score_new_parts = toxicity_score_new_parts;
	}
	public double getToxicity_score_recycled_parts() {
		return toxicity_score_recycled_parts;
	}
	public void setToxicity_score_recycled_parts(double toxicity_score_recycled_parts) {
		this.toxicity_score_recycled_parts = toxicity_score_recycled_parts;
	}
	public double isRemanufacturing_potential() {
		return remanufacturing_potential;
	}
	public void setRemanufacturing_potential(double remanufacturing_potential) {
		this.remanufacturing_potential = remanufacturing_potential;
	}
	public double getLife_cycle_assessment_score() {
		return life_cycle_assessment_score;
	}
	public void setLife_cycle_assessment_score(double life_cycle_assessment_score) {
		this.life_cycle_assessment_score = life_cycle_assessment_score;
	}
	public double getRenewable_material_content_percent() {
		return renewable_material_content_percent;
	}
	public void setRenewable_material_content_percent(double renewable_material_content_percent) {
		this.renewable_material_content_percent = renewable_material_content_percent;
	}
	public EnvironmentalMetrics(Long metric_id, Aircraft aircraft, double new_parts_carbon_footprint_kgCO2e,
			double recycled_parts_carbon_footprint_kgCO2e, double carbon_footprint_saved_kgCO2e,
			double new_parts_water_usage_liters, double recycled_parts_water_usage_liters,
			double water_usage_saved_liters, double new_parts_landfill_waste_kg,
			double recycled_parts_landfill_waste_kg, double landfill_waste_saved_kg,
			double new_parts_energy_consumption_kWh, double recycled_parts_energy_consumption_kWh,
			double energy_consumption_saved_kWh, double recycling_rate_percent, double toxicity_score_new_parts,
			double toxicity_score_recycled_parts, double remanufacturing_potential, double life_cycle_assessment_score,
			double renewable_material_content_percent) {
		super();
		this.metric_id = metric_id;
		this.aircraft = aircraft;
		this.new_parts_carbon_footprint_kgCO2e = new_parts_carbon_footprint_kgCO2e;
		this.recycled_parts_carbon_footprint_kgCO2e = recycled_parts_carbon_footprint_kgCO2e;
		this.carbon_footprint_saved_kgCO2e = carbon_footprint_saved_kgCO2e;
		this.new_parts_water_usage_liters = new_parts_water_usage_liters;
		this.recycled_parts_water_usage_liters = recycled_parts_water_usage_liters;
		this.water_usage_saved_liters = water_usage_saved_liters;
		this.new_parts_landfill_waste_kg = new_parts_landfill_waste_kg;
		this.recycled_parts_landfill_waste_kg = recycled_parts_landfill_waste_kg;
		this.landfill_waste_saved_kg = landfill_waste_saved_kg;
		this.new_parts_energy_consumption_kWh = new_parts_energy_consumption_kWh;
		this.recycled_parts_energy_consumption_kWh = recycled_parts_energy_consumption_kWh;
		this.energy_consumption_saved_kWh = energy_consumption_saved_kWh;
		this.recycling_rate_percent = recycling_rate_percent;
		this.toxicity_score_new_parts = toxicity_score_new_parts;
		this.toxicity_score_recycled_parts = toxicity_score_recycled_parts;
		this.remanufacturing_potential = remanufacturing_potential;
		this.life_cycle_assessment_score = life_cycle_assessment_score;
		this.renewable_material_content_percent = renewable_material_content_percent;
	}
	public EnvironmentalMetrics() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
