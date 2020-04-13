import javax.xml.crypto.Data;
import java.util.Calendar;
import java.util.*;
import java.util.regex.*;
import java.text.*;

public class JFood
{
    public static void main(String[] args)
    {

        System.out.println("=====Invoice=====");
        Location lokasi = new Location("Tangerang Selatan", "Banten", "Rumah");

        ArrayList<Food> Mekdi = new ArrayList<Food>();
        ArrayList<Food> Kfc = new ArrayList<Food>();
        ArrayList<Food> Aw = new ArrayList<Food>();

        try
        {
            Mekdi.add(DatabaseFood.getFoodById(1));
            Kfc.add(DatabaseFood.getFoodById(2));
            Aw.add(DatabaseFood.getFoodById(3));
        }
        catch (FoodNotFoundException f)
        {
            System.err.println(f.getMessage());
        }

        try
        {
            DatabaseInvoice.addInvoice(new CashInvoice(DatabaseInvoice.getLastId() + 1, Mekdi, DatabaseCustomer.getCustomerById(1), 10000));
            DatabaseInvoice.addInvoice(new CashInvoice(DatabaseInvoice.getLastId() + 1, Mekdi, DatabaseCustomer.getCustomerById(2), 10000));
            //DatabaseInvoice.addInvoice(new CashlessInvoice(DatabaseInvoice.getLastId() + 1, Kfc, DatabaseCustomer.getCustomerById(3)));
            //DatabaseInvoice.addInvoice(new CashlessInvoice(DatabaseInvoice.getLastId() + 1, Kfc, DatabaseCustomer.getCustomerById(4)));
        }
        catch (CustomerNotFoundException | OngoingInvoiceAlreadyExistsException x)
        {
            System.err.println(x.getMessage());
        }

        try {
            DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId()+1,"Hilman M", "Hilman.m@ui.ac.id", "99999999", Calendar.getInstance()));
            DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId()+1,"Hilman Mln", "Hilman.mln@ui.ac.id", "Hehehe12456", Calendar.getInstance()));
            DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId()+1,"Hilman Maulana", "Hilman.maulana@ui.ac.id", "8888888888", Calendar.getInstance()));
            DatabaseCustomer.addCustomer(new Customer(DatabaseCustomer.getLastId()+1,"HilmanMln", "Hilmanmln@ui.ac.id.com", "Hehehe78900", Calendar.getInstance()));
        } catch (EmailAlreadyExistsException x){
            System.err.println(x.getMessage());
        }

        try {
            DatabasePromo.addPromo(new Promo(DatabasePromo.getLastId()+1, "Promo Modul 7", 20000, 75000, false));
            DatabasePromo.addPromo(new Promo(DatabasePromo.getLastId()+1, "Promo Modul 7", 10000, 50000, true));

        } catch (PromoCodeAlreadyExistsException x){
            System.err.println(x.getMessage());
        }

        try {
            DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1,"Ayam Bucket", 75000, FoodCategory.Western, DatabaseSeller.getSellerById(1)));
            DatabaseFood.addFood(new Food(DatabaseFood.getLastId()+1,"French Fries", 20000, FoodCategory.Western, DatabaseSeller.getSellerById(1)));
        } catch (SellerNotFoundException x){
            System.err.println(x.getMessage());
        }

        try {
            DatabaseCustomer.removeCustomer(3);
        } catch (CustomerNotFoundException x){
            System.err.println(x.getMessage());
        }

        try {
            DatabasePromo.removePromo(4);
        } catch (PromoNotFoundException x){
            System.err.println(x.getMessage());
        }

        try {
            DatabaseFood.removeFood(5);
        } catch (FoodNotFoundException x){
            System.err.println(x.getMessage());
        }

        System.out.println("=====INPUT DATABASE PROMO=====");

        for(Promo promo : DatabasePromo.getPromoDatabase()){
            System.out.println(promo.toString());
        }

        try {
            DatabaseInvoice.removeInvoice(10);
        } catch (InvoiceNotFoundException i){
            System.err.println(i.getMessage());
        }

    }
}