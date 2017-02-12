/**
 * Created by Света on 29.01.2017.
 */
public enum Animals {
    COW (10), HEN(13), DOG (16), CAT(15);
    private int age;
    Animals(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return  super.toString() + "'s age is his " + age;
    }
}
