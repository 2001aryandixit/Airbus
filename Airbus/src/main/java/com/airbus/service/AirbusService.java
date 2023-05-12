package com.airbus.service;

import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airbus.entity.Aircraft;
import com.airbus.entity.EnvironmentalMetrics;
import com.airbus.repo.AircraftRepo;
import com.airbus.repo.EnvironmentRepo;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

@Service
public class AirbusService {
    @Autowired
    private AircraftRepo aircraftRepository;

    @Autowired
    private EnvironmentRepo environmentalMetricsRepository;

    public void importDataFromCSV(String filePath) throws IOException, CsvValidationException {
        CSVReader reader = new CSVReader(new FileReader(filePath));
        String[] line;

        // Skip the header line
        reader.readNext();

        long id=1;
        
        while ((line = reader.readNext()) != null) {
            // Create and populate the Aircraft entity
            Aircraft aircraft = new Aircraft();
            aircraft.setAircraft_id(id);
            aircraft.setPart_name(line[0]);
            aircraft.setMaterial_composition(line[1]);
            aircraft.setAge_years(Integer.parseInt(line[2]));
            aircraft.setconditions(filePath);
            aircraft.setLocation(line[4]);
            aircraft.setManufacturer(line[5]);
            aircraft.setAircraft_model(line[6]);
            aircraft.setPotential_use_cases(line[7]);

            // Save the Aircraft entity to the database
            aircraftRepository.save(aircraft);

            // Create and populate the EnvironmentalMetrics entity
            EnvironmentalMetrics metrics = new EnvironmentalMetrics();
            metrics.setMetric_id(id);
            metrics.setAircraft(aircraft);
            
            metrics.setNew_parts_carbon_footprint_kgCO2e(Double.parseDouble(line[8]));
            metrics.setRecycled_parts_carbon_footprint_kgCO2e(Double.parseDouble(line[9]));
            metrics.setNew_parts_water_usage_liters(Double.parseDouble(line[10]));
            metrics.setRecycled_parts_water_usage_liters(Double.parseDouble(line[11]));
            metrics.setNew_parts_landfill_waste_kg(Double.parseDouble(line[12]));
            metrics.setRecycled_parts_landfill_waste_kg(Double.parseDouble(line[13]));
            metrics.setNew_parts_energy_consumption_kWh(Double.parseDouble(line[14]));
            metrics.setRecycled_parts_energy_consumption_kWh(Double.parseDouble(line[15]));
            metrics.setRecycling_rate_percent(Double.parseDouble(line[16]));
            metrics.setToxicity_score_new_parts(Double.parseDouble(line[17]));
            metrics.setToxicity_score_recycled_parts(Double.parseDouble(line[18]));
            metrics.setRemanufacturing_potential(Double.parseDouble(line[19]));
            metrics.setLife_cycle_assessment_score(Double.parseDouble(line[20]));
            metrics.setRenewable_material_content_percent(Double.parseDouble(line[21]));

            metrics.setCarbon_footprint_saved_kgCO2e(Double.parseDouble(line[22]));
            metrics.setWater_usage_saved_liters(Double.parseDouble(line[23]));
            metrics.setLandfill_waste_saved_kg(Double.parseDouble(line[24]));
            metrics.setEnergy_consumption_saved_kWh(Double.parseDouble(line[25]));
            

            // Save the EnvironmentalMetrics entity to the database
            environmentalMetricsRepository.save(metrics);
            id++;
        }

        reader.close();
    }
}
