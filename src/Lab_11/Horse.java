package Lab_11;

import java.security.SecureRandom;

public class Horse extends Animal{

    @Override
    public Animal setName(String horse1) {
        this.name = "Horse";
        return this;
    }

    @Override
    public void setSpeed() {
        int randomSpeed = new SecureRandom().nextInt(75);
        this.speed = randomSpeed;
    }
}
