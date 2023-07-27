package com.yohwan.study.objectbook.alice;

public class Wonderland {
    public static void main(String[] args) {
        Alice alice = new Alice(130, Place.PASSAGE);
        Mushroom mushroom = new Mushroom(150, 150);
        Cake cake = new Cake(100);
        Beverage beverage = new Beverage(100);
        Fan fan = new Fan();
        Key key = new Key(30);
        Door door = new Door(40);

        alice.eatLeft(mushroom);
        alice.eatRight(mushroom);
        alice.eat(cake);
        alice.drink(beverage);
        alice.eat(cake);
        alice.shake(fan);
        alice.shake(fan);
        alice.shake(fan);
        alice.shake(fan);
        alice.shake(fan);
        alice.shake(fan);
        alice.shake(fan);
        alice.get(key);
        alice.pass(door);

        System.out.println("엘리스의 현재 위치 : " + alice.getPlace());
    }
}
