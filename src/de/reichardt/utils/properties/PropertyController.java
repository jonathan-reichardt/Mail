package de.reichardt.utils.properties;


import java.io.File;
import java.io.IOException;

public class PropertyController {
    private final PropertyRepository propertyRepository;

    public PropertyController(File file) throws IOException {
        this.propertyRepository = new PropertyRepository(file);
    }


    public String getProperty(String key) throws IOException {
        return this.propertyRepository.getProperty(key);
    }

}
