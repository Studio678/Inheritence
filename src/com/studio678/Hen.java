package com.studio678;

public class Hen extends NotFlyingBirds {
    private void debGrain(){

    }

    public void eat(){
        debGrain();
        super.eat();
    }

    public void hideHead(){
        System.out.println("Hen can't hide head");
    }
}
