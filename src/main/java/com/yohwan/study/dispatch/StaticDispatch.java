package com.yohwan.study.dispatch;

public class StaticDispatch {
    static class Service {
        void run() {
            System.out.println("run()");
        }

        void run(int num) {
            System.out.println("run("+num+")");
        }

        void run(String msg) {
            System.out.println("run("+msg+")");
        }
    }

    public static void main(String[] args) {
        new Service().run();
        new Service().run(1);
        new Service().run("static dispatch");
    }
}
