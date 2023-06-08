package com.yohwan.study.dispatch;

import java.util.Arrays;
import java.util.List;

public class Dispatch {
    interface Post {
        void postOn(Sns sns);
    }

    static class Text implements Post {
        @Override
        public void postOn(Sns sns) {
            if(sns instanceof Facebook) {
                System.out.println("Text post on facebook");
            }
            if(sns instanceof Instagram) {
                System.out.println("Text post on instagram");
            }
        }
    }

    static class Picture implements Post {
        @Override
        public void postOn(Sns sns) {
            if(sns instanceof Facebook) {
                System.out.println("Picture post on facebook");
            }
            if(sns instanceof Instagram) {
                System.out.println("Picture post on instagram");
            }
        }
    }

    interface Sns{}
    static class Facebook implements Sns{};
    static class Instagram implements Sns{};

    public static void main(String[] args) {
        List<Post> posts = Arrays.asList(new Text(), new Picture());
        List<Sns> sns = Arrays.asList(new Facebook(), new Instagram());

        posts.forEach(p -> sns.forEach(p::postOn));
    }
}
