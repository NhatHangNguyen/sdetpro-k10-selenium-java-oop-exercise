package Lab_09_2;

public class Horse extends Animal{
    @Override
    public String getName(){
        return "Horse";
    }
    @Override
    public int getMaxSpeed() {
        return 75;
    }
}
