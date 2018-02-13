package weapon;

public class Talisman extends Weapon {
    public static double hp = 0;
    public static double att= 6;
    public static String description = "This is the magic talisman of Tortage, rumors say in ones posession war will forever be in their favor, this talisman offers no defense however powerful offence.";

    public Talisman() {
    }

    public static double getHp() {
        return hp;
    }

    public static void setHp(double hp) {
        Talisman.hp = hp;
    }

    public static double getAtt() {
        return att;
    }

    public static void setAtt(double att) {
        Talisman.att = att;
    }

    public static String getDescription() {
        return description;
    }

    public static void setDescription(String description) {
        Talisman.description = description;
    }
}
