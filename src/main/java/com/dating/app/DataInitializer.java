package com.dating.app;
import com.dating.app.model.Country;
import com.dating.app.model.Interest;
import com.dating.app.repository.CountryRepository;
import com.dating.app.repository.InterestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataInitializer implements CommandLineRunner {
    @Autowired
    private InterestRepository interestRepository;

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public void run(String... args) throws Exception {
        // Prepopulate interests
        interestRepository.deleteAll();
        interestRepository.saveAll(Arrays.asList(
                new Interest("1", "Hiking"),
                new Interest("2", "Reading")
                // Add more interests as needed
        ));

        // Prepopulate countries
        countryRepository.deleteAll();
        countryRepository.saveAll(Arrays.asList(
                new Country("1", "United States", "+1"),
                new Country("2", "India", "+91"),
                new Country("3", "Canada", "+1")
                // Add more countries as needed
        ));
    }
}
