public abstract class HotDrink{
    private String type;
    private String name;
    private double cost;
    private int volume;


    public String get_name(){return this.name;}
    public void set_name(String name){this.name = name;}
    public String get_type(){return this.type;}
    public void set_type(String type){this.type = type;}
    public double get_cost(){return this.cost;};
    public void set_cost(double cost){this.cost=cost;};
    public int get_volume(){return this.volume;};
    public void set_volume(Integer volume){this.volume=volume;};

}