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
            this.key = key.get(this.height);
        }
    }

    public void pass(Door door) {
        if(this.getPlace() != Place.PASSAGE) {
            throw new IllegalStateException("통로가 아닙니다.");
        }

        door.pass(this.key, this.height);

        this.move(Place.BEAUTIFUL_GARDEN);
    }

    public void drink(Beverage beverage) {
        beverage.decrease(10);

        this.changeHeight(24);
    }

    public void eat(Cake cake) {
        cake.decrease(10);

        this.changeHeight(this.height + 150);
    }

    public void shake(Fan fan) {
        fan.shake();
        this.changeHeight(this.height - 20);
    }

    public void eatLeft(Mushroom mushroom) {
        mushroom.decreaseLeft(10);

        this.changeHeight(40);
    }
    public void eatRight(Mushroom mushroom) {
        mushroom.decreaseRight(10);

        this.changeHeight(130);
    }

    public void changeHeight(int height) {
        if(height < 1) {
            this.height = 1;
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
}
