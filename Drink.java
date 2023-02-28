public class Drink extends HotDrink  implements Comparable<Drink>{
    private int temperature;

    public Drink(String type,String name,int volume,double cost,int temperature){
        super.set_type(type);
        super.set_name(name);
        super.set_volume(volume);
        super.set_cost(cost);
        this.set_temperature(temperature);
    }

    public void set_temperature(int temperature)
    {
        this.temperature = temperature;
    }

    public int get_temperature()
    {
        return this.temperature;
    }

  

    @Override
    public int compareTo(Drink drink) {
        int res=0;
        if(this.get_type()==drink.get_type() && this.get_name()==drink.get_name() && this.get_volume() == drink.get_volume() && this.get_cost() == drink.get_cost())
        {
            res=1;
        }
        return res;
    }
    
}
