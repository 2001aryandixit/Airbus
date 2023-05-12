package com.airbus.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.airbus.service.AirbusService;
import com.opencsv.exceptions.CsvValidationException;

@RestController
public class AirbusController {

    @Autowired
    private AirbusService airbusService;

    @PostMapping("/import")
    public String importData(@RequestParam("Dataset") MultipartFile file) throws CsvValidationException {
        try {
            // Save the uploaded file temporarily
            Path tempFilePath = Files.createTempFile("temp", file.getOriginalFilename());
            file.transferTo(tempFilePath.toFile());

            // Import data from the CSV file
            airbusService.importDataFromCSV(tempFilePath.toString());

            // Delete the temporary file
            Files.delete(tempFilePath);

            return "Data imported successfully";
        } catch (IOException e) {
            e.printStackTrace();
            return "Error importing data";
        }
    }
}
