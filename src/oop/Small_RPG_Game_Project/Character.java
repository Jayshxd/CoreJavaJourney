package oop.Small_RPG_Game_Project;

public class Character {
    private String name;
    private int health;
    private int level;
     int impact;
    private  int damage;

    Character(){
        this.name = "unknown";
        this.health = 100;
        this.level = 1;
    }
    Character(String name){
        this.name = name;
        this.health = 100;
        this.level = 1;
    }
    void defend(int impact){
        this.health -= this.impact;
    }
    void levelup(){
        this.level++;
    }
    void attack(){
        System.out.println(this.name + "attacks");
    }
    void specialAbility(){
        System.out.println(this.name + "uses special abilitiy");
    }

    public int getHealth(){
        return this.health;
    }
    public String getName(){
        return this.name;
    }
    public int getLevel(){
        return this.level;
    }
    public void setHealth(int health){
        this.health = health;
    }
}
