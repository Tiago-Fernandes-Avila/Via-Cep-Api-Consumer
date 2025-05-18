package src.java.model.connect;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionJDBC {

    public static Properties getProps(){
        
        Properties props = new Properties();
      File propsFile = new File("src\\resources\\config.properties");
        props.load(new FileInputStream(propsFile));
      
        Connection conn = DriverManager.getConnection(props.getProperty(), null, null)



}
