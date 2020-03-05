
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
        Location RSLahir = new Location("RS Fatmawati", "Jakarta", "Tempat lahir");
        Seller Jaya = new Seller(123, "Hilman", "hilmanmaulana145@ymail.com", "083894243504", RSLahir);
        Food Mekdi = new Food(444,"Ayam", 35000, FoodCategory.Beverages, Jaya);
        Customer Niko = new Customer(456, "Niko", "nikooo@email.com", "hehehe123", "04032019");
        Invoice Bayar = new Invoice(444, 555, "28 Februari 2019", Niko, 35000);
        System.out.println(Jaya.getName());
        Jaya.setName("Gilang");
        System.out.println(Jaya.getName());
        Mekdi.printData();
    }
}
