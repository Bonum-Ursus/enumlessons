package part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;


enum NewEnum {RED("1"), BLACK("2");
String s = "123";
    private NewEnum(String s) {
        this.s = s;
    }
}

public class ReflectionEnum {
    static Method[] method = NewEnum.class.getMethods();
    static Constructor[] constructors = NewEnum.class.getConstructors();

    public static void main(String[] args) throws IOException {
        for (Method m : ReflectionEnum.method) {
            System.out.println(m.getName());
        }
        System.out.println("*******************");
        for (Constructor c : ReflectionEnum.constructors) {
            System.out.println(c);
        }

    }
}
