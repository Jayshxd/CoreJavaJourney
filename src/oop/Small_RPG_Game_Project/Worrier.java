package oop.Small_RPG_Game_Project;

public class Worrier extends Character {
    private short xp;
    private final int ATTACK_XP = 15;
    private final int DEFEND_XP = 10;
    private final int SPECIAL_XP = 20;


    Worrier(){
        super("Worrier");
    }

    Worrier(String name) {
        super(name);
    }

    @Override
    void attack() {
        super.attack();
        int DAMAGE = 30;
        System.out.println("Sword Slash "+"Deals : "+ DAMAGE + "damage.");
        int increaseHealth = this.getHealth()+ 10;
        this.setHealth(increaseHealth);
        increaseLevel(ATTACK_XP);

    }
    void increaseLevel(int damage){
        xpUp();
        short curXp = (short) (this.getXp()+damage);
        this.setXp((byte) curXp);
        if(this.getXp() >= 100){
            xp = 0;
            levelup();
        }
    }

    void defend(){
        int DAMAGE = 5;
        System.out.println(this.getName()+" Defends and gets "+DAMAGE+" damage.");
        int curHealth = Math.max(this.getHealth() - DAMAGE, 0);
        this.setHealth(curHealth);
        System.out.println("Current Health : "+this.getHealth());
        increaseLevel(DEFEND_XP);
    }

    @Override
    void specialAbility(){
        int DAMAGE = 45;
        super.attack();
        super.specialAbility();
        System.out.println("Power Strike "+"Deals : "+ DAMAGE + "damage.");
        increaseLevel(SPECIAL_XP);
    }


}
