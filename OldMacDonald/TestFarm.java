
/**
 * Write a description of class TestFarm here.
 * 
 * @author (Emily Yamashita) 
 * @version (03/03/2016)
 */
public class TestFarm
{
    public static void main(String[] args)
    {
        Cow c = new Cow("cow", "moo");
        System.out.println( c.getType() + " goes " + c.getSound());
        
        Chick ch = new Chick("chick", "cheep", "cluck");
        System.out.println(ch.getType() + " goes " + ch.getSound());
        
        Pig p = new Pig("pig", "oink");
        System.out.println(p.getType() + " goes " + p.getSound());
    }
}
