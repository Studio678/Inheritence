package com.studio678;

public class Duck extends FlyingBirds {
    public void swim(){

    }

    public void catchFish(){

    }

    public void eat(){
        catchFish();
        super.eat();
    }
}
