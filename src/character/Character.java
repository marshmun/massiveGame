package character;

public class Character {

    public String name;
    public String playerClass;
    public int maxHp;
    public int maxAtt;
    public int minAtt;
    public int level;
    public int curHp;

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

    public int getCurHp(){
        return curHp;
    }

    public void setCurHp(int hp){
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

    public int getMaxHp() {
        return maxHp;
    }

    public int getLevel() {
        return level;
    }

   }
