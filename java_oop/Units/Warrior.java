package java_oop.Units;

public class Warrior extends BaseUnit{
    protected int damage; // сила удара
    public Warrior(String name, float health, int max_health, int lives, float speed_move, int experience,
            int visibility, int calories, int damage) {
        super(name, health, max_health, lives, speed_move, experience, visibility, calories);
        this.damage=damage;
    }
    public int GetDamage_health(){
        return damage;
    }
    

    
}
