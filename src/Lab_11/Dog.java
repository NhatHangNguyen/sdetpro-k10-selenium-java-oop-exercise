package Lab_11;

import java.security.SecureRandom;

public class Dog extends Animal {

    public Dog() {
    }

    @Override
    public Animal setName(String horse1) {
        this.name = "Dog";
        return this;
    }

    @Override
    public void setSpeed() {
        int randomSpeed = new SecureRandom().nextInt(60);
        this.speed = randomSpeed;
    }
}
