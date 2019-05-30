package com.studio678;

public class Hen extends NotFlyingBirds {
    public void debGrain(){

    }

    public void eat(){
        debGrain();
        super.eat();
    }
}
