package oop.Small_RPG_Game_Project;

public class Worrior extends Character {

    Worrior(String name) {
        super(name);
    }

    @Override
    void attack() {
        super.attack();
        int DAMAGE = 25;
        System.out.println("Sword Slash "+"Deals : "+ DAMAGE + "damage.");
        int increaseHealth = getHealth()+ 10;
        this.setHealth(increaseHealth);
    }

    void defend(){
        int DAMAGE = 5;
        System.out.println(this.getName()+" Defends and gets "+DAMAGE+" damage.");
        int curHelth = this.getHealth() - DAMAGE;
        this.setHealth(curHelth);
        System.out.println("Current Health : "+this.getHealth());
    }

    @Override
    void specialAbility(){
        int DAMAGE = 45;
        super.attack();
        super.specialAbility();
        System.out.println("Power Strike "+"Deals : "+ DAMAGE + "damage.");
    }


}
