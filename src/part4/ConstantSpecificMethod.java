package part4;

import java.text.DateFormat;
import java.util.Date;

public enum ConstantSpecificMethod {
    DATE_TIME{
        String getInfo(){
            return DateFormat.getDateInstance().format(new Date());
        }
    },
    CLASSPATH{
        String getInfo(){
            System.out.println(ConstantSpecificMethod.class.getClassLoader());
            return System.getProperty("java.class.path");
        }
    },
    VERSION{
        String getInfo(){
            return System.getProperty("java.version");
        }
    };
    abstract  String getInfo();

    public static void main(String[] args) {
        for (ConstantSpecificMethod c : values()) {
            System.out.println(c.getInfo());
        }
    }
}
