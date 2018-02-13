package weapon;

public class SwordAndShield extends Weapon {

    public static double hp = 3;
    public static double att= 3;
    public static String description = "Sword and shield equally balance your defence and attack!";

    public SwordAndShield() {
    }

    public static double getHp() {
        return hp;
    }

    public static void setHp(double hp) {
        SwordAndShield.hp = hp;
    }

    public static double getAtt() {
        return att;
    }

    public static void setAtt(double att) {
        SwordAndShield.att = att;
    }

    public static String getDescription() {
        return description;
    }

    public static void setDescription(String description) {
        SwordAndShield.description = description;
    }
}
