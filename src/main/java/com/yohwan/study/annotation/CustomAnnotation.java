package com.yohwan.study.annotation;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface CustomAnnotation {
    String value();
    int count() default 1;
}
