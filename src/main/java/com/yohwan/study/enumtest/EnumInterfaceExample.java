package com.yohwan.study.enumtest;

public class EnumInterfaceExample {
    interface Animal {
        void sound();
        void run();
    }

    enum AnimalType implements Animal {
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
        }
    }

    public static void main(String[] args) {
        for (AnimalType type : AnimalType.values()) {
            type.sound();
            type.run();
        }
    }
}
