
/**
 * Cows have types and sounds
 * 
 * @author (Emily Yamashita) 
 * @version (03/03/2016)
 */
public class Cow implements Animal
{
   private String myType;
   private String mySound;
   
   Cow(String type, String sound) {
       myType = type;
       mySound = sound;
   }
   Cow(){
   }
   public String getSound(){
       return mySound;
   }
   public String getType(){
        return myType;
   }
}
