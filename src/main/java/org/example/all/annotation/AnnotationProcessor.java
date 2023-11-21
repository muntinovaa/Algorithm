package org.example.all.annotation;

import java.lang.reflect.Method;

public class AnnotationProcessor {
    public static void main(String[] args) {
        for (Method method : TestClass.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(CustomAnnotation.class)) {
                CustomAnnotation annotation = method.getAnnotation(CustomAnnotation.class);
                System.out.println("Method: " + method.getName());
                System.out.println("Description: " + annotation.description());
                System.out.println("Value: " + annotation.value());
            }
        }
    }
}
