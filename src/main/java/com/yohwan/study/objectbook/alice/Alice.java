package com.yohwan.study.objectbook.alice;

public class Alice {
    private int height;
    private Place place;
    private Key key;

    public Alice(int height, Place place) {
        this.height = height;
        this.place = place;
    }

    public void get(Key key) {
        if(this.key == null) {
            this.key = key.get(this);
        }
    }

    public void pass(Door door) {
        door.pass(this);
    }

    public void drink(Beverage beverage) {
        beverage.decrease(this);
    }

    public void eat(Cake cake) {
        cake.decrease(this);
    }

    public void shake(Fan fan) {
        fan.shake(this);
    }

    public void eatLeft(Mushroom mushroom) {
        mushroom.decreaseLeft(this);
    }
    public void eatRight(Mushroom mushroom) {
        mushroom.decreaseRight(this);
    }

    public void changeHeight(int height) {
        if(height < 1) {
            throw new IllegalStateException("엘리스의 키를 더이상 줄일 수 없습니다.");
        }
        this.height = height;
        System.out.println("엘리스의 바뀐 키 : " + this.height);
    }

    public void move(Place place) {
        this.place = place;
    }

    public int getHeight() {
        return height;
    }

    public Place getPlace() {
        return place;
    }

    public Key getKey() {
        return key;
    }

    public static void main(String[] args) {
        Alice alice = new Alice(130, Place.PASSAGE);
        Mushroom mushroom = new Mushroom(150, 150);
        alice.eatLeft(mushroom);
        alice.eatRight(mushroom);
        Cake cake = new Cake(100);
        alice.eat(cake);
        Beverage beverage = new Beverage(100);
        alice.drink(beverage);
        alice.eat(cake);
        Fan fan = new Fan();
        alice.shake(fan);
        alice.shake(fan);
        alice.shake(fan);
        alice.shake(fan);
        alice.shake(fan);
        alice.shake(fan);
        alice.shake(fan);
        alice.get(new Key(30));
        alice.pass(new Door(40));

        System.out.println("엘리스의 현재 위치 : " + alice.getPlace());
    }
}
