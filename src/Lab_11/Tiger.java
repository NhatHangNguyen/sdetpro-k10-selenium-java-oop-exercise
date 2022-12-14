package Lab_11;

import java.security.SecureRandom;

public class Tiger extends Animal{

    @Override
    public Animal setName(String horse1) {
        this.name = "Tiger";
        return this;
    }

    @Override
    public void setSpeed() {
        int randomSpeed = new SecureRandom().nextInt(100);
        this.speed = randomSpeed;
    }
}
