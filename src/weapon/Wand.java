package weapon;

public class Wand extends Weapon {
    public static double hp = 4;
    public static double att= 2;
    public static String description =" Wand of protection, legends say this is the very same wand that voldermort used to defend agianst the dragon of Drakar. Powerful in defence, and offers some offence.";

    public Wand() {
    }

    public static double getHp() {
        return hp;
    }

    public static void setHp(double hp) {
        Wand.hp = hp;
    }

    public static double getAtt() {
        return att;
    }

    public static void setAtt(double att) {
        Wand.att = att;
    }

    public static String getDescription() {
        return description;
    }

    public static void setDescription(String description) {
        Wand.description = description;
    }
}
