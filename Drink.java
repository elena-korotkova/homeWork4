import java.util.Iterator;

public class Drink extends HotDrink implements Comparable<Drink>,Iterator<String>{
    private int temperature;
    int index;

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


    @Override
    public boolean hasNext() {
        return index++<5;
    }

    @Override
    public String next() {
        String res="";
        switch(this.index){
            case 1: res = String.format("Вид напитка - %s",this.get_type());break;
            case 2: res = String.format("Наименование напитка - %s",this.get_name());break;
            case 3: res = String.format("Объем напитка - %d",this.get_volume());break;
            case 4: res = String.format("Температура напитка - %d",this.get_temperature());break;
            case 5: res = String.format("Цена напитка - %f",this.get_cost());break;
        }
        return res;
    }

    

    
}
