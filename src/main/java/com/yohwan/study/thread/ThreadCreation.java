package com.yohwan.study.thread;

public class ThreadCreation extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        ThreadCreation threadCreation = new ThreadCreation(); // Thread 클래스를 상속하여 사용하는 법
        threadCreation.start();

        new Thread(new Runnable() { // Runnable 인터페이스를 구현하여 사용하는 방법(익명 내부 클래스사용)
//            @SneakyThrows
            @Override
            public void run() {
                try {
                    Thread.sleep(1000L); // Long 리터럴을 사용할때 L을 꼭 사용하는게 좋다, 소문자 l은 숫자 1과 영어 I와 헷갈릴 수 있다.
                } catch (InterruptedException e) {
                    throw new RuntimeException(e); // CheckedException 이지만 에러를 잡아 따로 처리할게 없기때문에 RuntimeException을 던지던가 lombok의 @SneakyThrows 애노테이션을 사용하자
                }
                System.out.println(Thread.currentThread().getName());
            }
        }).start();
        // Thread에서 run 말고도 다른 것들을 override 해야할 필요가 있으면 상속받아서 구현하고 아니면 Runnable을 사용하는게 좋음
    }
}
