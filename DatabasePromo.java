import java.util.ArrayList;
import java.lang.reflect.Array;
/**
 * Write a description of class DatabasePromo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabasePromo
{
    // instance variables - replace the example below with your own
    private static int lastId=0;
    private static ArrayList<Promo> PROMO_DATABASE;

    /**
     * Constructor for objects of class DatabaseCustomer
     */
    public static ArrayList<Promo> getPromoDatabase()
    {
        return PROMO_DATABASE;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static int getLastId()
    { 
        return lastId;
    }
    
    public static Promo getPromoById(int id)
    {
        for(Promo promo : PROMO_DATABASE)
        {
                if(promo.getId()==id)
                {
                    return promo;
                }
        }
        return null;
        
    }
    
    public static Promo getPromoByCode(String code)
    {
        for(Promo promo : PROMO_DATABASE)
        {
                if(promo.getCode()==code)
                {
                    return promo;
                }
        }
        return null;
    }
    
    public boolean addPromo(Promo promo)
    {
        PROMO_DATABASE.add(promo);
        lastId = promo.getId();
        return true;
    }
    
    public boolean activatePromo(int id)
    {
        for (Promo promo : PROMO_DATABASE) {
            if (!promo.getActive()) {
                promo.setActive(true);
                return true;
            }
        }
        return false;
    }
    
    public boolean deactivatePromo(int id)
    {
        for (Promo promo : PROMO_DATABASE) {
            if (promo.getActive()) {
                promo.setActive(false);
                return true;
            }
        }
        return false;
    }
    
    public boolean removePromo(int id)
    {
        for(int i = 0; i < PROMO_DATABASE.size(); i++){
            Promo promo = PROMO_DATABASE.get(i);
            if (promo.getId() == id){
                PROMO_DATABASE.remove(i);
                return true;
            }
        }
        return false;
    }
}
