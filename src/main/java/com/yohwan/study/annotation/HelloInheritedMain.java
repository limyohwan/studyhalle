package com.yohwan.study.annotation;

import java.lang.annotation.Annotation;

public class HelloInheritedMain {
    public static void main(String[] args) {
        Annotation[] annotations = HelloController.class.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

        System.out.println("---------------");

        Annotation[] annotations2 = MyHelloController.class.getAnnotations(); // @Inherited 사용시 하위클래스에서도 @Hello 애노테이션 확인 가능함
        for (Annotation annotation2 : annotations2) {
            System.out.println(annotation2);
        }

        System.out.println("---------------");

        Annotation[] annotations3 = MyHelloController.class.getSuperclass().getAnnotations(); // @Inherited 사용하지 않아도 getSuperClass()를 이용하여 상위클래스에의 애노테이션 확인 가능함
        for (Annotation annotation3 : annotations3) {
            System.out.println(annotation3);
        }

        System.out.println("---------------");

        Annotation[] annotations4 = MyHelloController.class.getDeclaredAnnotations(); // getDeclaredAnnotations()는 해당 클래스에 선언되어 있는 것만 나오고 부모타입의 @Inherited 애노테이션을 무시하게 된다
        for (Annotation annotation4 : annotations4) {
            System.out.println(annotation4);
        }
    }
}
