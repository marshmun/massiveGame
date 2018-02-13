package weapon;

public class TwoHandedSword extends Weapon {
    public static double hp = 0;
    public static double att= 6;
    public static String description = "Weilding the two handed sword of val'shara will leave you vulniable in defence, however your foes will parrish in a flash.";

    public TwoHandedSword() {
    }

    public static double getHp() {
        return hp;
    }

    public static void setHp(double hp) {
        TwoHandedSword.hp = hp;
    }

    public static double getAtt() {
        return att;
    }

    public static void setAtt(double att) {
        TwoHandedSword.att = att;
    }

    public static String getDescription() {
        return description;
    }

    public static void setDescription(String description) {
        TwoHandedSword.description = description;
    }
}
