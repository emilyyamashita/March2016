
/**
 * NamedCow gives cows a personal name
 * 
 * @author (Emily Yamashita) 
 * @version (03/03/2016)
 */
public class NamedCow extends Cow
{
    private String myName;
    
    NamedCow(String type, String name, String sound){
        super(type, sound);
        myName = name;
    }
    
    public String getName(){
        return myName;
    }
}
