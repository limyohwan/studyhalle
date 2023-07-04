package com.yohwan.study.enumtest;

public class EnumOrigin {
    public static final int APPLE = 1;
    public static final int SAMSUNG = 2;
    public static final int GOOGLE = 3;

//    public static final int APPLE = 1; // APPLE의 변수명이 같아서 사용 불가
    public static final int BANANA = 2;
    public static final int PEACH = 3;

    public static final int COMPANY_APPLE = 1; // 이름 앞에 구분자를 두어 사용 가능
    public static final int COMPANY_SAMSUNG = 2;
    public static final int COMPANY_GOOGLE = 3;
    public static final int FRUIT_APPLE = 1;
    public static final int FRUIT_BANANA = 2;
    public static final int FRUIT_PEACH = 3;

    static class Company { // 상수 클래스 사용
        public static final int APPLE = 1;
        public static final int SAMSUNG = 2;
        public static final int GOOGLE = 3;
    }

    static class Fruit {
        public static final int APPLE = 1;
        public static final int BANANA = 2;
        public static final int PEACH = 3;

    }

    static class Company2 {
        public static final Company2 APPLE = new Company2(1);
        public static final Company2 SAMSUNG = new Company2(2);
        public static final Company2 GOOGLE = new Company2(3);

        private int value;

        public Company2(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    static class Fruit2 {
        public static final Fruit2 APPLE = new Fruit2(1);
        public static final Fruit2 BANANA = new Fruit2(2);
        public static final Fruit2 PEACH = new Fruit2(3);

        private int value;

        public Fruit2(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    enum Company3 {
        APPLE(1), SAMSUNG(2), GOOGLE(3);

        private int value;

        Company3(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    enum Fruit3 {
        APPLE(1), BANANA(2), PEACH(3);

        private int value;

        Fruit3(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        System.out.println(COMPANY_APPLE == FRUIT_APPLE); // 상수 클래스를 사용하든 앞에 구분자를 붙인 상수를 선언하든
        System.out.println(Company.APPLE == Fruit.APPLE); // 결국 Company의 Apple과 Fruit의 Apple은 동일하다고 나옴

        int company = Company.APPLE;
        switch (company) {
            case Company.APPLE:
                System.out.println("APPLE 입니다");
                break;
            case Company.SAMSUNG:
                System.out.println("SAMSUNG 입니다");
                break;
            case Company.GOOGLE:
                System.out.println("GOOGLE 입니다");
                break;
        }

//        System.out.println(Company2.APPLE == Fruit2.APPLE); // 객체로 만들어 반환하면 애초에 비교가 불가능하다고 나오며 컴파일 에러가 발생함
        Company2 company2 = Company2.APPLE;
//        switch (company2) { // 하지만 객체로 만들면 switch문 안에서 사용이 불가능함
//            case Company2.APPLE:
//                System.out.println("APPLE 입니다");
//                break;
//            case Company2.SAMSUNG:
//                System.out.println("SAMSUNG 입니다");
//                break;
//            case Company2.GOOGLE:
//                System.out.println("GOOGLE 입니다");
//                break;
//        }

//        System.out.println(Company3.APPLE == Fruit3.APPLE); // enum 으로 반환하면 컴파일 에러 발생
        Company3 company3 = Company3.APPLE;
        switch (company3) { // enum은 스위치 문에서도 사용가능함
            case APPLE:
                System.out.println("APPLE 입니다");
                break;
            case SAMSUNG:
                System.out.println("SAMSUNG 입니다");
                break;
            case GOOGLE:
                System.out.println("GOOGLE 입니다");
                break;
        }
    }
}
