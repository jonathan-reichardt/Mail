package de.reichardt.utils.properties;

import java.io.*;
import java.util.Properties;

public class PropertyRepository {
    private final InputStream inputStream;
    private final Properties properties;

    public PropertyRepository(File file) throws FileNotFoundException {
        this.inputStream = new FileInputStream(file);
        this.properties = new Properties();
    }

    public String getProperty(String key) throws IOException {
        this.properties.load(this.inputStream);
        return this.properties.getProperty(key);
    }


}
