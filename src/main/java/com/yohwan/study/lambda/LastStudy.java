package com.yohwan.study.lambda;

import java.lang.invoke.*;
import java.lang.reflect.Method;
import java.util.function.Function;

public class LastStudy {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) throws Throwable {
        Method[] declaredMethods = LastStudy.class.getDeclaredMethods();
        for (int i = 0; i < declaredMethods.length; i++) {
            Method declaredMethod = declaredMethods[i];
            if(declaredMethod.getName().startsWith("get")) {
                System.out.println(declaredMethod.getName());
            }
        }

        MethodHandles.Lookup lookup = MethodHandles.lookup();
        MethodHandle getName = lookup.findVirtual(LastStudy.class, "getName", MethodType.methodType(String.class))
                .asType(MethodType.methodType(Object.class, Object.class));

//        getName.invokeExact(new Object());

        CallSite site = LambdaMetafactory.metafactory(lookup,
                "apply",
                MethodType.methodType(Function.class),
                MethodType.methodType(Object.class, Object.class),
                lookup.findVirtual(LastStudy.class, "getName", MethodType.methodType(String.class)),
                MethodType.methodType(String.class, LastStudy.class));

        Function function = (Function) site.getTarget().invokeExact();
//        function.apply(new Object());
    }
}
