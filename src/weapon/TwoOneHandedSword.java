package weapon;

public class TwoOneHandedSword extends Weapon {
    public static double hp = 1;
    public static double att= 5;
    public static String description =" These two swords were know to be welded out of dragon glass, known for powerful strikes however leaves you slightly defensless.";

    public TwoOneHandedSword() {
    }

    public static double getHp() {
        return hp;
    }

    public static void setHp(double hp) {
        TwoOneHandedSword.hp = hp;
    }

    public static double getAtt() {
        return att;
    }

    public static void setAtt(double att) {
        TwoOneHandedSword.att = att;
    }

    public static String getDescription() {
        return description;
    }

    public static void setDescription(String description) {
        TwoOneHandedSword.description = description;
    }
}
