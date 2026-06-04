package Upskilling.Module3.exercise_39;

import java.lang.reflect.*;

public class ReflectionDemo {

    public static void main(String[] args) throws Exception {

        Class<?> cls = Class.forName("Student");

        Method[] methods = cls.getDeclaredMethods();

        for (Method m : methods) {
            System.out.println("Method: " + m.getName());
        }

        Object obj = cls.getDeclaredConstructor().newInstance();

        Method method = cls.getMethod("display");

        method.invoke(obj);
    }
}
