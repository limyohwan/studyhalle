package com.yohwan.study.enumtest;

public class EnumInterfaceExample {
    interface Animal {
        void sound();
    }

    enum AnimalType implements Animal {
        DOG {
            @Override
            public void sound() {
                System.out.println("왈왈");
            }
        },
        CAT {
            @Override
            public void sound() {
                System.out.println("냐옹");
            }
        },
        TIGER {
            @Override
            public void sound() {
                System.out.println("어흥");
            }
        },
        BIRD {
            @Override
            public void sound() {
                System.out.println("짹짹");
            }
        }
    }

    public static void main(String[] args) {
        for (AnimalType type : AnimalType.values()) {
            type.sound();
        }
    }
}
