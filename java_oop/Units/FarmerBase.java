package java_oop.Units;

public class FarmerBase extends BaseUnit{

    protected int harvesting_speed; //скорость сбора урожая
    protected float volume_stocks; // запасы

    public FarmerBase(String name, float health, int max_health, int lives, float speed_move, int experience,
            int visibility, int calories, int harvesting_speed, float volume_stocks) {
        super(name, health, max_health, lives, speed_move, experience, visibility, calories);
        this.harvesting_speed=harvesting_speed;
        this.volume_stocks=volume_stocks;
    }
    
    public float Harvesting (int harvesting_speed)
    {
        return volume_stocks;
    }
    
}
