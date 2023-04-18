package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertyManager {
    private static String goodUsername, goodPassword;

    private static String configFilePath = "src/main/resources/configuration.properties";

    private static PropertyManager instance;
    public static PropertyManager getInstance(){
        if(instance == null) {
            instance = new PropertyManager();
            instance.loadData();
        }
        return instance;
    }
    private void loadData() {
        Properties properties = new Properties();
        try {
            FileInputStream fi = new FileInputStream(configFilePath);
            properties.load(fi);
        } catch (Exception e) {
            e.printStackTrace();
        }
        goodUsername = properties.getProperty("goodUsername");
        goodPassword = properties.getProperty("goodPassword");
    }
    public static void changeProperty(String key, String value) {
        Properties props = new Properties();
        try {
            FileInputStream in = new FileInputStream(configFilePath);
            props.load(in);
            props.setProperty(key, value);
            in.close();
            FileOutputStream out = new FileOutputStream(configFilePath);
            props.store(out, null);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        instance = null;
    }

    public String getGoodUsername() {
        return goodUsername;
    }
    public String getGoodPassword() {
        return goodPassword;
    }
}
