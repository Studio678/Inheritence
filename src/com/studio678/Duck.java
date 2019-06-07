package com.studio678;

public class Duck extends FlyingBirds {
    public void swim(){

    }

    private void catchFish(){

    }

    public void eat(){
        catchFish();
        super.eat();
    }

    public void goingToGround(){
        System.out.println("Duck is going to ground");
    }
}
