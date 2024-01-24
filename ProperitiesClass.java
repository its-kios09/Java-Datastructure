import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ProperitiesClass {
    public static void main(String[] args){
        Properties prop = new Properties();
        try{
            prop.load(new FileInputStream("myConfig.properties"));
            prop.list(System.out);
            System.out.println(prop.getProperty(" File Name"));
            System.out.println(prop.getProperty("New Topic"));
            System.out.println(prop.getProperty("Topic"));

        }catch (IOException e){
            System.out.println("Error StackTrace:- " + e);
        }
    }
}
