import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.*;
import java.text.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.regex.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

/**
 * Write a description of class CashInvoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CashInvoice extends Invoice
{
    // instance variables - replace the example below with your own
    private static final PaymentType PAYMENT_TYPE=PaymentType.Cash;
    int deliveryFee;

    /**
     * Constructor for objects of class CashInvoice
     */
    public CashInvoice(int id, ArrayList<Food> foods, Customer customer)
    {
        super(id, foods, customer);
    }

        /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public CashInvoice(int id, ArrayList<Food> foods, Customer customer, int deliveryFee)
    {
        super(id, foods, customer);
        this.deliveryFee=deliveryFee;
    }
    
    public PaymentType getPaymentType()
    {
        return PAYMENT_TYPE;
    }
    
    public int getDeliveryFee()
    {
        return deliveryFee;
    }
    
    public void setDeliveryFee(int deliveryFee)
    {
        this.deliveryFee=deliveryFee;
    }

    public void setTotalPrice() {
        for (int i = 0; i <= getFood().size(); i++) {
            if (deliveryFee > 0) {
                totalPrice = getFood().get(i).getPrice() + getDeliveryFee();
            } else {
                totalPrice = getFood().get(i).getPrice();
            }
        }
    }
    
     public String toString() {

        String string = "";
        for (int i = 0; i <= getFood().size(); i++) {

            if (deliveryFee == 0) {
                DateTimeFormatter tgl = DateTimeFormatter.ofPattern("dd MMMM yyyy");
                LocalDateTime now = LocalDateTime.now();
                string =
                        ("================INVOICE================" +
                                "\nID: " + super.getId() +
                                "\nFood: " + super.getFood().get(i).getName() +
                                "\nDate: " + tgl.format(now) +
                                "\nCustomer: " + super.getCustomer().getName() +
                                "\nTotal Price: " + getFood().get(i).getPrice() +
                                "\nStatus: " + super.getInvoiceStatus() +
                                "\nPayment Type: " + PAYMENT_TYPE + "\n");
            } else {
                DateTimeFormatter tgl = DateTimeFormatter.ofPattern("dd MMMM yyyy");
                LocalDateTime now = LocalDateTime.now();
                string =
                        ("================INVOICE================" +
                                "\nID: " + super.getId() +
                                "\nFood: " + super.getFood().get(i).getName() +
                                "\nDate: " + tgl.format(now) +
                                "\nCustomer: " + super.getCustomer().getName() +
                                "\nDeliveryFee : " + getDeliveryFee() +
                                "\nTotal Price: " + super.getTotalPrice() +
                                "\nStatus: " + super.getInvoiceStatus() +
                                "\nPayment Type: " + PAYMENT_TYPE + "\n");
            }
        }
        System.out.println(string);
        return string;
    }
}
