package java_oop.Units;

public class RobberBase extends BaseUnit{
    protected int amount_stolen; // сколько может всзять с крестьянина за 1 раз
    protected int max_stocks; // сколько может накопить

    public RobberBase(String name, float health, int max_health, int lives, float speed_move, int experience,
            int visibility, int calories,int amount_stolen, int max_stocks) {
        super(name, health, max_health, lives, speed_move, experience, visibility, calories);
        this.amount_stolen=amount_stolen;
        this.max_stocks=max_stocks;
    }

    public int GetDamage_stocks (int amount_stolen)
    {
        return max_stocks;
    }
    
}
