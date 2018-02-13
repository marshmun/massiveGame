package weapon;

public class Staff extends Weapon {

    public static double hp = 2;
    public static double att = 4;
    public static String description = "This staffs magic power allows for some defence and even more offence.";

    public Staff() {
    }

    public static double getHp() {
        return hp;
    }

    public static void setHp(double hp) {
        Staff.hp = hp;
    }

    public static double getAtt() {
        return att;
    }

    public static void setAtt(double att) {
        Staff.att = att;
    }

    public static String getDescription() {
        return description;
    }


}
