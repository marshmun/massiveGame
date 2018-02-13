package character;

public class Character {

    public String name;
    public String playerClass;
    public double maxHp;
    public double maxAtt;
    public double minAtt;
    public int level;
    public double curHp;

    public Character(String name, String playerClass) {
        this.name = name;
        this.playerClass = playerClass;
    }

    public int attack(Character other){
        int att = (int)(Math.random()*(this.maxAtt - this.minAtt + 1) + this.minAtt);
        other.curHp -= att;
        return att;
    }

    public boolean isDead(){
        if(this.curHp <= 0){
            return true;
        }else{
            return false;
        }
    }

    public double getCurHp(){
        return curHp;
    }

    public void setCurHp(double hp){
        if( hp >= maxHp - curHp){
            curHp = maxHp;
        }else{
            curHp = hp;
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlayerClass() {
        return playerClass;
    }

    public void setPlayerClass(String playerClass) {
        this.playerClass = playerClass;
    }

    public double getMaxHp() {
        return maxHp;
    }

    public int getLevel() {
        return level;
    }

   }
