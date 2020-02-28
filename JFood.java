
/**
 * Write a description of class JFood here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JFood
{
    public static void main(String[] args)
    {
        Location Jakarta = new Location("Tangsel", "Banten", "Rumah");
        System.out.println(Jakarta.getDescription());
        Seller Hilman = new Seller(123, "Hilman", "hilmanmaulana145@ymail.com", "083894243504", Jakarta);
        System.out.println(Hilman.getEmail());
        Customer Niko = new Customer(456, "Niko", "nikooo@email.com", "hehehe123", "04032019");
        System.out.println(Niko.getName());
        
    }
}
