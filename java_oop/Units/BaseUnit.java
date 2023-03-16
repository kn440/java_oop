package java_oop.Units;

public class BaseUnit {
    
    protected String name;	// название роли
    protected float health;	 //текущий уровень здоровья
    protected int max_health;	//максимальное значение здоровья
    protected int lives;	//количество жизней
    protected float speed_move;	//скорость передвижения
    protected int experience;	//опыт (влияние на поведение)
    protected int visibility;	//видимость (с какого растояния может быть нанесен урон)
    protected int calories; //текущее значение калорий влияет на здоровье

    public BaseUnit (String name, float health, int max_health, int lives, float speed_move, int experience, int visibility, int calories)
    {
        this.name=name;
        this.health=health;
        this.max_health=max_health;
        this.lives=lives;
        this.speed_move=speed_move;
        this.experience=experience;
        this.visibility=visibility;
        this.calories=calories;

    }

    public float Move()
    {
        return speed_move;
    }
    public float Losing_health()
    {
        return health;
    }
    public float Add_health()
    {
        return health;
    }
    public int Get_calories()
    {
        return calories;
    }
    
}
