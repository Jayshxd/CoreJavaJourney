package oop.Small_RPG_Game_Project;

public class Archer extends Character{
    private final int ATTACK_XP = 20;
    private final int DEFEND_XP = 15;
    private final int SPECIAL_XP = 25;
    private short xp;
    public Archer(){
        super("Archer");

    }
    public Archer(String name){
        super(name);

    }
    @Override
    void attack(){
        super.attack();
        int DAMAGE = 20;
        System.out.println("Arrow Shot" + "Deals : "+ DAMAGE + "damage.");
        int increaseHealth = Math.min(this.getHealth() + 10, 100);
        this.setHealth(increaseHealth);
        increaseLevel(ATTACK_XP);
    }
    @Override
    void specialAbility(){
        super.specialAbility();
        int DAMAGE = 45;
        System.out.println("Multi Shot" + "Deals : "+ DAMAGE + "damage.");
        int increaseHealth = Math.min(this.getHealth() + 10, 100);
        increaseLevel(SPECIAL_XP);
    }
    @Override
    void defend(){
        super.defend();
        int DAMAGE = 5;
        System.out.println("Gets "+DAMAGE+" damage.");
        int curHealth = Math.max(this.getHealth()-DAMAGE,0);
        this.setHealth(curHealth);
        int increaseHealth = Math.min(this.getHealth() + 5, 100);
        System.out.println("Current Health : "+this.getHealth());
        increaseLevel(DEFEND_XP);

    }
    void increaseLevel(int damage){
        xpUp();
        short curXp = (short) (this.getXp()+damage);
        this.setXp((byte) curXp);
        if(this.getXp() >= 100){
            this.setXp((byte) 0);
            levelup();
        }
    }

}
