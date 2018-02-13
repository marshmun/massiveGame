package weapon;

public class MagicBook extends Weapon {
    public static double hp = 1;
    public static double att= 5;
    public static String description = "This is the magic book of the dragon, alot of power and little defence.";

    public MagicBook() {
    }

    public static double getHp() {
        return hp;
    }

    public static void setHp(double hp) {
        MagicBook.hp = hp;
    }

    public static double getAtt() {
        return att;
    }

    public static void setAtt(double att) {
        MagicBook.att = att;
    }

    public static String getDescription() {
        return description;
    }

    public static void setDescription(String description) {
        MagicBook.description = description;
    }
}
