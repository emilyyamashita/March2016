
/**
 * Write a description of class Chick here.
 * 
 * @author (Emily Yamashita) 
 * @version (03/03/2016)
 */
public class Chick implements Animal
{
    private String myType;
    private String mySound;
    private String mySecondSound;
    
    Chick(String type, String sound){
        myType = type;
        mySound = sound;
    }
    Chick(String type, String sound, String secondSound){
        myType = type;
        mySound = sound;
        mySecondSound = secondSound;
    }
    Chick(){
    }
    public String getSound(){
        if(Math.random() < 0.5){
            return mySecondSound;
        }
        else{
            return mySound;
        }
    }
    public String getType(){
        return myType;
    }
    
}
