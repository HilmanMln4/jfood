
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
        Seller Hilman = new Seller(123, "Hilman", "hilmanmaulana145@ymail.com", "083894243504", Jakarta);
        Customer Niko = new Customer(456, "Niko", "nikooo@email.com", "hehehe123", "04032019");
        Jakarta.printData();
        
    }
}
