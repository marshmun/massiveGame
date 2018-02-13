package character.Class;

public class Warrior {

       public static double hp = 16;
    public static double att= 10;

    public Warrior() {
    }

    public static double getHp() {
        return hp;
    }

    public static void setHp(double hp) {
        Warrior.hp = hp;
    }

    public static double getAtt() {
        return att;
    }

    public static void setAtt(double att) {
        Warrior.att = att;
    }
}
