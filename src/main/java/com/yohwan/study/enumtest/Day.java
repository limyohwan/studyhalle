package com.yohwan.study.enumtest;

public enum Day {
    MONDAY("월요일"),
    TUESDAY("화요일"),
    WEDNESDAY("수요일"),
    THURSDAY("목요일"),
    FRIDAY("금요일"),
    SATURDAY("토요일"),
    SUNDAY("일요일");

    private String name;
    
    Day(String name) {
        System.out.println("나의 요일은 " + this.name() + "이야");
    }

    public String getName() {
        return name;
    }

    public void condition() {
        switch (this) {
            case MONDAY:
                System.out.println("월요병이 온다");
                break;
            case TUESDAY:
                System.out.println("화요일이다");
                break;
            case WEDNESDAY:
                System.out.println("드디어 수요일");
                break;
            case THURSDAY:
                System.out.println("하루만 참자");
                break;
            case FRIDAY:
                System.out.println("불금이다");
                break;
            case SATURDAY:
                System.out.println("푹쉬자");
                break;
            case SUNDAY:
                System.out.println("월요일이 온다");
                break;
        }
    }

    public static void main(String[] args) {
        Day day = Day.MONDAY;
        day.condition();
    }
}