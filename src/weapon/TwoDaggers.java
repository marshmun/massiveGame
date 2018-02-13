package weapon;

public class TwoDaggers extends Weapon {
    public static double hp = 2;
    public static double att= 4;
    public static String description = "Daggers of the assasin poe, known for his spead and ability to parry, these daggers offer good offence, and decent defence.";

    public TwoDaggers() {
    }

    public static double getHp() {
        return hp;
    }

    public static void setHp(double hp) {
        TwoDaggers.hp = hp;
    }

    public static double getAtt() {
        return att;
    }

    public static void setAtt(double att) {
        TwoDaggers.att = att;
    }

    public static String getDescription() {
        return description;
    }

    public static void setDescription(String description) {
        TwoDaggers.description = description;
    }
}
