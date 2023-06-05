package com.yohwan.study.dispatch;

import java.util.List;

public class DynamicDispatch {
    static abstract class Service {
        abstract void run();
    }

    static class MyService1 extends Service {
        @Override
        void run() {
            System.out.println("run1");
        }
    }

    static class MyService2 extends Service {
        @Override
        void run() {
            System.out.println("run2");
        }
    }

    public static void main(String[] args) {
        MyService1 myService1 = new MyService1();
        myService1.run(); // 정적 디스패치
        MyService2 myService2 = new MyService2();
        myService2.run(); // 정적 디스패치

        Service service = new MyService1();
        service.run(); // 동적 디스패치, 리시버파라메터(this)를 활용하면 메소드를 찾아냄

        List<Service> svc = List.of(new MyService1(), new MyService2());
        svc.forEach(Service::run);
    }
}
