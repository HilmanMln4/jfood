import javax.xml.crypto.Data;
import java.util.Calendar;
import java.util.*;
import java.util.regex.*;
import java.text.*;

public class JFood
{
    public static void main(String[] args) throws SellerNotFoundException
    {

        //System.out.println("=====Invoice=====");
        Location lokasi = new Location("Tangerang Selatan", "Banten", "Rumah");
        Calendar calendar = new GregorianCalendar(2020, Calendar.SEPTEMBER, 16);

        DatabaseSeller.addSeller(new Seller(1, "Hilman", "hilman.maulana71@ui.ac.id", "085778772518", lokasi));
        DatabaseSeller.addSeller(new Seller(2, "Maulana", "hilmanmaulana71@ui.ac.id", "085778772518", lokasi));

        try {
            DatabasePromo.addPromo(new Promo(DatabasePromo.getLastId()+1, "Promo Modul 7", 20000, 75000, false));
            DatabasePromo.addPromo(new Promo(DatabasePromo.getLastId()+1, "Promo Modul 7", 10000, 50000, true));
        } catch (PromoCodeAlreadyExistsException x){
            System.out.println(x.getMessage());
        }

        try {
            DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1,"Ayam Bucket", 75000, FoodCategory.Western, DatabaseSeller.getSellerById(1)));
            DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1,"French Fries", 20000, FoodCategory.Western, DatabaseSeller.getSellerById(1)));
        } catch (SellerNotFoundException x){
            System.out.println(x.getMessage());
        }

        /*ArrayList<Food> Kfc = new ArrayList<Food>();
        ArrayList<Food> Aw = new ArrayList<Food>();*/

        ArrayList<Food> Mekdi = new ArrayList<Food>();
        try
        {
            Mekdi.add(DatabaseFood.getFoodById(1));
            Mekdi.add(DatabaseFood.getFoodById(2));
        }
        catch (FoodNotFoundException f)
        {
            System.out.println(f.getMessage());
        }

        try {
            DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId()+1,"Hilman M", "Hilman.m@ui.ac.id", "99999999", Calendar.getInstance()));
            //DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId()+1,"Hilman Mln", "Hilman.mln@ui.ac.id", "Hehehe12456", Calendar.getInstance()));
            DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId()+1,"Hilman Maulana", "Hilman.maulana@ui.ac.id", "8888888888"));
            DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId()+1,"Gilang", "gilang@ui.ac.id.com", "Hehehe78900"));
        } catch (EmailAlreadyExistsException x){
            System.out.println(x.getMessage());
        }

        try {
            DatabaseInvoice.removeInvoice(10);
        } catch (InvoiceNotFoundException i){
            System.err.println(i.getMessage());
        }

        try
        {
            DatabaseInvoice.addInvoice(new CashInvoice(1, Mekdi, DatabaseCustomer.getCustomerById(1), 10000));
            DatabaseInvoice.addInvoice(new CashInvoice(2, Mekdi, DatabaseCustomer.getCustomerById(2), 10000));
            //DatabaseInvoice.addInvoice(new CashlessInvoice(DatabaseInvoice.getLastId() + 1, Kfc, DatabaseCustomer.getCustomerById(3)));
            //DatabaseInvoice.addInvoice(new CashlessInvoice(DatabaseInvoice.getLastId() + 1, Kfc, DatabaseCustomer.getCustomerById(4)));
        }
        catch (CustomerNotFoundException | OngoingInvoiceAlreadyExistsException x)
        {
            System.out.println(x.getMessage());
        }

        System.out.println("\nList invoice:");
        for(Invoice invoice : DatabaseInvoice.getInvoiceDatabase()) {
            invoice.setTotalPrice();
            System.out.println(invoice);
            System.out.println();
        }

        try {
            DatabaseInvoice.removeInvoice(10);
        } catch (InvoiceNotFoundException i){
            System.err.println(i.getMessage());
        }
    }
}

