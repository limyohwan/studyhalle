package com.yohwan.study.enumtest;

public class EnumAbstractExample {
    enum AnimalType {
        DOG {
            @Override
            public void sound() {
                System.out.println("왈왈");
            }

            @Override
            public void run() {
                System.out.println("뒤뚱");
            }
        },
        CAT {
            @Override
            public void sound() {
                System.out.println("냐옹");
            }

            @Override
            public void run() {
                System.out.println("점프점프");
            }
        },
        TIGER {
            @Override
            public void sound() {
                System.out.println("어흥");
            }

            @Override
            public void run() {
                System.out.println("훅훅");
            }
        },
        BIRD {
            @Override
            public void sound() {
                System.out.println("짹짹");
            }

            @Override
            public void run() {
                System.out.println("따닥따닥");
            }
        };

        abstract void sound();
        abstract void run();
    }

    public static void main(String[] args) {
        for (EnumInterfaceExample.AnimalType type : EnumInterfaceExample.AnimalType.values()) {
            type.sound();
            type.run();
        }
    }
}
