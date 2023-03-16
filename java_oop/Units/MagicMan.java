package java_oop.Units;

public class MagicMan extends BaseUnit{

    protected int power; // уровень магии

    public MagicMan(String name, float health, int max_health, int lives, float speed_move, int experience,
            int visibility, int calories, int power) {
        super(name, health, max_health, lives, speed_move, experience, visibility, calories);
        this.power=power;
    }
    
    public int GetDamage_lifes(){
        return power;
    }

    public int Add_lifes(){
        return power;
    }

}
