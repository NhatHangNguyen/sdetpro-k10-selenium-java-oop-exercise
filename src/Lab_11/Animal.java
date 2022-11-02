package Lab_11;

public abstract class Animal {
    public String name;
    public int speed;

    public Animal() {
    }

    public Animal(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public abstract Animal setName(String horse1);

    public int getSpeed() {
        return speed;
    }

    public abstract void setSpeed();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}
