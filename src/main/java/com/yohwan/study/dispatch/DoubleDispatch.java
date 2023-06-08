package com.yohwan.study.dispatch;

import java.util.Arrays;
import java.util.List;

public class DoubleDispatch {
    interface Post {
        void postOn(Sns sns);
    }

    // 첫번째 디스패치 Text 타입을 쓸꺼냐 Picture 타입을 쓸꺼냐
    static class Text implements Post {
        @Override
        public void postOn(Sns sns) {
            sns.post(this);
        }
    }

    static class Picture implements  Post {
        @Override
        public void postOn(Sns sns) {
            sns.post(this);
        }
    }

    interface Sns{
        void post(Text post);
        void post(Picture post);
    }

    // 두번째 디스패치 Facebook 을 쓸꺼냐, Instagram 을 쓸꺼냐 + 그 안에서도 Text 타입 매개변수를 쓸꺼냐 Picture 타입 매개변수를 쓸꺼냐
    static class Facebook implements Sns {
        @Override
        public void post(Text post) {
            System.out.println("Text post on facebook");
        }

        @Override
        public void post(Picture post) {
            System.out.println("Picture post on facebook");
        }
    };

    static class Instagram implements Sns {
        @Override
        public void post(Text post) {
            System.out.println("Text post on instagram");
        }

        @Override
        public void post(Picture post) {
            System.out.println("Picture post on instagram");
        }
    };

    public static void main(String[] args) {
        List< Post> posts = Arrays.asList(new  Text(), new  Picture());
        List< Sns> sns = Arrays.asList(new  Facebook(), new  Instagram());

        posts.forEach(p -> sns.forEach(s -> p.postOn(s)));
    }
}
