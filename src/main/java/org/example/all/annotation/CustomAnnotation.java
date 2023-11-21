package org.example.all.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Specifies that this annotation can be used on methods
@Target(ElementType.METHOD)
// Specifies that this annotation will be available at runtime
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomAnnotation {
    // Elements for the annotation
    String description() default "Default Description";
    int value() default 0;
}

