import java.util.ArrayList;
import java.lang.reflect.Array;
/**
 * Write a description of class DatabaseSeller here.
 *
 * @author Hilman Maulana 1706985975
 * @version 28 Februari 2020
 */
public class DatabaseSeller
{
    // instance variables - replace the example below with your own
    private static int lastId = 0;
    private static ArrayList<Seller> SELLER_DATABASE = new ArrayList<Seller>();
    //private static String[] listSeller;

    /**
     * Constructor for objects of class DatabaseSeller
     */
    
    public static ArrayList<Seller> getSellerDatabase()
    {
        return SELLER_DATABASE;
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
    
    public static Seller getSellerById(int id)
    {
        for(Seller seller : SELLER_DATABASE)
        {
                if(seller.getId()==id)
                {
                    return seller;
                }
        }
        return null;
    }
    
    public static boolean addSeller(Seller seller)
    {
        SELLER_DATABASE.add(seller);
        lastId = seller.getId();
        return true;
    }
    
    public static boolean removeSeller(int id)
    {
        for(int i = 0; i < SELLER_DATABASE.size(); i++){
            Seller seller = SELLER_DATABASE.get(i);
            if (seller.getId() == id){
                SELLER_DATABASE.remove(i);
                return true;
            }
        }
        return false;
    }
}
