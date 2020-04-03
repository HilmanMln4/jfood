import java.util.Calendar;
import java.util.Date;
import java.util.*;
import java.text.*;
import java.util.regex.*;
import java.text.SimpleDateFormat;
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
        Location Rumah = new Location("Tangerang Selatan", "Banten", "Tempat tinggal");
        Seller Jaya = new Seller(123, "Hilman", "hilmanmaulana145@ymail.com", "083894243504", Rumah);
        /*Food Mekdi = new Food(444,"Ayam Bucket", 75000, FoodCategory.Western, Jaya);
        Food Kfc = new Food(445, "French Fries", 20000, FoodCategory.Western, Jaya);
        Promo diskon = new Promo (111, "Post Test dapet 100", 50000, 50000, true);
        Customer Niko = new Customer(456, "Niko", "Nichooouiacid", "99999999", new GregorianCalendar(2019,02,20));
        Customer Nika = new Customer(457, "Nika", "nikaaa@ui.ac.id", "Hehehe12456", 2019, 02, 19);
        Customer Niki = new Customer(458, "Niki", "nikiii@ui.ac.id", "Hehehe12567");*/
        
        /*DatabaseSeller.addSeller(new Seller(66, "Hilman", "ilmanmaulana145@ymail.com", "087654321899", Rumah));
        Calendar calendar = new GregorianCalendar(2020, 4, 2);
        DatabaseCustomer.addCustomer(new Customer(456, "Hilman", "hilman.maulana71@ui.ac.id", "99999999", calendar));
        DatabaseCustomer.addCustomer(new Customer(457, "Hilman", "hilman.maulana71@ui.ac.id", "Hehehe12456", 2020, 02, 19));
        DatabaseCustomer.addCustomer(new Customer(458, "Gilang", "gilang@ui.ac.id", "hehehe12567"));

        System.out.println("Daftar Customer: ");
        for (Customer customer : DatabaseCustomer.getCustomerDatabase()) {
            System.out.println(customer.getName());
        }

        DatabaseFood.addFood(new Food(444, "Ayam Bucket", 75000, FoodCategory.Western, DatabaseSeller.getSellerById(DatabaseSeller.getLastId())));
        DatabaseFood.addFood(new Food(445,"French Fries", 20000, FoodCategory.Western, DatabaseSeller.getSellerById(DatabaseSeller.getLastId())));
        DatabaseFood.addFood(new Food(446, "Float", 10000, FoodCategory.Beverages, DatabaseSeller.getSellerById(DatabaseSeller.getLastId())));

        System.out.println("Daftar Western Food Category: ");
        for (Food food: DatabaseFood.getFoodByCategory(FoodCategory.Western))
        {
            System.out.println(food.getName());
        }*/

        //DatabaseInvoice.addInvoice(new CashInvoice(DatabaseInvoice.getLastId()+1, DatabaseFood.getFoodDatabase(), DatabaseCustomer.getCustomerById(1), InvoiceStatus.Ongoing));
        //DatabaseInvoice.getInvoiceByCustomer(1);

        //DatabaseInvoice.addInvoice(new CashlessInvoice(DatabaseInvoice.getLastId()+1, DatabaseFood.getFoodDatabase(), DatabaseCustomer.getCustomerById(1), InvoiceStatus.Ongoing, DatabasePromo.getPromoById(1)));
        //DatabaseInvoice.getInvoiceByCustomer(1);

        DatabasePromo.addPromo(new Promo(DatabasePromo.getLastId() + 1, "Modul6", 20000, 75000, false));
        DatabasePromo.addPromo(new Promo(DatabasePromo.getLastId() + 1, "Modul6", 10000, 50000, true));

        System.out.println("\nDaftar Promo: ");
        for (Promo promo : DatabasePromo.getPromoDatabase())
        {
            System.out.println(promo.getCode());
        }

        ArrayList<Food> Mekdi = new ArrayList<>();
        Mekdi.add(DatabaseFood.getFoodById(3));
        ArrayList<Food> Kfc = new ArrayList<>();
        Kfc.add(DatabaseFood.getFoodById(1));
        Kfc.add(DatabaseFood.getFoodById(2));

        DatabaseInvoice.addInvoice(new CashInvoice(DatabaseInvoice.getLastId() + 1, Kfc, DatabaseCustomer.getCustomerById(1), 2000));
        for (Invoice invoice : DatabaseInvoice.getInvoiceByCustomer(1))
        {
            invoice.setTotalPrice();
        }
        DatabaseInvoice.addInvoice(new CashlessInvoice(DatabaseInvoice.getLastId() + 1, Mekdi, DatabaseCustomer.getCustomerById(1), DatabasePromo.getPromoById(DatabasePromo.getLastId())));
        for (Invoice invoice : DatabaseInvoice.getInvoiceByCustomer(1))
        {
            invoice.setTotalPrice();
        }

        System.out.println("\nDaftar Invoice: ");
        for (Invoice invoice : DatabaseInvoice.getInvoiceDatabase())
        {
            System.out.println(invoice.toString() + "\n");
        }

        for (Invoice invoice : DatabaseInvoice.getInvoiceByCustomer(1))
        {
            invoice.setInvoiceStatus(InvoiceStatus.Finished);
        }

        DatabaseInvoice.addInvoice(new CashlessInvoice(DatabaseInvoice.getLastId() + 1, Mekdi, DatabaseCustomer.getCustomerById(2), DatabasePromo.getPromoById(DatabasePromo.getLastId())));

        //CashlessInvoice cashless1 = new CashlessInvoice(1, DatabaseFood.getFoodDatabase(), DatabaseCustomer.getCustomerById(DatabaseCustomer.getLastId()));
        //System.out.println(cashless1.toString());
    }
}
