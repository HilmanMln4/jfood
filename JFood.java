import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.regex.*;
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
        /*Location RSLahir = new Location("RS Fatmawati", "Jakarta", "Tempat lahir");
        Seller Jaya = new Seller(123, "Hilman", "hilmanmaulana145@ymail.com", "083894243504", RSLahir);
        Food Mekdi = new Food(444,"Ayam Bucket", 75000, FoodCategory.Western, Jaya);
        Food Kfc = new Food(445, "French Fries", 20000, FoodCategory.Western, Jaya);
        Promo diskon = new Promo (111, "Post Test dapet 100", 50000, 50000, true);*/
        Customer Niko = new Customer(456, "Niko", "Nichooouiacid", "99999999", new GregorianCalendar(2019,02,20));
        Customer Nika = new Customer(457, "Nika", "nikaaa@ui.ac.id", "Hehehe12456", 2019, 02, 19);
        Customer Niki = new Customer(458, "Niki", "nikiii@ui.ac.id", "Hehehe12567");
        
       
        System.out.println(Niko.toString());
        System.out.println(Nika.toString());
        System.out.println(Niki.toString());
        /*CashInvoice a=new CashInvoice(1, Mekdi, "1-1-2020", Niko, 5000, InvoiceStatus.Finished)*/
        /*CashlessInvoice TapCash = new CashlessInvoice(222, Mekdi, "12 Maret 2020", Niko, InvoiceStatus.Ongoing);
        CashlessInvoice eMoney = new CashlessInvoice(333, Kfc, "12 Maret 2020", Niko, InvoiceStatus.Ongoing, diskon);
        CashlessInvoice Flazz = new CashlessInvoice(444, Mekdi, "12 Maret 2020", Niko, InvoiceStatus.Ongoing, diskon);
        //Invoice Bayar = new Invoice(444, Mekdi.getId(), "28 Februari 2019", Niko, Mekdi.getPrice(), InvoiceStatus.Finished);*/
        /*CashInvoice rupiah = new CashInvoice(1, Mekdi, "13 Maret 2020", Niko, InvoiceStatus.Finished);
        CashInvoice rupiaah = new CashInvoice(2, Kfc, "13 Maret 2020", Niko, InvoiceStatus.Finished, 5000);
        rupiah.setTotalPrice();
        rupiaah.setTotalPrice();
        rupiah.printData();
        rupiaah.printData();*/
        /*TapCash.setTotalPrice();
        eMoney.setTotalPrice();
        Flazz.setTotalPrice();
        TapCash.printData();
        eMoney.printData();
        Flazz.printData();*/
    }
}
