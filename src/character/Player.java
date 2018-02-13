package character;

import character.Class.Mage;
import character.Class.Rogue;
import character.Class.Warrior;

public class Player extends Character {
    public int xp;
    private int hpPotions =3;

   public Player(String name, String playerClass){
       super(name, playerClass);
       this.level = 1;
       rollStats();
       this.curHp = maxHp;
   }

   public String useHealthpotion(){
       if(hpPotions >= 1){
           this.setCurHp(this.getCurHp() + 25);
           hpPotions --;
           return hpPotions + " potions left.";
       }else{
           return "No Potions to use.";
       }
   }

   public int getHealthpotions(){return hpPotions;}
   public void setHealthPotions(int newHpPotions){hpPotions = newHpPotions;}
   public int gainXp(Character other){
       int x = other.getLevel();
       int gainedXp = x * (int) (Math.random()*(60-21)+20);
       xp += gainedXp;
       return gainedXp;
   }
   public boolean checkXp(){
       if(xp>= level *40){
           xp = xp -(level* 40);
           levelUp();

           return true;
       }else{
           return false;
       }
   }
   public String status(){return name + " has " + curHp +"/" + maxHp + " health.";}
   public String getXp(){return xp + "/" + (level+40);}
   public void rollStats(){
       double hp =0;
       double att =0;
       switch(roleToNumber()){
           case 1: hp= Warrior.hp; att=Warrior.att; break;
           case 2: hp= Rogue.hp; att=Rogue.att; break;
           case 3: hp= Mage.hp; att=Mage.att; break;
       }
       maxHp =(roll(6) + hp);
       maxAtt = (roll(6)+ att);
       minAtt =(maxAtt-3);
   }

   private int roll(int sides){
       int aRoll = (int)(Math.random()* sides +1);
       return aRoll;
   }

   private int roleToNumber(){
       if(playerClass.equalsIgnoreCase("Warrior")){
           return 1;
       }else if(playerClass.equalsIgnoreCase("Rogue")){
           return 2;
       }else if(playerClass.equalsIgnoreCase("Mage")){
           return 3;
       }else{
           return 0;
       }
   }

   public void levelUp(){
       level++;
       double hp=0;
       double att=0;
       switch (roleToNumber()){
           case 1: hp = Warrior.hp *1.25; att = Warrior.att * 1.25; break;
           case 2: hp = Rogue.hp *1.25; att = Rogue.att *1.25; break;
           case 3: hp= Mage.hp * 1.25; att=Mage.att *1.25; break;
       }
       maxHp += (hp* Math.random()/2 +.7);
       maxAtt += (att * Math.random()/2 + .7);
       minAtt = maxAtt-3;
       this.curHp = maxHp;
   }
}
