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
    void attack(int damage){
        System.out.println(this.name + "attacks and deals "+this.damage );
    }
}
